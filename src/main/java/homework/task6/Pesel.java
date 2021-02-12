package homework.task6;

// DO ZROBIENIA

public class Pesel {
    final String pesel;


    public Pesel(String pesel) {
        this.pesel = pesel;
    }

    public static Pesel of (String pesel) {
        return new Pesel(pesel);
    }

    public String birthDate () {
        return null;
    }

    public String get () {
        return pesel;
    }

    public boolean isMale () {
        return true;
    }

    public boolean isFemale () {
        return true;
    }
}
