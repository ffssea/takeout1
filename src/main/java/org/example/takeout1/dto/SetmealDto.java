package org.example.takeout1.dto;

import lombok.Data;
import org.example.takeout1.entity.Setmeal;
import org.example.takeout1.entity.SetmealDish;

import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
