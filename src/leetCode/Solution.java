package leetCode;

public class Solution{

 /*
 Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

CASE 1
[2,7,11,15]
9
  */

    public int[] twoSum(int[] nums, int target) {
        int[] retorno = new int[2];
        for(int i = 0; i <= nums.length -1; i++){
            for(int iNside = i+1; iNside<= nums.length -1; iNside++){
                int soma = nums[i] + nums[iNside];
                System.out.println("Ponteiro interno: " +nums[iNside]);
                if( soma == target){
                    retorno[0] = i;
                    retorno[1] = iNside;
                    System.out.println("Soma correta: " +i +" + " +iNside);
                    return retorno;
                }
                soma = 0;
            }
        }
        System.out.println("Target não atingido com inputs passados");
        return null;

    }

    public Solution(){}


}