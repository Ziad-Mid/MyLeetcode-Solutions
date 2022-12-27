class Solution {
    public boolean digitCount(String num) {
        
        
        // Iterate through the digits in the number
        for (int i = 0; i < num.length(); i++) {
            // Count the number of occurrences of the digit at index i
            int count = 0;
            for (int j = 0; j < num.length(); j++) {
                if (Character.getNumericValue(num.charAt(j)) == i) {
                    
                    count++;
                }
            }
            System.out.println(count + " " + num.charAt(i));
            // If the count does not match the digit at index i, return false
            if (count != Character.getNumericValue(num.charAt(i))) {
                return false;
            }
        }
        // If all digits have been checked and no mismatches were found, return true
        return true;
    }
    
   
}