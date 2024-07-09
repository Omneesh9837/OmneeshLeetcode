class Solution {
    public double averageWaitingTime(int[][] customers) {
        double totwat=0;
        int curr=0;
        for(int []arr:customers){
           int arv= arr[0];
            int ctim=arr[1];
            if(curr<arv){
                curr=arv;
            }
            int t=curr+ctim-arv;
            totwat+=t;
            curr+=ctim;
        }
        return totwat/customers.length;
        
    }
}