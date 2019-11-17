package practice;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */
public class 青蛙跳台阶 {
    public int JumpFloor(int target) {
        int num1=1;
        int num2=2;
        if (target==0){
            return 0;
        }
        if (target==1){
            return 1;
        }
        if (target==2){
            return 2;
        }
        for(int i=3;i<target;i++){
            if(i%2!=0){
                num1=num1+num2;
            }
            else {
                num2=num1+num2;
            }
        }
        return num1+num2;
    }
}
