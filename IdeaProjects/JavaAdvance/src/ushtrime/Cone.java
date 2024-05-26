package ushtrime;

public class Cone extends _3DShape{
    float r=4;
    float h=12;
    @Override
    float calculateVolume() {
        float v= (3.14f*(r*r)*h)/3;
        return v;
    }
}
