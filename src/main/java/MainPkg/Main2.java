package MainPkg;

import java.util.ArrayList;
import java.util.Arrays;

class CustomException2 extends Exception{
    public CustomException2(String message){
        super(message);
    }
}

public class Main2 {

    static ArrayList<String> cars = new ArrayList<>(Arrays.asList("Honda", "Audi", "Lambo"));

    public void checkCar(String car) throws CustomException2 {

        if(cars.contains(car)){
            throw new CustomException2(car + " Already Exists");
        }
        else {
            cars.add(car);
            System.out.println(car + " is added to the car list");
        }
    }

    public static void main(String [ ] args){
        Main2 main2 = new Main2();

        System.out.println("Before:" + cars);

        try{
            main2.checkCar("Toyota");
            main2.checkCar("Volkswagen");
            main2.checkCar("Renault");
            main2.checkCar("Honda");
        } catch(CustomException2 e){
            System.out.println(e);
        }

        System.out.println("After:" + cars);
    }




}
