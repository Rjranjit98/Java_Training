package day2;

import java.util.Scanner;


public class Tshirt {
    int count;
    String size;
    String color;

    static {
        System.out.println("The total number of Tshirt : 100");
        System.out.println("The Block T shirt : 50");
    }

    Tshirt(int count,String size,String color){

        System.out.println("The count : "   + count );
        System.out.println("The size : "   + size);
        System.out.println("The color : "   + color);
    }


    public void brand(){

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        String color = sc.next();
        String size = sc.next();
        System.out.println(" I need"+" "+ count + " " +color + " "+"color shirts in " +size +" " +"size.");

        this.count = count;
        this.color = color;
        this.size  = size;
    }

    public static void main(String[] args) {
        Tshirt Ts = new Tshirt(50,"m","Blue");
        Ts.brand();
        }





    }



