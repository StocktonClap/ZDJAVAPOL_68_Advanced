package generics;

public class DistanceApp {
    public static void main(String[] args) {
        // Ograniczanie typów parametrów generycznych powoduje, że możemy utworzyć tylko klasy
        // z typów pochodnych po Distance
         UniversalDistanceConverter<Distance, DistanceInMeter> distanceConverter = new UniversalDistanceConverter();
         UniversalDistanceConverter<Distance, Distance> distanceConverter1 = new UniversalDistanceConverter<>();
    }
}
