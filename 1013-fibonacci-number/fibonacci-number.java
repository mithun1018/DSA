class Solution {
    int print(int n){
        if(n==0 || n==1){
            return n;
        }
        return print(n-1)+print(n-2);
    }
    public int fib(int n) {
       return print(n);
    }


}