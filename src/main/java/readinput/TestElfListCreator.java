package readinput;

import elf.Elf;

import java.util.ArrayList;

public class TestElfListCreator {
    public static void main(String[] args) {
        ArrayList<Elf> happyElves;
        try {
            ElfListCreator elc = new ElfListCreator("src/main/resources/input.txt");
            happyElves = elc.scanFileForElfFood();
            System.out.println(happyElves.size());
            for (Elf larryProbably: happyElves) {
                System.out.println(larryProbably.addUpCaloriesInMeal());
            }
            System.out.println("You have reached the end of the test");
        } catch (Exception e) {
            System.out.println("Test failed");
        }

    }
}
