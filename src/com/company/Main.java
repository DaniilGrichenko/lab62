package com.company;

public class Main {
    public static void main(String[] args) {

        Animals animal1 = new Animals(65,15,55,4);

        System.out.println("animal 1 has weight "+ animal1.weight + "kg. and speed " + animal1.speed+ "km/h.");
        System.out.println("animal 1 need food for 1 days = " +(animal1.amount*animal1.food)+" kg");

        Animals animal2 = new Animals(5,47,5,5);

        System.out.println("animal 2 has weight "+ animal2.weight + "kg. and speed " + animal2.speed+ "km/h.");
        System.out.println("animal 2 need food for 1 days = " +(animal2.amount*animal2.food)+" kg");
        //
        Currency Bank1 = new Currency(33.08,31.60, 6.68);
        Currency Bank2 = new Currency(32.56,30.36, 6.28);
        System.out.println();
        System.out.println("Bank1--100-euro = " +Bank1.Euro*100 + "-hryvnia");
        System.out.println("Bank1--100-dollars = " +Bank1.Dollar*100 + "-hryvnia");
        System.out.println("Bank1--100-zloty = " +Bank1.Zloty*100 + "-hryvnia");
        System.out.println();
        System.out.println("Bank2--100-euro = " +Bank2.Euro*100 + "-hryvnia");
        System.out.println("Bank2--100-dollars = " +Bank2.Dollar*100 + "-hryvnia");
        System.out.println("Bank2--100-zloty = " +Bank2.Zloty*100 + "-hryvnia");
        //
        Transport Bus = new Transport(50, 28000 ,450, 30);
        Transport Airplane = new Transport(800, 183000, 23800, 320);
        System.out.println();
        System.out.println("Maximum distance Bus = " + Bus.fuel/Bus.consumption * 100 + "km" );
        System.out.println("Maximum distance Airplane  = " + Airplane.fuel/Airplane.consumption * 100 + "km" );




    }
}