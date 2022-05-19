package com.company;
public class Animals {
    double weight;
    double amount;
    double speed;

    public Animals(double weight, double amount, double speed, double food) {
        this.weight = weight;
        this.amount = amount;
        this.speed = speed;
        this.food = food;
    }

    double food;

    double findMeat() {
        double Meat;
        Meat = weight * amount;
        System.out.println(Meat);
        return Meat;
    }



        double findAllFood () {
            double AllFood;
            AllFood = food * amount;
            return AllFood;
        }


    }

