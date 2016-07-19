package com.raghav.corejava.oops;

public class MySingleton {

    private static MySingleton myObj;
    static{
        myObj = new MySingleton();
    }

    private MySingleton(){
     System.out.println(" Very secured- get the acces via getInstance()");
    }

    public static MySingleton getInstance(){
        return myObj;
    }

    public void testMe(){
        System.out.println("Hey.... it is working!!!");
    }

    public static void main(String a[]){
        MySingleton ms = getInstance();
        ms.testMe();
    }
}