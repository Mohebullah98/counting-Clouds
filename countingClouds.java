package java;
public class countingClouds{

    static int count(int sky[][]){
        int count =0;
        if(sky[0][0]==1 ) count++;
        for(int i=0;i<sky.length;i++){
            for(int j=0;j<sky[i].length;j++){
                if(j==0&&i==0)continue;
                if(sky[i][j]==1){
                    int above=0;
                    int left = 0;
                    if(i>0)above = sky[i-1][j];
                    if(j>0)left = sky[i][j-1];
                    if(above==0 && left==0) count++;
                }
            }
    }
    return count;
}
    public static void main(String[] args) throws Exception {
        int sky[][] = {{1,1,1,1,0,1},
                       {1,1,1,0,0,1},
                       {0,0,0,0,0,0},
                       {0,1,0,0,0,1}};
        System.out.println(count(sky)); //should be 4 clouds
       int sky2[][] = {{1,1,1,1,0,1},
                       {1,1,1,0,1,0},
                       {0,0,0,0,1,0},
                       {0,0,0,0,1,1}};
        System.out.println(count(sky2)); //should be 3 clouds
    }
}