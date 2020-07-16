public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int n = A.size();
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if(n < 1){
            return ans;
        }
        int max = A.get(n - 1);
        ans.add(max);
        for(int i = n - 2; i >= 0; i--){
            int a = A.get(i);
            if(a > max){
                max = a;
                ans.add(max);
            }
        }
        return ans;
    }
}
