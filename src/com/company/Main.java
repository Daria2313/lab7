package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ix = new Scanner(System.in);
        int x = ix.nextInt();

        try{
            double result = formula.getFormula(x);
            System.out.println(result);
        }
        catch (FormulaException ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.getX());
        }
    }
}

class formula{
    public static double getFormula(double x) throws FormulaException{
        double result;
        if(x < 0) throw new FormulaException("error", x);
        result = (x - 1)/5;
        return result;
    }
}

class FormulaException extends Exception{

    private double x;
    public double getX(){
        return x;
    }
    public FormulaException(String massage, double x){
        super(massage);
        this.x = x;
    }
}

