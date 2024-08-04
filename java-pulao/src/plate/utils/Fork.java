package plate.utils;

public class Fork implements Scooping {
    @Override
    public String scoop(ScoopableFood food) {
        return String.format("A little bit of (%s) on a fork", food.food());
    }
}
