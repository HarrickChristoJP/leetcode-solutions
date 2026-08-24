class Solution {
    public int scoreOfString(String s) {
        int totalScore = 0;
        
       
        for (int i = 1; i < s.length(); i++) {

            totalScore += Math.abs(s.charAt(i) - s.charAt(i - 1));
        }
        
        return totalScore;
    }
}
