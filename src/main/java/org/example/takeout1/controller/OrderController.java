package org.example.takeout1.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.takeout1.common.R;
import org.example.takeout1.entity.Orders;
import org.example.takeout1.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("order")
public class OrderController {
    @Autowired
    OrderService service;

    @PostMapping("/submit")
    public R<String> submit(@RequestBody Orders order) {

        return null;
    }
}
