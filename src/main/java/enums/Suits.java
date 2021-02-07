package enums;

public enum Suits {
    SPADES(40),
    HEARTS(30),
    DIAMONDS(20),
    CLUBS(10);
    private int points;
    private Suits(int points){
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public static boolean contains(String name) {
        for(Suits c: Suits.values()){
            if (name.equals(c.name()))
                return true;
        }
        return false;
    }
}
