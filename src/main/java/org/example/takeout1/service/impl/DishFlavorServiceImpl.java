package org.example.takeout1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.takeout1.entity.DishFlavor;
import org.example.takeout1.mapper.DishFlavorMapper;
import org.example.takeout1.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl  extends ServiceImpl<DishFlavorMapper, DishFlavor> implements DishFlavorService {
}
