public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(32));
    }

    public int solution(int N) {
        String binary = Integer.toBinaryString(N);
        System.out.println(binary);

        byte biggestGap = 0;
        byte gap = 0;

        for (int i = 0; i < binary.length(); i++) {
            char character = binary.charAt(i);
            if (character == '1') {
                if (gap > biggestGap)
                    biggestGap = gap;
                gap = 0;
            } else {
                gap++;
            }
        }
        return biggestGap;
    }
}

