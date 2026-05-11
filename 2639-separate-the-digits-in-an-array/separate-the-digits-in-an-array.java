class Solution {
    public int[] separateDigits(int[] nums) {
        
        int totalDigits = 0;
        for (int i : nums) {
            totalDigits += String.valueOf(i).length();
        }

        int[] result = new int[totalDigits];
        int index = 0;
        
        for (int i : nums) {
            String num = String.valueOf(i);
            for (int j = 0; j < num.length(); j++) {
                result[index++] = num.charAt(j) - '0';
            }
        }
        
        return result;
    }
}