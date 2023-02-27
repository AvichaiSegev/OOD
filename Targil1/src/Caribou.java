public class Caribou extends Animal {

    Caribou(int weight, Season season) {

        super(weight,season,Color.BROWN);
        if (season == Season.WINTER)
        {
            super.color = Color.WHITE;
        }

    }

    @Override
    public String toString() {
        return "Caribou:" + super.toString();
    }

    @Override
    public void changeSeason() {
        super.changeSeason();

    }
}
