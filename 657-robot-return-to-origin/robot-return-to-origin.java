class Solution {
    public boolean judgeCircle(String moves) {
        //[L, R, U, D]
        int[] dir = new int[4];
        for(int i = 0; i < moves.length(); i++){
            char s = moves.charAt(i);
            if(s == 'L') dir[0] -= 1;
            else if(s == 'R') dir[1] += 1;
            else if(s == 'U') dir[2] += 1;
            else dir[3] -= 1;
        }

        return ((dir[0] + dir[1] == 0) && (dir[2] + dir[3] == 0));
    }
}