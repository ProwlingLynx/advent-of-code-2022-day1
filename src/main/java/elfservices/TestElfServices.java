package elfservices;

import elf.Elf;
import readinput.ElfListCreator;

import java.util.ArrayList;
public class TestElfServices {
    public static void main(String[] args) {
        try {
            ElfListCreator elc = new ElfListCreator("src/main/resources/input.txt");
            ArrayList<Elf> elves = elc.scanFileForElfFood();
            int mostCaloricLunch = ElfServices.getMostCaloricLunchTotal(elves);
//            Expect this to be 24000
            System.out.println(mostCaloricLunch);
            System.out.println("End of test");
        } catch (Exception e) {

            System.out.println("Test Failed");
        }
        try {
            ElfListCreator elc = new ElfListCreator("src/main/resources/input.txt");
            ArrayList<Elf> elves = elc.scanFileForElfFood();
            int topThree = ElfServices.getTopThreeCaloricLunches(elves);
            System.out.println(topThree);
            for(Elf e: elves) {
                e.display();
                System.out.println(e.addUpCaloriesInMeal());
            }
            System.out.println("End of test");
        } catch (Exception e) {
            System.out.println("Test failed");
        }
    }
}
