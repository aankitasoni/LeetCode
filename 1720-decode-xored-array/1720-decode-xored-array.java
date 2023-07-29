class Solution {
    public int[] decode(int[] en, int first) {
        int a[] = new int[en.length+1];
        a[0] = first;
        for (int i =1; i<=en.length; i++){
            a[i] = a[i-1] ^ en[i-1];
        }
        return a;
    }
}