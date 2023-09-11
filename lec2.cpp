// #include <iostream>
// #include <string>
// #include <bits/stdc++.h>

// using namespace std;

// int find(int a[], int n){
//     if(n==0){
//         return 1;
//     }
//     if(*a%2==0){
//         return n+2*find(a+1,n-1);
//     }
//     else{
//         return n- find(a+1,n-1);
//     }
// }

// int main(){
//     int a[] = {8,4,1,3,9,6};
//     int n = sizeof(a); 
//     find(a,n);
//     return  0;
// }

// #include <iostream>

// using namespace std;

// int find(int a[], int n) {
//     // Base case: if n is 0, we return a specific value (e.g., 0).
//     // You should modify this base case based on the desired behavior.
//     if (n == 0) {
//         return 0;
//     }
    
//     if (*a % 2 == 0) {
//         return n + 2 * find(a + 1, n - 1);
//     } else {
//         return n - find(a + 1, n - 1);
//     }
// }

// int main() {
//     int a[] = {8, 4, 1, 3, 9, 6};
//     int n = sizeof(a) / sizeof(a[0]);
//     int result = find(a, n);
//     cout << "Result: " << result << endl;
//     return 0;
// }

#include <iostream>

using namespace std;


int main() {
//    static  int i=5;
//     if(i!=0){
//         cout<<i--<<endl;
//     }
//     main();
    int arr[4][4] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    // 1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10

    return 0;
}

