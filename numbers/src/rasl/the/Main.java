package rasl.the;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть додатнє тризначне число число:");
        int number = scanner.nextInt();
        if (number < 100 || number > 999 ) {
            System.out.println("Введене число не є трьохзначним! Введіть трьохзначне число!");
        }else{
            int hundreds, tens, units;
            hundreds = number/100;
            tens = ( number - hundreds * 100 ) / 10 ;
            units = (number - hundreds * 100 - tens * 10);
            if (hundreds > tens && hundreds > units) {
                System.out.println("Найбільше число: " + hundreds);
            }else if (tens > hundreds && tens > units ) {
                System.out.println("Найбільше число: " + tens);
            }else if(hundreds == tens || hundreds == units) {
                System.out.println("Найбільше число: " + hundreds);
            }else if (tens == hundreds || tens == units) {
                System.out.println("Найбільше число: " + tens);
            }else{
                System.out.println("Найбільше число: " + units);
            }
        }
    }
}
