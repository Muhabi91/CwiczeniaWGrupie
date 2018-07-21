import java.security.InvalidAlgorithmParameterException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InvalidAlgorithmParameterException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Wskaż projekt z którego chcesz skorzystac:");
        System.out.println("1. Kuba M: Pole prostokata");

        //inne projekty


        System.out.println("Wybieram projekt:");
        int numer = Integer.parseInt(sc.nextLine());
        switch (numer){
            case 1:
                PoleProstokata pp = new PoleProstokata();
                pp.calculate();
                break;
            //Kolejne casy

            default:
                throw new InvalidAlgorithmParameterException("Nie wybrano projektu!");
        }
    }
}
