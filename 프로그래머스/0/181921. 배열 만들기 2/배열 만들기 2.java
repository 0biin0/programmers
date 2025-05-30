import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> answer = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            String s = String.valueOf(i);
            boolean valid = true;

            for (char c : s.toCharArray()) {
                if (c != '0' && c != '5') {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                answer.add(i);
            }
        }

        if (answer.isEmpty()) return new int[] {-1};

        int[] result = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            result[i] = answer.get(i);
        }

        return result;
    }
}
