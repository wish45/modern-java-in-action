package chap6_collectStreamData.ex2;

public class Dish {
    public enum Type {
        OTHER,FISH,MEAT;
    }

    private String name;
    private boolean yn;
    private int expense;
    private Type type;

    public Dish(String name, boolean yn, int expense, Type type) {
        this.name = name;
        this.yn = yn;
        this.expense = expense;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isYn() {
        return yn;
    }

    public int getExpense() {
        return expense;
    }

}
