import java.util.*;

public class lec03{
    public static int sumNumber(int arr[]){
        int n = arr.length;
        int sum1=0,sum2=0,temp;
        // if(n<=0){
        //     return 
        // }
        for (int i = 0; i < arr.length; i++) {
            sum1+=arr[i];
        }
        // String str = String.valueOf(sum1);
        // for(int j=0;j<0;j++){
        //     sum2;
        // }
            temp=sum1;
        while(sum1>=10){
            while(temp>0){
                int digits = temp%10;
                sum2+=digits;
                temp/=10;
            }
        }

        return sum2;
    }
    public static int numbersRepeat(int n){
        if(n==0){
            return 0;
        }
        String str = String.valueOf(n);
        
        return str.length();

    }

    public static String repeated(int n, String str){
        if(n==0){
            return " ";
        }
        return str+ repeated(n-1, str);

    }

    public static void main(String[] args) {
        int n;
        String str,ans;
        Scanner sc = new Scanner(System.in);
        // System.out.println("enter number how many times string to be repeated");
        // n = sc.nextInt();
        // str = sc.next();
        // ans = repeated(n, str);
        // int n1;
        // System.out.println("enter number to check repeatition");
        // n1 = sc.nextInt();
        // int ans1 = numbersRepeat(n1);
        // System.out.println(ans);
        // System.out.println(ans1);
        System.out.println("enter arr size");
        int n2 = sc.nextInt();
        int arr [] = new int[n2];
        System.out.println("enter array");
        for(int i=0;i<n2;i++){
            arr[i] = sc.nextInt();
        }
        int ans3;
        ans3 = sumNumber(arr);
        System.out.println(ans3);
    }
}