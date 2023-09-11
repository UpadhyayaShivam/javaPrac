public class lec2 {
    static int find(int a[] , int n){
        if(n==1){
            return 1;
        }
        if(a[n-2]%2==0){
            return a[n-1]+2*find(a, n-1);
        }

        return n-find(a, n-1);
       
    }
    public static void main(String[] args) {
        int a[] = {8,4,1,3,9,6};
        int n= a.length;
        int ab = find(a,n);
        System.out.println(ab); 
        

    }
}
