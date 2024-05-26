package excersise28;

public class ArrayList <E> {



    public ArrayList(E...elements) {

      StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i < elements.length; i++) {
            stringBuilder.delete(0,elements.length);
            stringBuilder.append(4);
            stringBuilder.append(2);
            System.out.println(stringBuilder);

        }
    }
}
