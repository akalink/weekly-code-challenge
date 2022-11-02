import java.util.Arrays;
import java.util.LinkedList;

public class Driver {
    public static void main(String[] args) {
        System.out.println(Atbash("apple"));
        System.out.println(Atbash("Hello world!"));
        System.out.println(Atbash("Christmas is the 25th of December"));
        System.out.println(Atbash("Las Vega's is 50% city and 50% suburb"));
    }

    private static String Atbash(String s){
        char[] c = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        int i;
        for (char l : c) {
            //System.out.print(l);
            if(!Character.isLetter(l)){
                sb.append(l);
                continue;
            }
            if((int) l > 90){
                i = (int) l - 97;
                sb.append((char)(26 - i + 96));
            } else {
                i = (int) l - 65;
                sb.append((char) (26-i + 64));
            }
        }
        return sb.toString();
    }

}


