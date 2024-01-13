package chap6_collectStreamData.chap6_collectStreamData_6_2_1;

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

    @Override
    public String toString() {
        return "Dish{" +
                "name='" + name + '\'' +
                ", yn=" + yn +
                ", calories=" + calories +
                ", type=" + type +
                '}';
    }
}
