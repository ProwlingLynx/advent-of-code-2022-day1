package solutionrunner;

import elfservices.ElfServices;
import readinput.ElfListCreator;

import java.util.ArrayList;
import elf.Elf;

public class solution {
    public static void main(String[] args) {
        try {
            ElfListCreator elc = new ElfListCreator("src/main/resources/puzzleInput.txt");
            ArrayList<Elf> elves = elc.scanFileForElfFood();
            int mostCaloricMeal = ElfServices.getMostCaloricLunchTotal(elves);
            System.out.println(mostCaloricMeal);
        } catch (Exception e) {
            System.out.println("Something went wrong again");
        }


    }
}
