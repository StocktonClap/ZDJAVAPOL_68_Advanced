package generics;
// klasa implementuje interfejs generyczny z podanymi typami parametrów !!!
public class DistanceConverter implements Converter<DistanceInMeter, DistanceInMile>  {

    @Override
    public DistanceInMile convert(DistanceInMeter value) {
        return new DistanceInMile(value.getDistance() / 1.8);
    }
}
