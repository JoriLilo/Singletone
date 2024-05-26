package ushtrime;

public class Triangle extends Shape{

    float a=4;
    float b=6;
    float h=7.2f;
    @Override
    float calculatePerimeter() {
        float perimeter= a+b+h;
        return perimeter;
    }

    @Override
    float calculateArea() {
        float area=(b*h)/2;
        return area;
    }
}
