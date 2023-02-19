class Solution {
    public int minimumSum(int num) {
        int[] digitsNum = new int[4];
        int i=0;
        while(i<=3)
        {
            digitsNum[i++] = num%10;
            num/=10;
        }
        Arrays.sort(digitsNum);
        
        int firstNumber = digitsNum[0]*10+digitsNum[2];
        int secondNumber = digitsNum[1]*10+digitsNum[3];
        
        return firstNumber+secondNumber;
    }
}

 