import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, candidates, target, new ArrayList<>(), res);
        return res;
    }

    private void backtrack(int i, int[] candidates, int target, List<Integer> current, List<List<Integer>> res) {
        // Base Case: found a valid combination
        if (target == 0) {
            res.add(new ArrayList<>(current));
            return;
        }
        // Base Case: exceeded target or out of bounds
        if (target < 0 || i >= candidates.length) {
            return;
        }

        // Option 1: Include the current candidate (can reuse index i)
        current.add(candidates[i]);
        backtrack(i, candidates, target - candidates[i], current, res);
        
        // Backtrack: remove the last element before trying the next option
        current.remove(current.size() - 1);

        // Option 2: Skip the current candidate and move to the next index
        backtrack(i + 1, candidates, target, current, res);
    }
}
