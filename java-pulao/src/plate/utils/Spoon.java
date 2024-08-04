package plate.utils;

public class Spoon implements Scooping {
    @Override
    public String scoop(ScoopableFood food) {
        return String.format("a spoonful of (%s)", food.food());
    }
}
