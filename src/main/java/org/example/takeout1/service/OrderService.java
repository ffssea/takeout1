package org.example.takeout1.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.example.takeout1.entity.Orders;

public interface OrderService extends IService<Orders> {

    public void submit(Orders orders);
}
