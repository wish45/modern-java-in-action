package chap6_collectStreamData.collectStreamData_6_2_2;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Main {
    public static void main(String[] args) {
        List<Dish> specialMenu = Arrays.asList(
                new Dish("fruit",true,120, Dish.Type.OTHER),
                new Dish("meat",true,100, Dish.Type.MEAT)
        );

        int totalCalories = specialMenu.stream().collect(summingInt(Dish::getCalories));
        double avgCalories = specialMenu.stream().collect(averagingInt(Dish::getCalories));
        IntSummaryStatistics menuStatistics = specialMenu.stream().collect(summarizingInt(Dish::getCalories));

        System.out.println(totalCalories);
        System.out.println(avgCalories);
        System.out.println(menuStatistics);

    }
}
