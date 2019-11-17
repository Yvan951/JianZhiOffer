package practice;

public class 旋转数组的最小数字 {

    public int minNumberInRotateArray(int[] array) {
        /**
         * 方法一：遍历，时间复杂度O(n)
         */
        /*{
            for(int i=0;i<array.length-1;i++){
                if(array[i]>array[i+1]){
                    return array[i+1];
                }
            }
            return -1;
        }*/
        /**
         * 方法二：类似二分查找法，时间复杂度O(logn)
         */
        {
            int head = 0;
            int tail = array.length - 1;
            int mid = (head + tail) / 2;
            if(array[head]<array[tail]){
                return array[head];
            }
            while (head + 1 != tail) {
                if (array[head] > array[mid]) {
                    tail = mid;
                    mid = (head + tail) / 2;
                } else if (array[head] < array[mid]){
                    head = mid;
                    mid = (head + tail) / 2;
                }else{
                    for(int i=head;i<tail;i++){
                        if(array[i]>array[i+1]){
                            return array[i+1];
                        }
                    }
                }
            }
            return array[tail];
        }
    }
}
