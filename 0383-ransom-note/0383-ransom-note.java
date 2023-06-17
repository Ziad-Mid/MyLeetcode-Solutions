class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        char ransomNoteChar[] = ransomNote.toCharArray();
        char magazineChar[] = magazine.toCharArray();
        int n = ransomNote.length();
        int m = magazine.length();
        
        Arrays.sort(ransomNoteChar);
        Arrays.sort(magazineChar);
        
        int i=0;
        int j=0;
        
        while(i<m && j<n){
            System.out.println(i+" "+j);
            if(magazineChar[i] == ransomNoteChar[j] ){
                j++;
            }
            i++;
        }
        return j == n;
    }
}