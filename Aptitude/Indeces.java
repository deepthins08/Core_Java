class Indeces{
	
	public static int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indices[0] = i;
                    indices[1] = j;
                    return indices;
                }
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {2, 7, 11, 15};
        int target = 9;

        int[] indices = twoSum(nums, target);
        System.out.println("The indices of the two numbers that add up to " + target + " are " + indices[0] + " and " + indices[1]);
    }
}	
	
