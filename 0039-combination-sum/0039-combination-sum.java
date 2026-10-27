class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        combinations(0,candidates,target,new ArrayList<>(),ans);
        return ans;
    }
    public void combinations(int i,int[] candidates, int target, List<Integer> list, List<List<Integer>> ans){
        if(i==candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if(candidates[i]<=target){
            list.add(candidates[i]);
            combinations(i,candidates,target-candidates[i],list,ans);
            list.remove(list.size()-1);
        }
        combinations(i+1,candidates,target,list,ans);
    }
}