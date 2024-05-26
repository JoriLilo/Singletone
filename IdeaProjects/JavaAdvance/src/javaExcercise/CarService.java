package javaExcercise;

import compositon.CarList;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;


public class CarService {
    public static void main(String[] args) {
        Manufacturer obj1 = new Manufacturer("John", 1990, "USA");
        Manufacturer obj2 = new Manufacturer("DaSilva", 1980, "EU");
        Manufacturer obj3 = new Manufacturer("Jack", 1970, "Germany");
        Manufacturer obj4 = new Manufacturer("Emer1", 1950, "Italy");
        Manufacturer obj5 = new Manufacturer("Filan", 1987, "Albania");

        System.out.println(obj1.hashCode() + "\n" + obj2.hashCode() + "\n" + obj1.equals(obj2));
        System.out.println("--------------------------------");

        List<Manufacturer> lista1 = new ArrayList<>();
        lista1.add(obj1);
        lista1.add(obj2);

        List<Manufacturer> lista2 = new ArrayList<>();
        lista2.add(obj1);
        lista2.add(obj2);
        lista2.add(obj3);
        lista2.add(obj4);

        List<Manufacturer> lista3 = new ArrayList<>();
        lista3.add(obj4);
        lista3.add(obj5);

        Car car1 = new Car("BMW", "A202", 40000, 1998, lista1, EngineType.V12 );
        Car car2 = new Car("Audi", "B400", 50000, 2022, lista2, EngineType.S6);
        Car car3 = new Car("Toyota", "C123", 80000, 2021, lista3, EngineType.S3);


        List<Car> carList=new ArrayList<>();
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);

        for (Car car:carList) {
            System.out.println(car);

        }


    }



    public static void carsWithEnginev12(List<Car> cars){
     cars.forEach(car -> System.out.println(car.getEngineType().equals(EngineType.V12)));
    }

    public static void carsProducedBefore1999(List<Car> cars){
        for (Car car: cars) {
            if(car.getYearOfManufacturer()<999){
                System.out.println(car);
            }

        }
    }

    public  static void printMaxPrice(List<Car> cars) {
        for (int i = 0; i < cars.size(); i++) {
            double max = Integer.MIN_VALUE;
            if (cars.get(i).getPrice() > max) {
                max = cars.get(i).getPrice();
                System.out.println(max);

            }
        }
    }
    public static void printMinPrice(List<Car> cars){
        for (int i = 0; i < cars.size(); i++) {
            double max = Integer.MAX_VALUE;
            if (cars.get(i).getPrice() > max) {
                max = cars.get(i).getPrice();
                System.out.println(max);

            }
        }

    }
    public static void moreThan3Manufacturer(List<Car> cars){
        cars.forEach(car -> System.out.println(car.getManufacturerList()));
    }






}

