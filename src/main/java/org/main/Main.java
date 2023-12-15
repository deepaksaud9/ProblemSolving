package org.main;

import org.array.ArrayExample;
import org.oddEven.OddEven;
import org.primenumer.PrimeNumber;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        /*ArrayExample arrayExample = new ArrayExample(4);
        arrayExample.takeInput();
        arrayExample.displayElements();*/


//-----------------this program for check prime number---------------------------------------

   /*     PrimeNumber primeNumber = new PrimeNumber();

        int number = 1;

        if (primeNumber.isThisPrime(number)){
            System.out.println("this is a prime number");
        }else {
            System.out.println("this is not a prime number");
        }
    }
*/

//----------------------------------------------------------
        int num =3;
        OddEven oddEven = new OddEven();
        oddEven.checkOddEven(num);


        //-----------------------------------------
    }
}