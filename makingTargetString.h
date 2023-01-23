class Solution {
    public boolean makeStringsEqual(String s, String target) {
        if(s.equals(target)) return true;
        else{
            int a=0,b=0,c=0,d=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='0') a++;
                if(target.charAt(i)=='0') b++;
                if(s.charAt(i)=='1') c++;
                if(target.charAt(i)=='1') d++;
            }
            if(b==s.length() && a<b) return false;
            if(d>0 && c==0) return false;
            return true;
        }
    }
}
