package org.example.takeout1.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.example.takeout1.dto.SetmealDto;
import org.example.takeout1.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {

    public void saveWithDish(SetmealDto setmealDto);

    public void removeWithDish(List<Long> ids);
}
