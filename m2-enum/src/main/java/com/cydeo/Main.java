package com.cydeo;

public class Main {
    public static void main(String[] args) {
        System.out.println("How to access a constant");


        Currency c = Currency.DIME;
        System.out.println(c);
        System.out.println(Currency.PENNY);

        System.out.println("How to get all constant");

        Currency[] currencies = Currency.values();

        for(Currency currency : currencies){
            System.out.println(currencies);
        }

        System.out.println("How to use switch-case with enums");

        switch((Currency.PENNY)){// this is how we access enum constants
            case PENNY:
                System.out.println("It is 1 cent");
                break;
            case NICKLE:
                System.out.println("It is 5 cents");
                break;
            case DIME:
                System.out.println("It is 10 cents");
                break;
            case QUARTER:
                System.out.println("It is 25 cents");
                break;
        }

        System.out.println("Operation Tsk");
        calculate(3,8,Operation.PLUS);


        System.out.println("How to retrieve the constant value");
        System.out.println(Currency.PENNY.getValue());
        System.out.println(Currency.QUARTER.ordinal());
        System.out.println("--------------------------------------------------------------------");
        Currency en= Currency.DIME;

        System.out.println("--------------------------------------------------------------------");

        Currency.DIME.method();
        Currency.QUARTER.method();
        Currency.PENNY.method();
        System.out.println("--------------------------------------------------------------------");
    }

    private static void calculate (double x, double y, Operation operation){ // put operation so we can use them form enum

        switch (operation){
            case PLUS:
                System.out.println(x+y);
                break;
            case MINUS:
                System.out.println(x-y);
                break;
            case MULTIPLY:
                System.out.println(x*y);
                break;
            case DIVIDE:
                System.out.println(x/y);
                break;

        }
    }
}
