package elf;

import java.util.ArrayList;

public class Elf implements Comparable{
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
    @Override
    public int compareTo(Object o1) {
        if (o1 instanceof Elf) {
            Elf  elf = (Elf) o1;
            return this.addUpCaloriesInMeal() - elf.addUpCaloriesInMeal();
        }

        return -1;
    }
}
