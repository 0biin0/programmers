class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        String d1 = "";
        String d2 = "";
        for(int i=0; i<date1.length; i++){
            d1 += Integer.toString(date1[i]);
            d2 += Integer.toString(date2[i]);
        }
        if(Integer.parseInt(d1) < Integer.parseInt(d2)){
            return 1;
        }else{
            return answer;    
        }
        
    }
}