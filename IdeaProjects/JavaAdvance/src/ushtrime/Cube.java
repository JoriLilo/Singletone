package ushtrime;

public class Cube extends _3DShape{
    float a;
    @Override
    float calculateVolume() {
        float Volume=a*a*a;
        return Volume;
    }

    @Override
    public float fill(float amount) {

        if(amount>calculateVolume()){
            System.out.println("too much water");
        }else if (amount ==calculateVolume()){
            System.out.println("water to the brim");
        }else {
            System.out.println("not enough water");
        }
      return 0;
    }
}
