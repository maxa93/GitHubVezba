public class Reverse2 {
    public static void main(String[]args){
        String name = "Beograd";

        String reversedString = new StringBuilder(name).reverse().toString();

        System.out.println(reversedString);
    }
}
