class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        List<Integer> al = new ArrayList<>();
        for (int i : salary){
            al.add(i);
        }
        al.remove(0);
        al.remove(al.size()-1);
        int sum =0;
        for (int i=0; i <al.size(); i++){
            sum += al.get(i);
        }
        return (double)sum/al.size();
    }
}
