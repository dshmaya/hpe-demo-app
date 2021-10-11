package com.hp.devops.demoapp;

public class Musical {
    public int id;
    public String name = "tom exception";
    public String PASSWORD = "password";
    public String PASSWORD6 = "password6";
    public String PASSWORD8 = "password8";
    public String PASSWORD10 = "password10";
    public String PASSWORD11 = "password11";
    public String PASSWORD12 = "password12";
    public String PASSWORD14 = "password14";
    public String PASSWORD16 = "password16";
    public String PASSWORD17 = "password17";
    public String PASSWORD18 = "password18";
    public String PASSWORD19 = "password19";
    public String PASSWORD20 = "password20";
    public String PASSWORD21 = "password21";
    public String PASSWORD22 = "password22";
    public String PASSWORD23 = "password23";
     public String PASSWORD24 = "password24";
     public String PASSWORD25 = "password25";
    public String PASSWORD26= "password26";
    public String PASSWORD27= "password28";
    public String PASSWORD28= "password29";
    public int age;
    public int type1;
    public int type3;
    public int type2;
    public int type4;
    public int type11;
    public int type12;
    public int type13;
    public int type14;
    public int type15;
    public int type16;
    public int type18;
    public int type19;
    public int type20;
    public int type22;
    public int type23;
    public int type25;
    public int type26;
    
    public Musical() {
        System.out.println("not   important      constructor");
        System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaa");
        
       
    }


    public void setMusical() throws ExceptionInInitializerError {
        throw new ExceptionInInitializerError("some customize   exception with the name of " + name  + age + type2 + type25 + PASSWORD22);
    }

}
