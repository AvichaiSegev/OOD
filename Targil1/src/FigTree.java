public class FigTree extends Tree {

    private boolean fruit = false;
    FigTree(int height, Season season) {
        super(height,season,Color.GREEN);
        if (season == Season.FALL||season == Season.WINTER)
        {
            super.leavesColor = Color.YELLOW;
        }
        if (season == Season.SUMMER)
        {
            fruit = true;
        }
    }

    @Override
    public String toString() {
        if (!fruit)
            return "Fig tree. " + super.toString();
        else
            return "Fig tree. I give fruit. " + super.toString();

    }
    @Override
    public void changeSeason() {
        super.changeSeason();
        switch (super.getCurrentSeason())
        {
            case FALL:
                height += 20;
                super.leavesColor = Color.YELLOW;
                fruit = false;
                break;
            case WINTER:
                height += 20;
                break;
            case SPRING:
                height += 30;
                super.leavesColor = Color.GREEN;
                break;
            case SUMMER:
                height += 20;
                fruit = true;
                break;
        }
    }
}
