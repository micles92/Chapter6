package com.micles92;

/**
 * Created by Bolesław on 2015-12-14.
 */

class TwoDShape{
    private double width;
    private double height;

    public TwoDShape(){
        width = height = 0;
    }

    public TwoDShape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    void showDim(){
        System.out.printf("Szerokosc i wysokosc: "+width + " and " + height);
    }
}

//klasa pochodna klasy bazowej TwoDShape reprezuntujaca trojkaty.

class Triangle extends TwoDShape{
    private String style;


    public Triangle(double w, double h, String style){
        super(w, h);
        this.style = style;


    }

    public double area(){
        return getHeight()*getWidth() / 2;
    }

    public void showStyle(){
        System.out.println("Trojkat jest: "+style);
    }


}


public class Shapes {
    public static void main(String[] args) {

        Triangle t1 = new Triangle(4.0, 4.0, "wypelniony");
        Triangle t2 = new Triangle(8.0, 12.0, "pusty");

        System.out.println("Info o t1");
        t1.showStyle();
        t1.showDim();
        System.out.printf("Powierzchnia wygnosi: "+t1.area());

        System.out.println();

        System.out.println("Info o t2");
        t2.showStyle();
        t2.showDim();
        System.out.println("Powierzchnia wynosi: "+t2.area());
    }
}
