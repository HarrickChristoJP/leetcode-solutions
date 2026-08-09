class Solution {


     static {
        String[] arr = new String[1];
        for (int i = 0; i < 500; i++) {
            judgeCircle("");
        }
    }
    static public boolean judgeCircle(String moves) {

        if(moves.length()%2!=0) return false;
        int[] frence=new int[26];

        for(char movesIt:moves.toCharArray()) frence[movesIt-'A']++;

     return (frence['U'-'A']==frence['D'-'A'] && frence['R'-'A']==frence['L'-'A']);   
    }
}