package com.pluralsight.calcengine;

public class Flight {
    private int passeangers, flightNumber, seats = 150;
    private char flightClass[];
    private boolean isSeatAvailable[];

    {
        isSeatAvailable = new boolean [seats];

        for(int i = 0; i < seats; i++){
            isSeatAvailable[i] = true;
        }
    }
    public Flight(){}

    public Flight(int flightNumber){
        this.flightNumber = flightNumber;
    }

    public Flight(char flightClass[]){
        this.flightClass = flightClass;
    }
}
