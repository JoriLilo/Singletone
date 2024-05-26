public class CostumExp {
    public static void main(String[] args) {
        try {
            validAge(23);
        }catch (AgeLimit al){
            System.out.println(al.getLocalizedMessage());
        } finally {
            System.out.println("test");
        }

    }
    public static void validAge(int age){
        if(age<18){
            throw new AgeLimit();
        }
        System.out.println(age);

    }
}
