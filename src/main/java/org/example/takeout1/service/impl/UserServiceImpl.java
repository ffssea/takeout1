package org.example.takeout1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.example.takeout1.entity.User;
import org.example.takeout1.mapper.UserMapper;
import org.example.takeout1.service.UserService;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
