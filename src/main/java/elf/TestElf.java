package elf;

public class TestElf {
    public static void main(String[] args) {

        Elf larry = new Elf();
        larry.addMealItemToLunch(1000);
        larry.addMealItemToLunch(2000);
        larry.addMealItemToLunch(300);
//        Expect total to be an Integer object with value 3300
        System.out.println(larry.addUpCaloriesInMeal());
    }
}
