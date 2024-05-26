package hashmap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,String> mapOfString= new HashMap<>();
        mapOfString.put("name","john");
        mapOfString.put("nationality","German");
        mapOfString.put("age","12");
        mapOfString.put("language","german");
        mapOfString.putIfAbsent("name","mary");

        for (Map.Entry<String, String>iteam :mapOfString.entrySet()) {
            System.out.println(iteam.getKey()+"  " +iteam.getValue());

        }


        String name= mapOfString.get("name");
        System.out.println(name);

        HashMap<Integer,Integer> mapsOfNumbers= new HashMap<>();
        mapsOfNumbers.put(8,4);
        mapsOfNumbers.put(12,4);
        mapsOfNumbers.put(2,11);

        int totalKey=0;
        int totalValue=0;

        for(Map.Entry<Integer,Integer> iteam:mapsOfNumbers.entrySet()){
            totalKey+= iteam.getKey();
            totalValue+= iteam.getValue();
        }
        System.out.println(totalKey);
        System.out.println(totalValue);
        System.out.println(totalKey+totalValue);
    }
}
