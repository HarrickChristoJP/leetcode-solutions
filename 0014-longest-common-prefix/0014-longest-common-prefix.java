class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Base case: if the array is empty, return an empty string
        if (strs == null || strs.length == 0) {
            return "";
        }
        
        // Initialize the prefix as the first entire word
        String prefix = strs[0];
        
        // Compare the prefix with every other string in the array
        for (int i = 1; i < strs.length; i++) {
            // Shorten the prefix while it is not found at the start of strs[i]
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                
                // If the prefix becomes completely empty, there is no common prefix
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        
        return prefix;
    }
}
