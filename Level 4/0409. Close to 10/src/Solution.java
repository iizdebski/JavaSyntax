

public class Solution {

    public static void main(String[] args) {

        closeToTen(8, 11);
        closeToTen(14, 7);
    }

    public static void closeToTen(int a, int b) {

        int a1;
        int b1;

        a1 = Solution.abs(10-a);
        b1 = Solution.abs(10-b);
        if(a1<=b1){
            if(a1==b1)
                System.out.println(a);
            else
                System.out.println(b);
        }
        else
            System.out.println(b);
    }
    public static int abs (int a){
        if(a<0){
            return -a;
        } else{
            return a;
        }
    }
}
