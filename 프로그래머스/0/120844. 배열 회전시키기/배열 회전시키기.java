class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        int count = 0;
        int co =1;
            if(direction.equals("right")){
                 answer[0] = numbers[numbers.length-1];
                for(int i =0; i<numbers.length-1; i++){
                    answer[co++] = numbers[i]; 
                }
            }else{
                answer[numbers.length-1] = numbers[0];
                for(int i = 1; i < numbers.length; i++){
                    answer[count++] = numbers[i];
                }
            }
        
        return answer;
    }
}