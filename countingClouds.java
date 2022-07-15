public class countingClouds{

    public static int countClouds(int grid[][]) {
        int count =0;
        if(grid.length==0)return count;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    DFS(grid,i,j);
                    count++;
                }
            }
        }
        return count;
    }
    static void DFS(int grid[][],int i, int j){
        if(i<0 || j<0 || i>grid.length-1 || j>grid[i].length-1|| grid[i][j]!=1) return;
        grid[i][j]=0;
        DFS(grid,i-1,j);
        DFS(grid,i,j-1);
        DFS(grid,i+1,j);
        DFS(grid,i,j+1);
    }
static void printArr(int sky[][]){
    System.out.print("\n");
    for(int i=0;i<sky.length;i++){
        for(int j=0;j<sky[0].length;j++){
            System.out.print(sky[i][j]+" ");
        }
        System.out.print("\n");
    }
}
    public static void main(String[] args) throws Exception {
        int sky[][] = {{1,1,1,1,0,1},
                       {1,1,1,0,0,1},
                       {0,0,0,0,0,0},
                       {0,1,0,0,0,1}};
        System.out.println(countClouds(sky)); //should be 4 clouds
       int sky2[][] = {{1,1,1,1,0,1},
                       {1,1,1,0,1,0},
                       {0,0,0,0,1,0},
                       {0,0,0,0,1,1}};
        System.out.println(countClouds(sky2)); //should be 3 clouds
        int sky3[][] ={{1,1,1,1,1,1},
                       {0,0,0,1,1,1},
                       {0,0,1,0,1,0},
                       {1,1,1,1,1,1}};
        System.out.println(countClouds(sky3)); //should be 1 cloud
        int sky4[][] = {{1,1,1},
                        {0,1,0},
                        {1,1,1}};
        System.out.println(countClouds(sky4)); //should be 1 cloud
        int sky5[][] ={{1,1,1,1,1,0,1,1,1,1},
                       {1,0,1,0,1,1,1,1,1,1},
                       {0,1,1,1,0,1,1,1,1,1},
                       {1,1,0,1,1,0,0,0,0,1},
                       {1,0,1,0,1,0,0,1,0,1},
                       {1,0,0,1,1,1,0,1,0,0},
                       {0,0,1,0,0,1,1,1,1,0},
                       {1,0,1,1,1,0,0,1,1,1},
                       {1,1,1,1,1,1,1,1,0,1},
                       {1,0,1,1,1,1,1,1,1,0}};
                       System.out.println(countClouds(sky5)); //should be 2 cloud                
    }
}