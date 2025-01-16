import java.util.HashMap;

public class Main {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            int value = nums[i];
            int diff = target - value;

            if(map.containsKey(diff)){
                return new int[] {map.get(diff),i};
            }
            map.put(value,i);
        }
        return null;
    }

    public static void main(String[] args){
        Main main = new Main();
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] result = main.twoSum(nums, target);
        if (result !=null){
            System.out.println("Indices:" + result[0] + ", " + result[1]);
        }
    }
}   