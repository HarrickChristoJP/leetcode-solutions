class Solution {
    int[] b;

    public int[] sortArray(int[] nums) {
        int n = nums.length;

        if (b == null)
            b = new int[n];

        mergesort(nums, 0, n - 1);

        return nums;
    }

    public void mergesort(int[] nums, int low, int high) {

        if (low < high) {

            int mid = low + (high - low) / 2;

            mergesort(nums, low, mid);
            mergesort(nums, mid + 1, high);

            merge(nums, low, mid, high);
        }
    }

    public void merge(int[] nums, int low, int mid, int high) {

        int i = low;
        int j = mid + 1;
        int k = low;

        while (i <= mid && j <= high) {

            if (nums[i] <= nums[j])
                b[k++] = nums[i++];
            else
                b[k++] = nums[j++];
        }

        while (i <= mid)
            b[k++] = nums[i++];

        while (j <= high)
            b[k++] = nums[j++];

        for (int x = low; x <= high; x++)
            nums[x] = b[x];
    }
}