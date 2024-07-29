class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        if( n == 1){
            int count = 0;
            for(int i=0; i<=b; i++){
                int[] answer = new int[count++];
                answer[i] = num_list[i];
            }
        }else if(n == 2){
            int count2 = 0;
            for(int i =a; i<num_list.length; i++){
                answer == new int[count2++];
                answer[count2++] = num_list[i];
            }
        }else if(n == 3){
            int count3 = 0;
            for(int i =a; i<=b; i++){
                answer == new int[count3++];
                answer[count3++] = num_list[i];
            }
        }else{
            int count4 = 0;
            for(int i =a; i<=b; i++){
                answer == new int[count4++];
                answer[count4++] = num_list[i];
            }
        }
        return answer;
    }
}
/*

int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        ArrayList<Integer> list = new ArrayList<>();
        if(n==1){
            for(int i = 0; i<=b; i++){
                list.add(num_list[i]);
            }
        }else if(n==2){
            for(int i = a; i<num_list.length; i++){
                list.add(num_list[i]);
            }
        }else if(n==3){
            for(int i = a; i<=b; i++){
                list.add(num_list[i]);
            }
        }else{
            for(int i = a; i <=b; i +=c){
                list.add(num_list[i]);
            }
        }
        int[] answer = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
*/