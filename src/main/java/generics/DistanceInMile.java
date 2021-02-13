package generics;

public class DistanceInMile extends Distance {


    public DistanceInMile(double distance) {
        super(distance);
    }

    public DistanceInMile (DistanceInMeter meters) {
        super(meters.getDistance() / 0.000621371192);
    }

    @Override
    double getInMeter() {
        return 0;
    }

    public double getDistance() {
        return distance * 0.000621371192;
    }
}
