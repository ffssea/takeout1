package org.example.takeout1.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.example.takeout1.dto.DishDto;
import org.example.takeout1.entity.Dish;

public interface DishService extends IService<Dish> {
    //    新增菜品，插入口味表
    public void saveWithFlavor(DishDto dishDto);

    public DishDto getByIdWithFlavor(Long id);

    public void updateWithFlavor(DishDto dishDto);

}
