import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name1 = "Kenan";
        String surname1 = "Alizade";
        byte age1 = 27;
        double money1 = 100;

        String name2 = "Cingiz";
        String surname2 = "Alizade";
        byte age2 = 26;
        double money2 = 200;
        int i = 0;
int mebleg=0;
        while (i != 3) {
            System.out.println(" case secin");

            int prosesCase = scanner.nextInt();

            switch (prosesCase) {
                case 1:
                    System.out.println("meblegi daxil edin");
                     mebleg = scanner.nextInt();
                    if (mebleg < money1) {
                        money1 = money1 - mebleg;
                        money2 = money2 + mebleg;
                        System.out.println("money1: " + money1);
                        System.out.println("money2: " + money2);
                    } else {
                        System.out.println("balansda kifayet qeder mebleg yoxdu");
                    }
                    break;
                case 2:
                    System.out.println("meblegi daxil edin");
                     mebleg = scanner.nextInt();
                    if (mebleg < money2) {
                        money2 = money2 - mebleg;
                        money1 = money1 + mebleg;
                        System.out.println("money1: " + money1);
                        System.out.println("money2: " + money2);
                    } else {
                        System.out.println("balansda kifayet qeder mebleg yoxdu");

                    }
                    break;
                case 3:
                    i = 3;
                    System.out.println("proses bitmisdir");
                    break;


            }


        }
    }
}