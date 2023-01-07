class Solution {
    public int countBinarySubstrings(String s) {
        // Initialize a list of the consecutive counts of 0s and 1s
        List<Integer> counts = new ArrayList<>();
        counts.add(1);
        // Iterate through the string and compute the consecutive counts
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i-1)) {
                counts.add(1);
            } else {
                counts.set(counts.size() - 1, counts.get(counts.size() - 1) + 1);
            }
        }
        // Initialize the count of valid substrings
        int ans = 0;
        // Iterate through the counts and add the minimum of the current and previous count to the answer
        for (int i = 1; i < counts.size(); i++) {
            ans += Math.min(counts.get(i), counts.get(i-1));
        }
        return ans;
    }
       
 
}



