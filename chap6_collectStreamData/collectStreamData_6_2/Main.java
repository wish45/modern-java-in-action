package chap6_collectStreamData.collectStreamData_6_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Dish> specialMenu = Arrays.asList(
                new Dish("fruit",true,120,Dish.Type.OTHER),
                new Dish("meat",true,100,Dish.Type.MEAT)
        );
        long howManyDishes = specialMenu.stream().collect(Collectors.counting());
        System.out.println(howManyDishes);
    }

}
