import java.util.*;
class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        int[] arr = {a,b,c,d};
        
        Arrays.sort(arr); 
        
        a=arr[0];b=arr[1];c=arr[2];d=arr[3];
        
       answer= 
        //모두가 같을때
        (a==d) ? 1111*a :
        //한개만 다를때
        (a==c&&a!=d) ? (10*a+d)*(10*a+d):
        (d==b&&a!=d) ? (10*d+a)*(10*d+a):
        //두개씩 같을때
        (a==b&&c==d) ? (a+c)*Math.abs(a-c):
        //두개만 같을때
        a==b? c*d :
        b==c? a*d :
        c==d? a*b :
        //모두 다를때
        a;
        
         
        
        return answer;
    }
}