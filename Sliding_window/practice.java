class Solution {
    public int numberOfSubstrings(String s) {
        int n = s.length();
        int lastSeen[] = new int[3];
        int count = 0; 
        Arrays.fill(lastSeen, -1);

        for(int i = 0; i< n; i++){
            lastSeen[s.charAt(i) - 'a'] = i;

            if(lastSeen[0] != -1 && lastSeen[1] != -1 && lastSeen[2] != -1){
                count = count + (1+ Math.min(Math.min(lastSeen[0],lastSeen[1]),lastSeen[2]));
            }
        }
        
        
        return count;
    }
}