import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        String numberWOrd;
        System.out.println("Podaj słownie liczbę od jeden do dziesieciu:");
        numberWOrd = number.nextLine();

        NumerToConvert Num = new NumerToConvert();


        long numberNumeric;

        numberNumeric = Num.ConvertNumber(numberWOrd);
        System.out.println("Liczba " + numberWOrd + " to: " + numberNumeric);

    }
}
