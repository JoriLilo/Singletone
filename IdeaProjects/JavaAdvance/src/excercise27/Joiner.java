package excercise27;

public class Joiner <T>{

    private String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }
    public String join(T... elements){
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i < elements.length; i++) {
            stringBuilder.append(elements[i].toString());
            if (i < elements.length-1) {
                stringBuilder.append(separator);
            }
        }
        return stringBuilder.toString();
    }
}
