class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        	
		Arrays.sort(verticalCuts);
		Arrays.sort(horizontalCuts);		
		int modVal = 1000000007;
		
		int biggestW = maxGap(verticalCuts, w);		
		int biggestH = maxGap(horizontalCuts, h);				
		return (biggestH*biggestW)  % modVal;
	}
	
	public int maxGap(int[] arr, int max) {		
		int gap = Math.max(0, arr[0] - 0);
		int last = arr[0];		
		for(int i = 1; i<arr.length; i++) {
			gap = Math.max(gap, arr[i] - arr[i-1]);
			last = arr[i];			
		}		
		gap = Math.max(gap, max - last);		
		return gap;
	}
}