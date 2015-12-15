package com.micles92.Vehic;

/**
 * Created by Bolesław on 2015-12-14.
 */
class Vehicle{
    private int passengers; // liczba pasazerow
    private int fuelcap; //pojemnosc zbiornika paliwa w l
    private double lkm; //zuzycie paliwa w litrach na 100 km

    public Vehicle(int passengers, int fuelcap, double lkm) {
        this.passengers = passengers;
        this.fuelcap = fuelcap;
        this.lkm = lkm;
    }

    //zwraca zasieg pojazdu
    int range(){
        return (int) (fuelcap / lkm* 100);
    }

    double fuelneeded(int km){
        return (double) km / 100 * lkm;
    }

    //metody dostepowe dla zmiennych skladowych

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getFuelcap() {
        return fuelcap;
    }

    public void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }

    public double getLkm() {
        return lkm;
    }

    public void setLkm(double lkm) {
        this.lkm = lkm;
    }
}


class Truck extends Vehicle{
    private int cargocap; //ladownosc w tonach

    public Truck(int passengers, int fuelcap, double lkm, int cargocap) {
        super(passengers, fuelcap, lkm);
        this.cargocap = cargocap;
    }
    //metody dostepowe dla skladowej cargocap

    public int getCargocap() {
        return cargocap;
    }

    public void setCargocap(int cargocap) {
        this.cargocap = cargocap;
    }
}

public class TruckDemo {
    public static void main(String[] args) {
        //tworzy obiekty reprezentujace ciezarowki
        Truck semi = new Truck(2, 200, 25, 4);
        Truck pickup = new Truck(3, 80, 15, 1);
        double liters;
        int dist = 252;

        liters = semi.fuelneeded(dist);

        System.out.printf("Polciezarowka przewozi " + semi.getCargocap()+ " tony ladunku");
        System.out.println();
        System.out.printf("Aby pokonac dystans " +dist+ " kilometrow, polciezarowka potrzebuje " +liters+"litrow");

        liters = pickup.fuelneeded(dist);
        System.out.println();

        System.out.printf("ciezarowka przewozi " + pickup.getCargocap()+ " tony ladunku");
        System.out.println();
        System.out.printf("Aby pokonac dystans " +dist+ " kilometrow, polciezarowka potrzebuje " +liters+"litrow");


    }
}
