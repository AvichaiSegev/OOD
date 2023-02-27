import java.lang.Comparable;
public abstract class Animal implements Seasonable,Comparable<Animal> {
    protected int weight;
    private Season season;
    protected Color color;

    Animal(int weight, Season season, Color color) {
        this.weight = weight;
        this.season = season;
        this.color = color;
    }

    @Override
    public void changeSeason()
    {
        int seasonIndex = 0;
        int index = 0;
        for (Season s : Season.values()) {
            if (s == season) {
                seasonIndex = index;
            }
            index++;
        }
        int nextOrdinal = (seasonIndex  + 1) % Season.values().length;
        season = Season.values()[nextOrdinal];
    }

    @Override
    public Season getCurrentSeason() {
        return season;
    }

    @Override
    public int compareTo(Animal o) {
        if (weight > o.weight)
            return 1;
        else if (weight < o.weight)
            return -1;
        else
            return 0;
    }
    @Override
    public String toString() {
        return "My weight is: " + weight +" and my color is: " + color;
    }

}
