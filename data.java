import java.util.Scanner;

public class data {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Wwedite denj: ");
        int day = scanner.nextInt();

        System.out.print("Wwedite mesyaz: ");
        int mon = scanner.nextInt();

        System.out.print("Wwedite god: ");
        int year = scanner.nextInt();

        int maxdays = 30;
        

 //       {
 //           System.out.println ("Wwedennaya data: " + day +"." + mon + "." + year);
 //       }
 //       int maxday;

         if (mon == 1 || mon == 3 || mon == 5 || mon == 7 || mon == 8 || mon == 10 || mon == 12) {
             int maxdays == 31;}

 //        else if (mon == 4 || mon == 6 || mon == 9 || mon == 11)
 //            int maxdays == 30;

         else if (mon == 2) {
             maxdays = 28; }

        if (day < maxdays) {
            System.out.println( "Sledujushij denj: " + day+1 + "." + mon + "." + year);
        }else if (day==maxdays) {
            System.out.println("Sledujushij denj: " + day == 1 + "." + mon++ + "." + year);
        }else if (day==maxdays || mon == 12) {
            System.out.println("Sledujushij denj: " + day == 1 + "." + mon ==1 + "." + year++);
        }






    }
}
