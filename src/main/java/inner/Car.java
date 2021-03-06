package inner;
/**
 * Klasa wewnętrzna statyczna - zagnieżdżona
  */
public class Car {
    private Radio radio;
    private int power;

    public Radio getRadio() {
        return radio;
    }

    public void setRadio(Radio radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Car{" +
                "radio=" + radio +
                '}';
    }

    public static class Radio{
       private int price;

       public Radio(int price) {
           this.price = price;
       }

       @Override
       public String toString() {
           return "Radio{" +
                   "price=" + price +
                   '}';
       }
   }
}
