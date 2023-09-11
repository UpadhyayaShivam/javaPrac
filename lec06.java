// char a[][] 
// a b s t
// c a t p
// r y z k

import java.util.*;


public class lec06{

    static int[] res;

    static boolean solve(char[][] arr,int i,int j,String temp,String target,boolean flag){

        if(i<0 || j<0 || i>=arr.length || j>=arr[0].length || temp.length()>target.length()){
            return false;
        }

        if(temp.length()==target.length()){
            if(temp.equals(target)){
                return true;
            }

            return false;
        }

        res[1]=i;
        res[3]=j;

        // if(solve(arr,i+1,j,temp+arr[i][j],target) || solve(arr,i,j+1,temp+arr[i][j],target)){
        //     return true;
        // }

        if(flag){
            if(solve(arr,i+1,j,temp+arr[i][j],target,flag)){
                return true;
            }
        }
        else{
            if(solve(arr,i,j+1,temp+arr[i][j],target,flag)){
                return true;
            }
        }

        return false;

    }
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        res=new int[4];

        System.out.println("Enter rows: ");
        int n=s.nextInt();
        System.out.println("Enter columns: ");
        int m=s.nextInt();

        char[][] arr=new char[n][m];
        System.out.println("Enter characters: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=s.next().charAt(0);
            }
        }

        System.out.println("Enter target: ");
        String target=s.next();

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                if(arr[i][j]==target.charAt(0)){
                    res[0]=i;
                    res[2]=j;

                    if(solve(arr,i,j,"",target,true)){
                        System.out.println(res[0]+" "+res[1]+" "+res[2]+" "+res[3]);
                        return;
                    }

                    if(solve(arr,i,j,"",target,false)){
                        System.out.println(res[0]+" "+res[1]+" "+res[2]+" "+res[3]);
                        return;
                    }

                }

            }
        }


        
    }
}