package exceptions;

public class Car {
    final double  capacity;
    double level;

    public Car(double capacity) {
        this.capacity = capacity;
    }

    public void refuel (double fuel) {
        if (fuel < 0){
            throw new IllegalArgumentException("Ujemna wartość paliwa !!!");
        }
        if (fuel + level > capacity) {
            throw new IllegalArgumentException("Za dużo paliwa do zatankowania" + (capacity - fuel - level));
        }
        level += fuel;
    }

    /**  KOMENTARZ DOKUMENTACYJNY
     * metoda zgłasza własne wyjątki
     * @param fuel poziom zyżytego paliwa
     */
    public void consume (double fuel) throws InvalidFuelLevelException{
        if (0 > fuel) {
            throw new InvalidFuelLevelException(fuel, "Ujemny poziom paliwa. Musi być dodatni.");
        }
        if (fuel > level) {
            throw new InvalidFuelLevelException(fuel, "Nie można zatankować paliwa ponad stan.");
        }
        level -= fuel;
    }

    public double getLevel() {
        return level;
    }

}
