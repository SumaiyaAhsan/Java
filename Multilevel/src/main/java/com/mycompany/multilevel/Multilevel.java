/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.multilevel;

/**
 *
 * @author tamanna
 */

class Vehicle {
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}
class FourWheeler extends Vehicle {
    FourWheeler() {
        System.out.println("4 Wheeler Vehicles");
    }
}
class Car extends FourWheeler {
     Car() {
        System.out.println("This 4 Wheeler Vehicle is a Car");
    }
}

public class Multilevel {

    public static void main(String[] args) {
       
        Car c1=new Car();
    }
}
