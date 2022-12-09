package elf;

import java.util.ArrayList;

public class Elf {
    private final ArrayList<Integer> lunch = new ArrayList<>();

    public void addMealItemToLunch (int meal) {
        lunch.add(meal);
    }

    public Integer addUpCaloriesInMeal() {
        Integer calorieTotal = 0;
        for(Integer mealCalories : lunch){
            calorieTotal += mealCalories;
        }
        return calorieTotal;
    }
}
