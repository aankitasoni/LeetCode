class Solution {
    public int mostFrequentEven(int[] nums) {
        int[] arr = new int[100001];
        int ans = 1;
        for(int i : nums){
            if(i % 2 == 0){
                arr[i]++;
                if ((arr[ans] < arr[i]) || (arr[ans] == arr[i] && ans > i)){
                    ans = i;
                }
            }
        }
        if (ans == 1) return -1;
        return ans;
    }
}



//         List<Integer> al = new ArrayList<>();
//         List<Integer> all = new ArrayList<>();
//         int count = 0;
//         for (int i =0; i<nums.length; i++){
//             if (nums[i] % 2 == 0){
//                 al.add(nums[i]);
//             } 
//             // count = -1;
//         }
     
//        for (int i=0; i<al.size(); i++){
//            all.add(Collections.frequency(al, al.get(i)));
//        }
//        count = Collections.max(all) ;
//         return count;