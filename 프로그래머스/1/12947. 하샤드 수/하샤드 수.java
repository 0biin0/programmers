class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String an = "";
        int a = 0;
        an = Integer.toString(x);
        String[] list = an.split("");
        for(int i = 0; i<list.length; i++){
            a += Integer.parseInt(list[i]);
        }
        if(x % a == 0){
            return answer;
        }else{
            return false;
        }
        
    }
}