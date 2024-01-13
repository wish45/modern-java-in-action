package chap3_lamda;

import java.nio.file.DirectoryStream;
import java.util.function.Function;
import java.util.function.Predicate;

public class Ex1 {

    public Function<String, Integer> test(String a){
        Function<String, Integer> stringIntegerFunction = (String s) -> s.length();
        Predicate<String> filter = (String s) -> !s.isEmpty();
        return stringIntegerFunction;
    }

}

