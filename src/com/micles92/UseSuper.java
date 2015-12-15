package com.micles92;

/**
 * Created by Bolesław on 2015-12-14.
 * uzywa super aby obejsc przeslanianie nazw
 */

class A{
    int i;
}

//Tworze klase pochodna A

class B extends A{
    int i;// tu skladowa i przeslania i w klasie A

    public B(int a, int b){
        super.i = a; // i w A << Tutaj super.i oznacza skladowa i nalezaca do klasy bazowej A
        i = b; // i w b;
    }

    void show(){
        System.out.printf("To jest i w klasie bazowej: " +super.i);
        System.out.printf("To jest i w klasie pochodnej: " +i);
    }
}

public class UseSuper {
    public static void main(String[] args) {
        B subOB = new B(1, 2);
        subOB.show();
    }
}
