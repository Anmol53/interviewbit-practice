public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int carry = 1;
        for(int i = A.size() -1; carry > 0 && i >= 0; i--){
            int n = A.get(i) + carry;
            A.set(i, n % 10);
            carry = n / 10;
        }
        while(carry > 0){
            A.add(0, carry % 10);
            carry /= 10;
        }
        while(A.get(0) == 0){
            A.remove(0);
        }
        return A;
    }
}
