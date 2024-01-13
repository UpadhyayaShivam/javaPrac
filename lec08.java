// batcat 
//  b <-> a replace krna h
// abtcbt

//  aaa aba bba 
// aa <-> bb
// bba aba aaa

import java.util.Scanner;

   

public class  lec08 {

     public static void replaceChar(String str){
        char str1[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
             if(str.charAt(i) == 'a'){
                str1[i] = 'b';
            }else if(str.charAt(i) == 'b'){
                str1[i] = 'a';
            }else{
                str1[i] = str.charAt(i);
            }
        }
        System.out.print(str1);
    }
    
    public static void main(String[] args) {
        // String  str = "batcat";
        // char str1[] = new char[str.length()];
        // for (int i = 0; i < str.length(); i++) {
        //     if(str.charAt(i) == 'a'){
        //         str1[i] = 'b';
        //     }else if(str.charAt(i) == 'b'){
        //         str1[i] = 'a';
        //     }else{
        //         str1[i] = str.charAt(i);
        //     }
        // }

        // for (int i = 0; i < str1.length; i++) {
        //     System.out.print(str1[i]);
        // }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str[] = new String[n];
        for (int i = 0; i <n; i++) {
            str[i] = sc.next();
        }
        replaceChar(str);
        System.out.println();
    }     
}