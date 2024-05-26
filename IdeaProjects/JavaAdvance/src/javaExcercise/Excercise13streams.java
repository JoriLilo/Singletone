package javaExcercise;

import compositon.CarList;

import java.util.ArrayList;
import java.util.List;
import java.util.*;


public class Excercise13streams {
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

        Car car1 = new Car("BMW", "A202", 40000, 1998, lista1, EngineType.V12);
        Car car2 = new Car("Audi", "B400", 50000, 2022, lista2, EngineType.S6);
        Car car3 = new Car("Toyota", "C123", 80000, 2021, lista3, EngineType.S3);

        System.out.println(car1.hashCode() + "\n" + car2.hashCode() + "\n" + car1.equals(car2));
        System.out.println("--------------------------------");

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);


        Map<Integer, String> renditja = new HashMap<>();
        for (Car carTemp : cars) {
            renditja.put(carTemp.getPrice(), carTemp.getName());
        }


        //cars.remove(1);

        System.out.println("List of all Cars");
        cars.forEach(car -> System.out.println(car.getName() + " "));
        System.out.println("--------------------------------");
        printoEngine(cars);
        System.out.println("--------------------------------");
        printoBefore1999(cars);
        System.out.println("--------------------------------");
        printoMostExp(cars);
        System.out.println("--------------------------------");
        printoMostCheapes(cars);
        System.out.println("--------------------------------");
        printAtlaeast3Manufactures(cars);
        System.out.println("--------------------------------");
        printSpecificCar(cars, "B400");
        System.out.println("--------------------------------");
        printFromManuf(cars, obj1);
        System.out.println("--------------------------------");
        System.out.println("Renditja ne rend rrites sipas cmimit: " + renditja);
    }
       /* public static void printoAll(List<Car> cars){
            System.out.println("Te gjitha makinat:");
            for (Car carsTemp:cars){
                System.out.println(carsTemp.getName());
            }
        }*/


    public static void printCarsBefore1999(List<Car> cars) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getYearOfManufacturer() < 1999) {
                System.out.println("Makina eshte prodhar para vitit 1999  eshte : " + cars.get(i));
            }
        }
    }

    public static void printCarsWithPriceLessThan50000(List<Car> cars) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getPrice() < 50000) {
                System.out.println("Makinat qe kushtojne me pak se 50000 jane : " + cars.get(i));
            }
        }
    }

    public static void printoEngine(List<Car> cars) {
        System.out.println("Makinat me motorr V12:");
           /*  for (Car carsTemp:cars){
                if (carsTemp.getEngine1()== Car.enginetype.V12){
                    System.out.println(carsTemp.getName());
                }
            }*/
        cars.forEach(car -> System.out.println(car.getEngineType().equals(EngineType.V12) + " "));
        cars.stream()
                .filter(car -> car.getEngineType().equals(EngineType.V12))
                .toList();

        cars.stream()
                .filter(car -> car.getManufacturerList().contains("John"));

    }

    public static void printoBefore1999(List<Car> cars) {
        System.out.println("Makinat e prodhuara perpara 1999: ");
        for (Car carsTemp : cars) {
            if (carsTemp.getYearOfManufacturer() < 1999) {
                System.out.println(carsTemp.getName());
            }
        }
        cars.stream()
                .filter(model -> model.getYearOfManufacturer() < 1999)
                .forEach(car -> System.out.println(car.getName() + " "));
    }

    public static void printoMostExp(List<Car> cars) {
        System.out.println("Makina me e shtrenjte:");
          /*  int max=Integer.MIN_VALUE;
            for (Car carsTemp:cars){
                if (carsTemp.getPrice()>max){
                    max=carsTemp.getPrice();
                }
            }
            for (Car carsTemp:cars){
                if (max==carsTemp.getPrice()){
                    System.out.println(carsTemp.getName());
                }
            }*/
        cars.stream().max(Comparator.comparing(Car::getPrice)).stream().forEach(car -> System.out.println(car.getName() + " "));

    }

    public static void printoMostCheapes(List<Car> cars) {
        System.out.println("Makina me e lire:");
         /*   int min=Integer.MAX_VALUE;
            for (Car carsTemp:cars){
                if (carsTemp.getPrice()<min){
                    min=carsTemp.getPrice();
                }
            }
            for (Car carsTemp:cars){
                if (min==carsTemp.getPrice()){
                    System.out.println(carsTemp.getName());
                }
            }*/
        cars.stream().min(Comparator.comparing(Car::getPrice)).stream().forEach(car -> System.out.println(car.getName() + " "));
    }

    public static void printAtlaeast3Manufactures(List<Car> cars) {
        System.out.println("At least 3 manufactures:");
          /*  for (Car carTemp:cars){
                if (carTemp.getLista().size()>=3){
                    System.out.println(carTemp.getName());
                }
            }*/

        cars.stream().filter(car -> car.getManufacturerList().size() >= 3).forEach(car -> System.out.println(car.getName() + " "));


    }

    public static void printSpecificCar(List<Car> cars, String name) {
        for (Car carTemp : cars) {
            if (carTemp.getModel().equals(name)) {
                System.out.println(carTemp.getName() + " is on list.");
            }
        }
    }

    public static void printFromManuf(List<Car> cars, Manufacturer name) {
        System.out.println("Makinat e prodhuara nga :" + name.getName());
        for (Car carTemp : cars) {
            if (carTemp.getManufacturerList().contains(name)) {
                System.out.println(carTemp.getName());
            }
        }

    }



}
