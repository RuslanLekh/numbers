import java.util.Scanner;

public class taskthree {
    public static void main(String[] args) {
        int firstfloor = 1; // наш перший поверх
        Scanner scanner = new Scanner(System.in);
        System.out.print("Куди піднімаємось? ");
        int floor = scanner.nextInt(); //задаємо перший напрямок
        if (floor == 3) {
            System.out.println("Ви піднялись на третій поверх.");
        } else if(floor == 2) {
            System.out.println("Ви піднялись на третій поверх");
         }else if (floor == 1) {
            System.out.println("Ви залишились на першому поверсі.");
        } else if(floor == 4) {
            System.out.println("Ви піднялись на 4 поверх.");
        } else if (floor == 5) {
            System.out.println("Ви піднялись на п'ятий поверх.");
        } else if (floor == 6) {
            System.out.println("Ви піднялись на шостий поверх.");
        } else if (floor == 7) {
            System.out.println("Ви піднялись на сьомий поверх.");
        } else if (floor == 8) {
            System.out.println("Ви піднялись на восьмий поверх.");
        } else if (floor == 9) {
            System.out.println("Ви піднялись на девятий поверх.");
        } else {
            System.out.println("Такого поверху немає!");
        }
        System.out.print("Введіть новий поверх: ");
        int newfloor = scanner.nextInt(); //задаємо новий напрямок
        if (newfloor > floor ) {
            if (newfloor >= 10) {
                System.out.println("Такого повекрху не існує!");
            }else if (newfloor == 2) {
                System.out.println("Ви піднялись на третій поверх.");
            } else {
                System.out.println("Ви піднялись на "+ newfloor + " поверх");
            }
        } else if (newfloor < floor ) {
            if (newfloor >= 10) {
                System.out.println("Такого поверху не існує!");
            }else if (newfloor == 2) {
                System.out.println("Ви опустились на 1 поверх");
            } else {
                System.out.println("Ви опустились на " + newfloor + " поверх");
            }
        }

        }


    }


