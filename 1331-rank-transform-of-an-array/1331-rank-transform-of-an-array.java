class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        Map<Integer,Integer> hm = new HashMap<>();
        
        int[] copyOfArray = Arrays.copyOf(arr, arr.length);
        int count = 1;
        Arrays.sort(copyOfArray);
        
        for(int i = 0 ; i < copyOfArray.length ; i++){
            if(!hm.containsKey(copyOfArray[i])){
                hm.put(copyOfArray[i],count);
                count++;
            }
        }
        
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = hm.get(arr[i]);
        }
        
        return arr;
    }
}