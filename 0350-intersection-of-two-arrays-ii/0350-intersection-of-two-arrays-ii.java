class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
       /* HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:nums1){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> list=new ArrayList<>();
        for(int num:nums2){
            if(map.getOrDefault(num,0)>0){
                list.add(num);
                map.put(num,map.get(num)-1);
            }
        }
        int[]ans=new int[list.size()];
        for(int i=0;i<list.size();i++){
            ans[i]=list.get(i);
        }
        return ans;*/
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list=new ArrayList<>();
        
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i]<nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        int[]ans=new int[list.size()];
        for(int k=0;k<list.size();k++){
            ans[k]=list.get(k);
        }
        return ans;
        
        
    }
}