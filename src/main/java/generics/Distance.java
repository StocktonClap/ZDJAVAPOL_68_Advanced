package generics;
// OGRANICZANIE TYPÓW !!!
abstract public class Distance {

    final double distance;

    public Distance(double length) {
        this.distance = length;
    }

    abstract  double getInMeter ();
}
