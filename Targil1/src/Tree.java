public abstract class Tree implements Comparable<Tree>, Seasonable {
    protected int height;
    protected Season season;
    protected Color leavesColor;
    // TODO: Add auxiliary fields and functions.

    Tree(int height, Season season, Color leavesColor){
        this.height = height;
        this.season = season;
        this.leavesColor = leavesColor;
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
    public int compareTo(Tree o) {
        if (height > o.height)
            return 1;
        else if (height < o.height)
            return -1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Tree{ " +
                "height=" + height +
                ", season=" + season +
                ", leavesColor=" + leavesColor +
                " }";
    }

}
