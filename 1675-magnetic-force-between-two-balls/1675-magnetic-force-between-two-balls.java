class Solution {
    public boolean helper(int [] position, int m, int x){
        int magnets = 1;
        int curr_magnet = position[0];
        for(int i = 1;i<position.length;i++) {
            if(position[i] - curr_magnet>=x) {
                curr_magnet = position[i];
                magnets++;
            }
        }
        return magnets>=m;
    }
    public int maxDistance(int[] position, int m) {
        int l = 1, n = position.length;
        Arrays.sort(position);
        int ans = 0;
        int r = position[n-1]-position[0];
        while(l<=r) {
            int mid = l+(r-l)/2;
            if (helper(position,m,mid)) {
                ans = mid;
                l = mid+1;
            }
            else r = mid - 1;
        }
        return ans;
    }
}