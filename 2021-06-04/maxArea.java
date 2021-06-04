class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(verticalCuts);
		Arrays.sort(horizontalCuts);
			
		int cutH = horizontalCuts[0];		
		int startH = 0;		
		int area = 0;					
		int indexH = 0;
		
		while(true) {
			int startV = 0;
			int indexV = 0;
			int cutV = verticalCuts[0];			
			while(true) {			
				area = Math.max(area, (cutH - startH) * (cutV - startV));				
				if(cutV == w) {
					break;
				}else if(indexV+1 == verticalCuts.length){
					startV = cutV;
					cutV = w;						
				}
				else {
					startV = cutV;						
					indexV++;
					cutV = verticalCuts[indexV];
				}
			}			
			if(cutH == h) {
				break;
			}else if(indexH+1 == horizontalCuts.length){
				startH = cutH;
				cutH = h;						
			}
			else {
				startH = cutH;
				indexH++;
				cutH = horizontalCuts[indexH];
			}			
		}

		return area;
    }