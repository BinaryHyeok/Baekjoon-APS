import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int answer = 0;
        for(int i = 0; i < n; i++){
            int h = citations[i];
            // h이전의 개수가 h이하, h이후의 개수가 h이상이면
            if(i + 1 <= h && h <= n - i){
                answer = Math.max(answer, h);
            }
        }
        return answer;
    }
}