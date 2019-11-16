package practice;

import java.util.HashSet;
import java.util.Set;

/**
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。
 * 请找出数组中任意一个重复的数字。
 * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
 */
public class 数组中重复的数字 {
    /**
     * @param numbers     an array of integers
     * @param length      the length of array numbers
     * @param duplication (Output) the duplicated number in the array number,length of duplication array is 1
     * @return true if the input is valid, and there are some duplications in the array number
     * otherwise false
     */
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        if (numbers == null || numbers.length == 0) {
            return false;
        }
        for (int i : numbers) {
            if (i < 0 || i > length - 1) {
                return false;
            }
        }
        //方法一：HashSet,时间复杂度O(n),空间复杂度O(n)
        /**
         {
         Set<Integer> nums=new HashSet<>();
         for(int i:numbers){
         if (nums.contains(i)){
         duplication[0]=i;
         return true;
         }else {
         nums.add(i);
         }
         }
         return false;
         }
         */

        //方法二：交换重排数组，时间复杂度O(n),空间复杂度O(1)
        {
            for (int i = 0; i < length; i++) {
                while (numbers[i] != i) {
                    int index = numbers[i];
                    if (numbers[index] == index) {
                        duplication[0] = index;
                        return true;
                    } else {
                        numbers[i] = numbers[index];
                        numbers[index] = index;
                    }
                }
            }
            return false;
        }
    }
}
