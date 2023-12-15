package org.array;

import java.util.Scanner;

public class ArrayExample {

       private int[] marks;

       public ArrayExample(int size){
           marks = new int[size];
       }

       public void takeInput(){
           Scanner scanner = new Scanner(System.in);
           System.out.println("enter size of array");
           int size = scanner.nextInt();
           System.out.println("enter array elements of size "+ size);
           for (int i=0; i<size; i++){
               marks[i] = scanner.nextInt();
           }
           scanner.close();
       }

       public void displayElements(){
           System.out.println("entered Elements are:");{
               for (int mark : marks) {
                   System.out.println(mark+ " ");
               }
           }
       }




}
