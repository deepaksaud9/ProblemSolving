package org.primenumer;

public class PrimeNumber {
    public boolean isThisPrime(int number ){

        if(number <= 1){
            return false;
        }
            for (int i=2; i<=Math.sqrt(number); i++){
                if (number % i == 0){
                    return false;
                }
            }
            return true;
    }
}
