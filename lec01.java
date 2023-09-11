import java.util.*;


// CSA adressing nodes**


public class lec01{

    static int maxEl(int arr[],int N,int max){

        if(arr[N]>max){
            max = arr[N];
        }
        if(N == arr.length-1){
            return max;
        }


       return maxEl(arr,N+1,max);
    }

    public static void main(String args[]){

        int arr[]={70,300,500,60};

        int c = maxEl(arr,0,-1);
        System.out.println(c);

    }
}