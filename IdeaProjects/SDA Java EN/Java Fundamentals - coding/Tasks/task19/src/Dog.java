public class Dog {
     private String name;

     public Dog() {

     }

     public Dog(String sparky) {
          this.name= sparky;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getName() {
          return name;
     }
     public  void  wagTail(){
          System.out.println(name +" wags tail.");
     }
}
