package data19;

import java.util.Collections;
import java.util.Vector;

public class MainVector {
    public static void main(String[] args) {
        Vector<Integer> nr= new Vector<>();
        nr.add(2);
        nr.add(4);
        nr.add(8);
        nr.addAll(nr);
        System.out.println(nr.size());
    }
}
