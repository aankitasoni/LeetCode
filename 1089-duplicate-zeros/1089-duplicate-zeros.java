class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        List<Integer> al = new ArrayList<>();
        for(int i=0; i<n; i++) {
            if(arr[i]==0) {
                al.add(0);
                al.add(0);
            }
            else {
                al.add(arr[i]);
            }
        }
        for(int i=0; i<n; i++) {
            arr[i] = al.get(i);
        }
    }
}