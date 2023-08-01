class Solution {
    public int kthFactor(int n, int k) {
        List<Integer> al = new ArrayList<>();
        int a = 0;
        for (int i=1; i<= n; i++ ){
            if (n % i == 0){
               al.add(i);
            }
        }
        for (int i=0; i< al.size() ; i++){
            if ( i+1 == k){
                a += al.get(i);
                return a;
            }
        }
        return -1;
       
    }
}
 // for (int i=0; i< al.size() ; i++){
 //            if ( i+1 == k){
 //                a += al.get(i+1)+1;
 //                break;
 //            }
 //        }
 //        return a;