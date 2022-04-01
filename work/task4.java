import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Погодитись? | Відмовитись?");
         String thing  = scanner.next();
         switch (thing){
             case "ok", "Yes", "yes", "+", "Y", "Так" :
                 System.out.println("Я погоджуюсь!");
                 break;
             case "no", "No", "-", "Ні","N" :
                 System.out.println("Я відмовляюсь!");

         }



    }
}
