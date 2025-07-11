class Solution {
    public int gcd(int a,int b)
    {
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public int[] solution(int n, int m) {
        int gcd=gcd(n,m),lcm=n*m/gcd;
        int[] answer = {gcd,lcm};
        return answer;
    }
}