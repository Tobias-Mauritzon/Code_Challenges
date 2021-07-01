import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

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
		
		int grid4[][] = {
				{0,0,1,0,0,0,0,1,0,0,0,0,0},
				{0,0,0,0,0,0,0,1,1,1,0,0,0},
				{0,1,1,0,1,0,0,0,0,0,0,0,0},
				{0,1,0,0,1,1,0,0,1,0,1,0,0},
				{0,1,0,0,1,1,0,0,1,1,1,0,0},
				{0,0,0,0,0,0,0,0,0,0,1,0,0},
				{0,0,0,0,0,0,0,1,1,1,0,0,0},
				{0,0,0,0,0,0,0,1,1,0,0,0,0}
		};
		
		maxAreaOfIsland(grid4);
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
                    	int size = 1;
                        Stack<String> stack = new Stack<String>();
                        
                        if(y+1 != grid.length) {
                        	stack = stackCheck(grid, stack, y+1,x);
                        }        
                        if(x+1 != grid[y].length) {
                        	stack = stackCheck(grid, stack, y,x+1);
                        }
                               
                        while(!stack.empty()){
                            size++;
                            String location = stack.pop();
                            String arr[] = location.split(",");
                            int newY = Integer.parseInt(arr[0]);
                            int newX = Integer.parseInt(arr[1]);
                            
                            if(newY+1 != grid.length) {   
                            	stack = stackCheck(grid, stack, newY+1,newX);
                            }           
                            if(newX+1 != grid[newY].length) {
                            	stack = stackCheck(grid, stack, newY,newX+1);
                            }                                     
                            if(newX-1>=0){

                                stack = stackCheck(grid, stack, newY,newX-1);
                            }                             
                            if(newY-1>=0){                
                                stack = stackCheck(grid, stack, newY-1,newX);
                            }                  
                        }
                        if(areaSize < size){
                            areaSize = size;
                        }
                    }
                }
            }
        }
        
        return areaSize;
    }
    
    public static Stack<String> stackCheck(int grid[][], Stack<String> stack, int y, int x) {
    	if(grid[y][x] == 1 && !setVisited.contains(y+","+x)){
            stack.push(y+","+x);
            setVisited.add(y+","+x);
        }
    	return stack;
    }

}
