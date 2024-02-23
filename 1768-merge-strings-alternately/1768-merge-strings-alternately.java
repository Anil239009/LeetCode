class Solution {
    public String mergeAlternately(String s1, String s2) {
        String s = "";
        int i;
        int ind=0;
        for(i=0;i<Math.min(s1.length(),s2.length());i++){
            s+=s1.charAt(i);
            s+=s2.charAt(i);
        }
        ind=i;
        while(s1.length()>ind){
            s+=s1.charAt(ind);
            ind++;
        }
        while(s2.length()>ind){
            s+=s2.charAt(ind);
            ind++;
        }
        return s;
    }
}