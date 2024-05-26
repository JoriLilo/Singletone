package ushtrime;

public class Rectangle extends Shape{
    float a;
    float b;
    @Override
    float calculatePerimeter() {
        float perimeter=(2*a)+(2*b);
        return perimeter;
    }

    @Override
    float calculateArea() {
        float area=a*b;
        return area;
    }
}
