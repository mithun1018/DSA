class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int a = sum(aliceSizes);
        int b = sum(bobSizes);
        // int dif = (b-a)/2;

        for (int i=0;i<aliceSizes.length;i++) {
            for (int j=0;j<bobSizes.length;j++) {
                int tempA=a-aliceSizes[i]+bobSizes[j];
                int tempB=b-bobSizes[j]+aliceSizes[i];
                if (tempA==tempB){
                    return new int[]{aliceSizes[i], bobSizes[j]};
                }
            }
        }

        return new int[0]; 
    }

    public static int sum(int[] aliceSizes) {
        int sum = 0;
        for (int i = 0; i < aliceSizes.length; i++) {
            sum += aliceSizes[i];
        }
        return sum;
    }

   
}
