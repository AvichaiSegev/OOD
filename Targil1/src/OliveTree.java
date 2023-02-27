public class OliveTree extends Tree {

    private boolean fruit = false;

    OliveTree(int height, Season season) {
        super(height,season,Color.GREEN);
    }

    @Override
    public String toString() {
        if (!fruit)
            return "Olive tree. " + super.toString();
        else
            return "Olive tree. I give fruit. " + super.toString();
    }
    @Override
    public void changeSeason() {
        super.changeSeason();
        switch (super.getCurrentSeason())
        {
            case FALL:
                height += 5;
                fruit = true;
                break;
            case WINTER:
                height += 5;
                fruit = false;
                break;
            case SPRING:
                height += 10;
                super.leavesColor = Color.GREEN;
                break;
            case SUMMER:
                height += 10;
                break;
        }    }
}
