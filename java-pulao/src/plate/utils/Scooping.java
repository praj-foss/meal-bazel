package plate.utils;

public interface Scooping {
    String scoop(ScoopableFood food);

    public interface ScoopableFood {
        String food();
    }
}
