public class Bear extends Animal {

    Bear(int weight, Season season) {
        super(weight,season, Color.BROWN);
    }
    @Override
    public String toString() {
        return "Bear:"+super.toString();
    }
    @Override
    public void changeSeason() {
        super.changeSeason();
        switch (super.getCurrentSeason())
        {
            case FALL:
                weight = (int) (1.25 * weight);
                break;
            case WINTER:
                weight = (int) (0.80 * weight);
                break;
            case SPRING:
                weight = (int) (0.75 * weight);
                break;
            case SUMMER:
                weight = (int) (1.33 * weight);
                break;
        }
    }
}
