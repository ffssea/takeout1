package org.example.takeout1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.takeout1.entity.SetmealDish;
import org.example.takeout1.mapper.SetmealDishMapper;
import org.example.takeout1.service.SetmealDishService;
import org.example.takeout1.service.SetmealService;
import org.springframework.stereotype.Service;

@Service
public class SetmealDishServiceImpl extends ServiceImpl<SetmealDishMapper, SetmealDish> implements SetmealDishService {
}
