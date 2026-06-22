package patterns;

public class Pattern_14 {
//       *
//      ***
//     *****
//    *******
//    *******
//     *****
//      ***
//       *

    public static void main(String[] args){
        int n=5;
//        1st half
        for (int i=1; i<n; i++){
//            space
            for (int j=2; j<=n-i; j++){
                System.out.print("_");
            }
//            1st half
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
//            2nd half
            for (int j=2; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
//        2nd half
        for(int i=4; i>=1; i--){
//            space
            for (int j=2; j<=n-i; j++){
                System.out.print("_");
            }
//            1st half
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
//            2nd half
            for (int j=2; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
