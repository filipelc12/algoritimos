
public class Algoritimos {

    public static boolean hasDuplicate(int[] nums){
        for(int i = 0; i <= nums.length -1; i++ ){
            int ponteiro = nums[i];
            for(int iinside = i +1 ; iinside <= nums.length -1; iinside++){
                if(nums[iinside] == ponteiro){
                    return true;
                };
            }
        }

        return false;
    }

}
