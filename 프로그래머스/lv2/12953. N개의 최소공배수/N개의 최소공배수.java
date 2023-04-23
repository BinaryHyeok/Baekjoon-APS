class Solution {
    public int solution(int[] arr) {
        
        int a = arr[0];
        for(int i = 1; i < arr.length; i++){
           a = lcm(a, arr[i]);
        }
        
        return a;
    }
    
    public int gcd(int a, int b){
        if(a % b == 0) return b;
        else return gcd(b, a % b);
    }
    
    public int lcm (int a, int b){
        return a * b / gcd(a, b);
    }
}