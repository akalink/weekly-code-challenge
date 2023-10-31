import java.util.*;

public class Driver1030 {

    static final String isMagic ="This is magic";
    static final String isNotMagic  = "This is not magic";
    public static void main(String[] args) {


        System.out.println("Is this a magic index? " + (Driver1030.IsMagicIndex(new int[]{0,1,2,3,4,5})  ? isMagic : isNotMagic));
        System.out.println("Is this a magic index? " + (Driver1030.IsMagicIndex(new int[]{0,1,2,3,4,6}) ? isMagic : isNotMagic));
    //        Follow up: What if the values are not distinct?
    //                Then it wouldn't be a magic index? An index is inheriently distinct to differenciate the plament in the array,
    //                  so have duplicate values would make it not a magic index

        System.out.println("5 * 25 = " + Driver1030.RecursiveMultiply(5,25));
        System.out.println("2 * 31 = " + Driver1030.RecursiveMultiply(2,31));
        System.out.println("Error check" + Driver1030.RecursiveMultiply(-5,1));
        System.out.println("3756 * 783 = " + Driver1030.RecursiveMultiply(3756,783));
        HashSet<Integer> hs = new HashSet<>();
        hs.add(5);
        hs.add(7);
        hs.add(4);
        hs.add(9);
        System.out.println("Subset range 5 to 7 of "+ hs.toString() + " is " + Driver1030.ReturnSubset(hs, 5,9).toString());
        System.out.println("Subset range 4 to 10 of "+ hs.toString() + " is " + Driver1030.ReturnSubset(hs, 4,10).toString());
    }

    public static Boolean IsMagicIndex(int[] a){
        Boolean isMagic = true;
        for(int i = 0; i < a.length; i++){
            if(a[i] != i){
                isMagic = false;
                break;
            }
        }
        return isMagic;
    }

    public static int RecursiveMultiply(int a, int b){
        if(a < 0|| b < 0){
            return -1;
        }

        if(b == 1) return a;
        b--;
        return  a+=RecursiveMultiply(a,b);
    }

    public static Set<Integer> ReturnSubset(Set<Integer>s, int a, int b) {
        Set<Integer> ss = new TreeSet<>();
        if(a >= b){
            int t = a;
            a = b;
            b = t;
        }
        while(a < b){

            if(s.contains(a)){
                ss.add(a);
            }
            a++;
        }

        return ss;
    }
}
