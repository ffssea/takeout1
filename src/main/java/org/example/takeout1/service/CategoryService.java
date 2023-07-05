package org.example.takeout1.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.example.takeout1.entity.Category;

public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}
