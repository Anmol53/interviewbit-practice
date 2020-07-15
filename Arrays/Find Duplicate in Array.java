public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int repeatedNumber(final List<Integer> A) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for(int x : A){
            if(hs.contains(x)){
                return x;
            }
            hs.add(x);
        }
        return A.get(0);
    }
}
