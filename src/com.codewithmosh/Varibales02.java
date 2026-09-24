package com.codewithmosh;

import java.awt.*;
import java.util.Date;

public class Varibales02 {
    public static void main(String[] args) {

        // Reference Variables Types
        // you use reference variables to store the address of an object in memory.
        // you can also use already packages or class pre defined to create an object from them by using new
        Date now = new Date();
        System.out.println("Current Date and Time: " + now);

        // You can also create your own classes and use them as reference types.
        Point point1 = new Point(10,20);
        Point point2 = point1;
        point1.x =2;
        System.out.println(point1);
        System.out.println(point2);
        // output:
        // java.awt.Point[x=2,y=20]
        // java.awt.Point[x=2,y=20]
        // point2 is now a reference to the same object as point1


        // REFRENCE TYPES ARE COPIED BY REFRENCE (ADDRESS LOCATION IN MEMORY) NOT BY VALUE
        // WHILE PRIMITIVE TYPES ARE COPIED BY VALUE (THE VALUE ITSELF IS COPIED)

    }
}
