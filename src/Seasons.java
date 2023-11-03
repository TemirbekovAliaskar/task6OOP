import java.util.Scanner;

public class Seasons {
     int num;

     public Seasons(int num){
         this.num=num;
     }

     public Seasons(){}

     public int seasons4 ( ) {
         Scanner scanner = new Scanner(System.in);
         int scan = scanner.nextInt();
         switch (scan) {
             case 3, 4, 5:
                 System.out.println("Весна :");
                 for (int i = 0; i < 3 ; i++) {

                 }
                 break;

             case 6, 7, 8:
                 System.out.println("Лето  !");
                 break;
             case 9, 10, 11:
                 System.out.println("Куз  !");
                 break;
             case 12, 1, 2:
                 System.out.println("Зима  !");
                 break;
             default:
                 System.out.println("Ошибка  !");

         }
         return 0;
     }
}
