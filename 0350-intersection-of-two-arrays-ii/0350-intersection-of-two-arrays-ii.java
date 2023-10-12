class Solution {
    public int[] intersect(int[] a1, int[] a2) {
        Arrays.sort(a1);
        Arrays.sort(a2);
        ArrayList<Integer> al = new ArrayList<>();
        int i =0, j =0;
        while(i < a1.length && j < a2.length){
            if (a1[i] < a2[j]){
                i++;
            } else if (a1[i] > a2[j]){
                j++;
            } else {
                al.add(a1[i]);
                    i++;
                    j++;
                }
            }
        int a[] = new int[al.size()];
        int p =0;
        for (int x : al){
           a[p++] = x;
        }
        return a;
    }
}