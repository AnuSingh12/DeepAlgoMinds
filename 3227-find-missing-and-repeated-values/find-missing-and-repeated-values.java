class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashSet<Integer>set = new HashSet<>();
        int ans[] = new int[2];
        int a=0;
        int b=0;
        int n = grid.length;
        int expectedSum =0;
        int actualSum =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                actualSum += grid[i][j];
                if(set.contains(grid[i][j])){
                    a = grid[i][j];
                    ans[0] = a;
                }
                set.add(grid[i][j]);
            }
        }
        expectedSum = (n*n)*((n*n)+1)/2;
        b = expectedSum + a - actualSum;
        ans[1] = b;
        return ans;
    }
}


