import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Unesi dan u tjednu: ");
        int dan = scan.nextInt();
        switch (dan) {
            case 1:
                System.out.println("Ponedjeljak");
                break;
            case 2:
                System.out.println("Utorak");
                break;
            case 3:
                System.out.println("Srijeda");
                break;
            case 4:
                System.out.println("Cetvrtak");
                break;
            case 5:
                System.out.println("Petak-Peetaak");
                break;
            case 6:
                System.out.println("Subota");
                break;
            case 7:
                System.out.println("Nedjelja");
                break;
        }
    }
}