package readinput;

import elf.Elf;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class ElfListCreator {
    private Scanner scanner;

    public ElfListCreator(String fileLocation) throws FileNotFoundException{
        File textFile = new File(fileLocation);
        this.scanner = new Scanner(textFile);
    }

    public ArrayList<Elf> scanFileForElfFood() {
        ArrayList<Elf> listOfElves = new ArrayList<>();
        Elf hungryElf = new Elf();
        while(scanner.hasNext()) {
            try {
                String input = scanner.nextLine();
                int mealCalories = Integer.parseInt(input);
                hungryElf.addMealItemToLunch(mealCalories);
            } catch (Exception e) {
//              Expect Whitespaces to throw errors
                listOfElves.add(hungryElf);
                hungryElf = new Elf();
            }
        }
        return listOfElves;
    }

}
