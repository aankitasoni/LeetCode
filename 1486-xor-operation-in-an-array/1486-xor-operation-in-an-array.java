class Solution {
    public int xorOperation(int n, int start) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[n];
        for (int i =0; i<a.length; i++){
            a[i] = start + 2*i;
        }
        int xor = 0;
        for (int i=0; i<a.length; i++){
            xor ^= a[i];
        }
        return xor;
    }
}