package ushtrime;

public class Hexagon extends Shape{
    float a;
    @Override
    float calculatePerimeter() {
        float perimter=6*a;

        return perimter;
    }

    @Override
    float calculateArea() {
        float area=(5.1f*(a*a))/2;
        return area;
    }
}
