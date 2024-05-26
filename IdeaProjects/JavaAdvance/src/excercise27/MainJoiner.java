package excercise27;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainJoiner {
    public static void main(String[] args) {

        Integer[] integers = {1,2,3,4,5,6};

        Joiner<Integer> joiner = new Joiner<>("-");
        System.out.println(joiner.join(integers));

        String[] strings = {"sdfgds","dgfsg","dsfgd"};
        Joiner<String> joiner1 = new Joiner<>("+");
        System.out.println(joiner1.join(strings));




    }
}
