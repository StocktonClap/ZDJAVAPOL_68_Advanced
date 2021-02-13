package generics;

public class Car {
    final String carProducer;
    final String model;
    final String type;
    final String color;
    final double engineCapacity;
    final double enginePower;


    public Car(String carProducer, String model, String type, String color, double engineCapacity, double enginePower) {
        this.carProducer = carProducer;
        this.model = model;
        this.type = type;
        this.color = color;
        this.engineCapacity = engineCapacity;
        this.enginePower = enginePower;
    }
}
