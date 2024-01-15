package chap6_collectStreamData.collectStreamData_6_3;

public class Dish {
    public enum Type {
        OTHER,FISH,MEAT;
    }


    private String name;
    private boolean yn;
    private int calories;
    private Type type;

    public Dish(String name, boolean yn, int calories, Type type) {
        this.name = name;
        this.yn = yn;
        this.calories = calories;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isYn() {
        return yn;
    }

    public int getCalories() {
        return calories;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return name;
    }
}
