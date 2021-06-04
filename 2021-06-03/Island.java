import java.util.HashSet;
import java.util.Set;
import java.util.Stack;


//Find connected ones in array

public class Island {
	
	static Set<String>  setVisited = new HashSet<String>();
    static int areaSize = 0;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int grid[][] = {
				{0,0,1,0,0,0,0,1,0,0,0,0,0},
				{0,0,0,0,0,0,0,1,1,1,0,0,0},
				{0,1,1,0,1,0,0,0,0,0,0,0,0},
				{0,1,0,0,1,1,0,0,1,0,1,0,0},
				{0,1,0,0,1,1,0,0,1,1,1,0,0},
				{0,0,0,0,0,0,0,0,0,0,1,0,0},
				{0,0,0,0,0,0,0,1,1,1,0,0,0},
				{0,0,0,0,0,0,0,1,1,0,0,0,0}};
		
		int grid2[][] = {
				{0,1},
				{1,1}};
		int grid3[][] = {
				{1,0,0},
				{1,1,1}
		};
		
		maxAreaOfIsland(grid3);
		System.out.println(areaSize);
	}
	
	//Set for visited locations
    
    public static int maxAreaOfIsland(int[][] grid) {

        //Loop through outer arr
        for(int y = 0; y < grid.length; y++){
            //Loop through inner arr look for 1
            for(int x = 0; x < grid[y].length; x++){
                
                if(!setVisited.contains(y+","+x)){
                    setVisited.add(y+","+x);
                    
                    if(grid[y][x] == 1){
                        findArea(grid, y, x);
                    }
                }
            }
        }
        
        return areaSize;
    }
    
    public static void findArea(int[][] grid, int y, int x){
         int size = 1;
        Stack<String> stack = new Stack<String>();
        
        if(y+1 != grid.length) {
        	if(grid[y+1][x] == 1){
                int temp = y+1;
                stack.push(temp+","+x);
                setVisited.add(temp+","+x);
            }
        }
        
        if(x+1 != grid[y].length) {
	        if(grid[y][x+1] == 1){
	        	int temp = x+1;
	            stack.push(y+","+temp);
	            setVisited.add(y+","+temp);
	        }
        }
        
        
        while(!stack.empty()){
            size++;
            String location = stack.pop();
            
            String arr[] = location.split(",");
            int newY = Integer.parseInt(arr[0]);
            int newX = Integer.parseInt(arr[1]);
            
            if(newY+1 != grid.length) {
            	int temp = newY+1;
            	if(grid[temp][newX] == 1){ 
            		if(!setVisited.contains(temp+","+newX)) {
            			stack.push(temp+","+newX);
                        setVisited.add(temp+","+newX);
            		}
                    
                }
            }
            
            if(newX+1 != grid[newY].length) {
            	int temp = newX+1;
            	if(grid[newY][temp] == 1 && !setVisited.contains(newY+","+temp)){               
                    stack.push(newY+","+temp);
                    setVisited.add(newY+","+temp);
                }
            }
            
                          
            if(newX-1>=0){
            	int temp = newX-1;
                if(grid[newY][temp] == 1 && !setVisited.contains(newY+","+temp)){
                    stack.push(newY+","+temp);
                    setVisited.add(newY+","+temp);
                }
            }
                              
            if(newY-1>=0){
            	int temp = newY-1;
                if(grid[temp][newX] == 1 && !setVisited.contains(temp+","+newX)){
                    stack.push(temp+","+newX);
                    setVisited.add(temp+","+newX);
                }
            }                  
            
        }
        if(areaSize < size){
            areaSize = size;
        }
    }

}
