class Solution {
    public int[] decode(int[] en, int first) {
        int a[] = new int[en.length+1];
        a[0] = first;
        for (int i =0; i<en.length; i++){
            a[i+1] = a[i] ^ en[i];
        }
        return a;
    }
}