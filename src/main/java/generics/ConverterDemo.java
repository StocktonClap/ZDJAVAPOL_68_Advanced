package generics;

public class ConverterDemo {
    public static void main(String[] args) {
        Converter<DistanceInMeter, DistanceInMile> converter = new DistanceConverter();
        converter.convert(new DistanceInMeter(300));

    }
}
