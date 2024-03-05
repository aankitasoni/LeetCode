class Solution {
    public int minimumLength(String s) {
      int n=s.length();
     char a[]=s.toCharArray();
     int i=0,j=n-1;int c=0;
     while(i<j && a[i]==a[j]){
             char m=a[i];
             while(i<=j && a[i]==m)i++;
             while(j>=i && a[j]==m)j-=1;
     }
    
    return j-i+1;
    }
}