import java.util.Scanner;

public class MainException {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("vendosni indeksin e array");
        int index=sc.nextInt();

        int[] numbers={ 2,7,9,11};
        try {

            System.out.println(numbers[index]);
            System.out.println("hey");
        }catch (IndexOutOfBoundsException ioobe){
            System.out.println("nuk ekziston");
            System.out.println(numbers[1]);
            System.out.println(ioobe.getLocalizedMessage());
        }
        catch (Exception e){
            System.out.println("catch");
            System.out.println(e.getLocalizedMessage());

        }

    }
}
