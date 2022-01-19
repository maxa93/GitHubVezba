import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        String primer = "Ovo je prvi primer";
        int brojkaraktera = primer.length();
        System.out.println("Broj karaktera " + brojkaraktera);
        int brojKarakteraBezRazmaka = primer.replace(" ", "").length();
        System.out.println("Broj karaktera bez razmaka " + brojKarakteraBezRazmaka);

    }
}





