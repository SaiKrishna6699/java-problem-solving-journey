package Ex3_TwoSums;

import java.util.HashMap;

public class TwoSums {
	public static int[] twoSums(int[] nums, int target) {
		HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
		
		for(int i=0; i<nums.length; i++) {
			int complementary = target - nums[i];
			
			if(hMap.containsKey(complementary)) {
				return new int[] {hMap.get(complementary), i};
			}
			hMap.put(nums[i], i);
		}
		
		throw new IllegalArgumentException("No two sum Solutions");
	}
	
	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
        int target =26;
        int[] result;
		try {
			result = twoSums(nums, target);
			System.out.println("Two numbers lies in "+result[0] + ", " + result[1]);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}

}
