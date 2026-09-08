class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> hash1=new HashSet<>();

        for(int num:nums1) hash1.add(num);

        Set<Integer> hash2=new HashSet<>();

        for(int num:nums2){
            if(hash1.contains(num)) hash2.add(num);
        }
        int ans[]=new int[hash2.size()];

        int index = 0;
        for (int num : hash2) {
            ans[index] = num;
            index++;
        }

        return ans;
    }
}