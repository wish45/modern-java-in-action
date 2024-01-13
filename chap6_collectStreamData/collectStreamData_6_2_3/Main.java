package chap6_collectStreamData.collectStreamData_6_2_3;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class Main {
    public static void main(String[] args) {
        List<Dish> specialMenu = Arrays.asList(
                new Dish("fruit",true,120, Dish.Type.OTHER),
                new Dish("meat",true,100, Dish.Type.MEAT)
        );
        String shortMenu = specialMenu.stream().map(Dish::getName).collect(joining()); //joining은 내부적으로 StringBuilder 사용
        System.out.println(shortMenu);

        String shortMenu2 = specialMenu.stream().map(Dish::getName).collect(joining(", ")); //joining은 내부적으로 StringBuilder 사용
        System.out.println(shortMenu2);
        
        //String shortMenu2 = specialMenu.stream().collect(joining());
    }
}
