package org.example.takeout1.dto;


import lombok.Data;
import org.example.takeout1.entity.Dish;
import org.example.takeout1.entity.DishFlavor;

import java.util.ArrayList;
import java.util.List;

@Data
public class DishDto extends Dish {

    private List<DishFlavor> flavors = new ArrayList<>();

    private String categoryName;

    private Integer copies;
}
