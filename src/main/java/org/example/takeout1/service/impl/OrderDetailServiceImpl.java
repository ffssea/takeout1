package org.example.takeout1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.takeout1.entity.OrderDetail;
import org.example.takeout1.entity.Orders;
import org.example.takeout1.mapper.OrderDetailMapper;
import org.example.takeout1.mapper.OrderMapper;
import org.example.takeout1.service.OrderDetailService;
import org.example.takeout1.service.OrderService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {
}
