package elfservices;

import elf.Elf;

import java.util.ArrayList;

public final class ElfServices {
    private ElfServices(){}

    public static int getMostCaloricLunchTotal (ArrayList<Elf> elves) {
        int mostCaloricLunch = 0;
        for (Elf elf: elves) {
            mostCaloricLunch = Math.max(mostCaloricLunch, elf.addUpCaloriesInMeal());
        }
        return mostCaloricLunch;
    }
}
