class Solution {
    public int maxArea(int[] height) {
        int maxwater=0;
        for(int i = 0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                int wid=j-i;
                int ht = Math.min(height[i],height[j]);
                int area = wid*ht;
                maxwater= Math.max(maxwater,area);
            }
        }
        return maxwater;
    }
}
