package chap6_collectStreamData.collectStreamData_6_2_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.maxBy;

public class Main {
    public static void main(String[] args) {
        List<Dish> specialMenu = Arrays.asList(
                new Dish("fruit",true,120, Dish.Type.OTHER),
                new Dish("meat",true,100, Dish.Type.MEAT)
        );

        Comparator<Dish> dishCaloriesComparator = Comparator.comparingInt(Dish::getCalories);
        Optional<Dish> mostCaloriesDish = specialMenu.stream().collect(maxBy(dishCaloriesComparator));
        System.out.println(mostCaloriesDish);
    }

}
