public class CountSpecificCharacter {
        public static void main (String[] args){
            String string = "elephant";
            char letter =  'a';
            int count = 0;
            for(int i=0; i<string.length (); i++) {
                if(string.charAt ( i ) ==letter)
                    count++;
            }
            System.out.println ("Letter " + letter + " apears " + count + " time/s.");
        }
    }
