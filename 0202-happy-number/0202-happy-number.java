class Solution {
    public boolean isHappy(int n) {
      HashSet<Integer> set = new HashSet<>();
        while(n != 1){
            if(set.contains(n)){
                return false;
            }
            set.add(n);
            int sum = 0;
            while(n > 0){
                int num = n % 10;
                sum  += num * num;
                n /= 10;
            }
            n = sum;
        }
        return true;  
    }
}