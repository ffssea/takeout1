package org.example.takeout1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.takeout1.entity.Orders;

@Mapper
public interface OrderMapper extends BaseMapper<Orders> {
}
