package org.example.takeout1.common;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping("/common")
@Slf4j
public class CommonController {

    @Value("${reggie.path}")
    private String basePath;

    @PostMapping("/upload")
    public R<String> upload(MultipartFile file) {
        log.info("正在执行：上传文件");

        File dir = new File(basePath);
        if (!dir.exists()) {
            dir.mkdirs();
        }

        String originFilename = file.getOriginalFilename();

        String fileName = UUID.randomUUID().toString();
        assert originFilename != null;
        String suffix = originFilename.substring(originFilename.lastIndexOf("."));

        try {
            file.transferTo(new File(basePath + fileName + suffix));
        } catch (IOException ex) {
            ex.printStackTrace();
        }


        return R.success(fileName + suffix);
    }

    @GetMapping("/download")
    public void download(String name, HttpServletResponse response) {
        log.info("正在执行：下载资源：{}", name);
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(basePath + name));
            ServletOutputStream outputStream = response.getOutputStream();
            response.setContentType("image/*");
            int len = 0;
            byte[] bytes = new byte[1024];
            while ((len = fileInputStream.read(bytes)) != -1) {
                outputStream.write(bytes, 0, len);
                outputStream.flush();
            }
            outputStream.close();
            fileInputStream.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


}
