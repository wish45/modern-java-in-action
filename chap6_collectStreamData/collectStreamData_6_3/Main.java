package chap6_collectStreamData.collectStreamData_6_3;


import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

public class Main {
    public static void main(String[] args) {
        List<Dish> specialMenu = Arrays.asList(
                new Dish("fruit", true, 120, Dish.Type.OTHER),
                new Dish("meat", true, 100, Dish.Type.MEAT)
        );

        Map<Dish.Type, List<Dish>> dishesByType = specialMenu.stream().collect(groupingBy(Dish::getType));
        System.out.println(dishesByType);

        Map<CaloricLevel, List<Dish>> dishesByCaloricLevel = specialMenu.stream().collect(
                groupingBy(dish -> {
                    if(dish.getCalories() <= 400) return CaloricLevel.DIET;
                    else if(dish.getCalories() <= 700) return CaloricLevel.NORMAL;
                    else return CaloricLevel.FAT;
                })
        );
        System.out.println(dishesByCaloricLevel);
    }
}
