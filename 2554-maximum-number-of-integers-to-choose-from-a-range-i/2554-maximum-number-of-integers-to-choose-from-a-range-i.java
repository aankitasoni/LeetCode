class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int sum = 0;
        int count = 0;
        int a[]=new int[100001];
        for(int i:banned)a[i]++;
        for(int i=1;i<=n;i++)
        {
            if(a[i]==0&&(i+sum)<=maxSum){
                count++;
                sum+=i;
            }
        }
        return count;  
    }
}
