import java.util.Scanner;

public class PoleProstokata {
    public void calculate(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Pole prostokąta");
        System.out.println("Autor: Kuba M");
        System.out.println("Podaj a:");
        double a = Double.parseDouble(sc.nextLine());
        System.out.println("Podaj b:");
        double b = Double.parseDouble(sc.nextLine());
        System.out.println("Pole wynosi: " + (a * b));
    }
}
