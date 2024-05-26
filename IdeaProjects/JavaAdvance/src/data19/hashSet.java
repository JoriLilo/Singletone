package data19;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class hashSet {
    public static void main(String[] args) {
        Set<String> stringSet=new HashSet<>();

        stringSet.add("test");
        stringSet.add("test2");
        stringSet.add("aaa");
        stringSet.add("teste");
        stringSet.add("teste");
        stringSet.add(null);
        stringSet.remove("test" );

        Set<String>elements =new HashSet<>();
        elements.addAll(stringSet);


        int totalDublicated=0;
        int totalUnique=0;
        int[] numbers={ 3,4,6,3,5,3,5,8,9,53,2};
        Set<Integer> numbersSet= new HashSet<>();
        for (int j : numbers) {
            totalDublicated += j;
            numbersSet.add(j);
        }

        System.out.println();
        for (Integer number: numbersSet){
            System.out.println(number);
            totalUnique+=number;
        }
        System.out.println(totalUnique);



    }
}
