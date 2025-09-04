class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
            set.add(reverse(num));
        }
        return set.size();

        
    }
    int reverse(int nums){
        int rev = 0;
        while(nums > 0){
            rev*=10; 
            rev += nums % 10;
            nums = nums / 10;
            
        }
        return rev;
    }
}