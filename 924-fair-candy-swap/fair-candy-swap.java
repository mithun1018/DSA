class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int a = sum(aliceSizes);
        int b = sum(bobSizes);
        int dif = (b-a)/2;

        for (int i=0;i<aliceSizes.length;i++) {
            for (int j=0;j<bobSizes.length;j++) {
                if (bobSizes[j]-aliceSizes[i]==dif){
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
