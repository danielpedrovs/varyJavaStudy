package academy.learnprogramming;

import java.util.Locale;
import java.util.Scanner;

public class Main {

//    public static void main(String[] args) {
//	 String [] myStringArray = new String[10];
//	 myStringArray[3] = "pao";
//	 myStringArray[5] = "ze ruela";
//
//        System.out.println(" o elemento n5 da array e  " + myStringArray[5]);
//        System.out.println( " o elemento n4 da array e " + myStringArray[3]);
//        System.out.println( "todos elementos da array e " + myStringArray[0]);
//        System.out.println();
//            double[] myDoubleArray = new double[25];
////        int[] myIntArray = int{1,2,3,4,5,6,7,8,9,10};
////        myIntArray[0] = 45;
////        myIntArray[1] = 476;
////        myIntArray [5] = 50;
////        System.out.println(myIntArray[0]);
////        System.out.println(myIntArray[6]);
////         System.out.println(myIntArray[8]);
//            for (double i=0; i<myDoubleArray.length; i++){
//                myDoubleArray [(int)i] = i*10;
//            }
//            for (double i=0 ; i<myDoubleArray.length; i++){
//                System.out.println("Element " + i+", value is " +myDoubleArray[(int)i]);
//            }

        private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for (int i=0; i<myIntegers.length; i++){
        System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
    }
        System.out.println("the average is " + getAverage(myIntegers));
    }

    public static int[] getIntegers (int number) {
        System.out.println("Enter " + number + " Integer values.\r");
        int[] values = new int [number];
    for (int i=0; i<values.length;i++){
        values[i] = scanner.nextInt();
    }

          return values;
    }

    public static double getAverage (int[] array) {
        int sum = 0;
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }
        return (double) sum/(double) array.length;
    }
}

