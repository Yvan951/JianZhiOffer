package practice;

/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class 二维数组中的查找 {
    public boolean Find(int target, int[][] array) {
        //方法一：暴力破解

        //方法二：右上角比较
        {
            int rows=array.length;
            int cols=0;
            if(rows!=0){
                cols=array[0].length;
            }
            if(cols==0||rows==0){
                return false;
            }
            int startRow=0;
            int startCol=cols-1;
            while (startRow<rows&&startCol>-1){
                int compare=array[startRow][startCol];
                if(compare==target){
                    return true;
                }else if (target>compare){
                    startRow++;
                }else {
                    startCol--;
                }
            }
            return false;
        }
    }
}
