package Array;

import java.sql.Array;

class Solution {
    static void main() {
        Solution solution = new Solution();
        System.out.println(solution.minOperations(new int[]{4,4}));
    }

    public int minOperations(int[] nums) {
        return solve(nums, 0);
    }

    public int solve(int[] nums, int idx){
        if(idx >= nums.length) return 0;
        int num = nums[idx];
        if(idx %2 == 0) {
            if (isPrime(num)) {
                return solve(nums, idx+1);
            } else {
                int op = 0;
                while (!(isPrime(num))) {
                    op++;
                    num++;
                }
                return op + solve(nums, idx + 1);
            }
        }
        else{
            if (!isPrime(num)) {
                return solve(nums, idx+1);
            } else {
                int op = 0;
                while ((isPrime(num))) {
                    op++;
                    num++;
                }
                return op + solve(nums, idx + 1);
            }
        }
    }

    public boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i* i <=n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
