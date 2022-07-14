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
## Approach 
For each cell of grid, check if cell == 1, if so then check if cell above and cell to the left both == 0, if so then increment count.

If row == 0 or column == 0, then automatically assume that the above or before cell equals zero since it doesn't exist.

The technique here is to only count the first 1 in a stream of possible consecutive 1s.
