package chap6_collectStreamData.collectStreamData_6_2_4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.reducing;

public class Main {
    public static void main(String[] args) {
        List<Dish> specialMenu = Arrays.asList(
                new Dish("fruit", true, 120, Dish.Type.OTHER),
                new Dish("meat", true, 100, Dish.Type.MEAT)
        );

        int totalCalories = specialMenu.stream().collect(reducing(0,Dish::getCalories, (i,j) -> i+j)); //3개 인수
        System.out.println(totalCalories);

        Optional<Dish> mostCaloriesDish = specialMenu
                .stream()
                .collect(reducing((d1,d2) -> d1.getCalories() > d2.getCalories() ? d1 : d2)); //1개 인수
        System.out.println(mostCaloriesDish);

        int totalCalories2 = specialMenu.stream().collect(reducing(0,Dish::getCalories,Integer::sum));  //합계함수 사용
        System.out.println(totalCalories2);

        int totalCalories3 = specialMenu.stream().map(Dish::getCalories).reduce(Integer::sum).get();
        System.out.println(totalCalories3);
        int totalCalories4 = specialMenu.stream().mapToInt(Dish::getCalories).sum();            //best case, 언박싱과 가독성 이점있다.
        System.out.println(totalCalories4);
    }
}
