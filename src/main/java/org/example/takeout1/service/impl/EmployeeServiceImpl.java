package org.example.takeout1.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.takeout1.entity.Employee;
import org.example.takeout1.mapper.EmployeeMapper;
import org.example.takeout1.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
