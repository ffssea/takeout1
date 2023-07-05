package org.example.takeout1.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.example.takeout1.entity.Category;

@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}
