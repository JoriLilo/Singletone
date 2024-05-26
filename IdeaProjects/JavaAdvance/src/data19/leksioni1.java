package data19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class leksioni1 {
    public static void main(String[] args){


        List<String> stringList= new ArrayList<>();
        stringList.add("harry");
        stringList.add("ana");
        stringList.add("mira");
        stringList.add("maria");
        System.out.println("nr i elementeve "+ stringList.size());
        stringList.clear();

        //System.out.println(stringList.get(2));

        for (String name : stringList){
            System.out.println(name);
        }
        if(stringList.contains("ana")){
            System.out.println("eshte");
        }
    }
}
