package activities;

import javax.xml.transform.stream.StreamSource;

public class Car {

     String color;
     String transmission;
     int make;
     int tyres;
     int doors;

    public Car (){
        this.tyres = 4;
        this.doors = 4;
    }
    void displayCharacteristics(){

        System.out.println("color: "+color);
        System.out.println("transmission: "+transmission);
        System.out.println("make: "+make);
        System.out.println("tyres: "+tyres);
        System.out.println("doors: "+doors);

    }

    void accelarate(){
    System.out.println("Car is moving forward.");
    }

    void brake(){
    System.out.println("Car has stopped.");
    }

}
