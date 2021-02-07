package homework.task1;

import java.time.LocalDate;

public class Heroes extends Person{

    final String specialAbility;

    public Heroes(String name, LocalDate birthDate, String specialAbility) {
        super(name, birthDate);
        this.specialAbility = specialAbility;
    }

    @Override
    public String toString() {
        return "Bohater: " +name +" urodzony " +birthDate + "\n" +
                "Special ability: " +specialAbility;
    }
}
