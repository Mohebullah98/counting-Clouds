# Counting Clouds
 Given a 2 dimensional array of digits zero and one, Count how many clouds exist in the grid. Where a cloud is equal to a single 1 or multiple 1's connected together vertically or horizontally.
 ```
 Input: sky = [
  ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
]
Output: 1

Input: sky = [
  ["1","1","0","0","0"],
  ["1","1","0","0","0"],
  ["0","0","1","0","0"],
  ["0","0","0","1","1"]
]
Output: 3
```
```java
int sky3[][] ={{1,1,1,1,1,1},
               {0,0,0,1,1,1},
               {0,0,1,0,1,0},
               {1,1,1,1,1,1}};

System.out.println(countClouds(sky3)); //should be 1 cloud
```
## Approach 
Perform a depth first search on the grid everywhere where valu1 =1. 

The goal is to set all 1s that are connected horizontally and vertically equal to zero until we reach a zero or the end of the grid. This will help group connected ones together.