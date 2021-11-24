import java.util.Scanner;

public class ReverseString {
        public static void main(String[]args){
            System.out.println("Unesi rec");
            Scanner scanner=new Scanner(System.in);
            String rec=scanner.next();
            String reverse="";

            for(int i=rec.length()-1; i>=0; i-- ){
                reverse=reverse+rec.charAt(i);
            }
            System.out.println("Obrnuta rec");
            System.out.println(reverse);

        }
    }


