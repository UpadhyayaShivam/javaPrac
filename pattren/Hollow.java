package pattren;
import java.util.*;
//  1 2 3 4 5 
//  * * * * * 1 
//  *       * 2
//  *       * 3
//  *       * 4
//  * * * * * 5
public class Hollow {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0 || j==n-1 || i==n-1){

                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
