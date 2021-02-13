package generics;

public class DistanceInMeter extends Distance {

    public DistanceInMeter(double distance) {
        super(distance);
    }

    @Override
    double getInMeter() {
        return 0;
    }

    public double getDistance() {
        return distance;
    }
}
