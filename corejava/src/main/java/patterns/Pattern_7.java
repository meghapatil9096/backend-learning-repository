package patterns;

public class Pattern_7 {
//    12345
//    1234
//    123
//    12
//    1
    public static void main(String[] args){
        int n=6;
        for(int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
