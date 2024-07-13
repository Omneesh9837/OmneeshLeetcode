class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] health, String directions) {
        int n=positions.length;
        List<Integer> ans=new ArrayList<>();
        Integer[]ind=new Integer[n];
        for(int i=0;i<n;i++){
            ind[i]=i;
        }
        Arrays.sort(ind,(i,j)->Integer.compare(positions[i],positions[j]));
        Stack<Integer> st=new Stack<>();
        for(int cr:ind){
            if(directions.charAt(cr)=='R'){
                st.push(cr);
            }else{
                while(!st.isEmpty()&& health[cr]>0){
                    int top=st.pop();
                    if(health[cr]>health[top]){
                        health[cr]-=1;
                        health[top]=0;
                        
                        
                    }else if(health[cr]<health[top]){
                        health[top]-=1;
                        health[cr]=0;
                        st.push(top);
                        
                    }else{
                        health[top]=0;
                        health[cr]=0;
                        
                        
                    }
                }
            }
        }
        for(int i=0;i<n;i++){
            if(health[i]>0)
            ans.add(health[i]);
        }
        return ans;
    }
}