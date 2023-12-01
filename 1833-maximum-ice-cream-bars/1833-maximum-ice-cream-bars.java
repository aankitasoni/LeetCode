class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int count = 0, sum = 0;
        for(int i =0; i < costs.length; i++){
            sum = sum + costs[i];
            if (sum > coins){
               return i;
            }
        }
        return costs.length;
    }
}