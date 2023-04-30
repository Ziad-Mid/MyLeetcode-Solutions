class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int start = 0;
        int end = arr.length - 1;
        
        //dichotomic search
        
        while (start <= end) {
            //get the middle index
            int middle = start + (end - start) / 2;
            
            //check if the max number is on the right or left side of the middle number of the array
            if (arr[middle] < arr[middle + 1]) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        return start;
    }
}
