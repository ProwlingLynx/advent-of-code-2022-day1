package elfservices;

import elf.Elf;

import java.util.ArrayList;
import java.util.Collections;

public final class ElfServices {
    private ElfServices(){}

    public static int getMostCaloricLunchTotal (ArrayList<Elf> elves) {
        int mostCaloricLunch = 0;
        for (Elf elf: elves) {
            mostCaloricLunch = Math.max(mostCaloricLunch, elf.addUpCaloriesInMeal());
        }
        return mostCaloricLunch;
    }

    public static int[] getTopThreeCaloricLunches (ArrayList<Elf> elves) {
        int[] topThreeLunches = new int[3];
        Collections.sort(elves);
        int length = elves.size();
        topThreeLunches[0] = elves.get(length - 1).addUpCaloriesInMeal();
        topThreeLunches[1] = elves.get(length - 2).addUpCaloriesInMeal();
        topThreeLunches[2] = elves.get(length - 3).addUpCaloriesInMeal();
        return topThreeLunches;
    }
}
