package generics;
// T extends Distance, R extends Distance -->> OGRANICZANIE TYPÓW!

/*Dokończymy klasę po omówieniu interfejsów funkcyjnych !!!
* @param <T> - klasa długości w jednostce źródłowej
* @param <R> - klasa długości w jednostce docelowej
*/
public class UniversalDistanceConverter<T extends Distance, R extends Distance> implements Converter<T, R>  {

    @Override
    public R convert(T value) {
        // Niestety nie możemy wywołać konstruktora dla typu parametrycznego
        // return new R(new DistanceInMeter(value.getInMeter()));
        return null;
    }
}

