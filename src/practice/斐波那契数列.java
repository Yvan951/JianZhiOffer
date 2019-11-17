package practice;

/**
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 */
public class 斐波那契数列 {
    public int Fibonacci(int n) {
        if (n==0||n>39){
            return 0;
        }
        int num0=0;
        int num1=0;
        for(int i=1;i<=n;i++){
            if(i==1){
                num0=1;
                continue;
            }
            if(i%2==0){
                num0=num0+num1;
            }else {
                num1=num0+num1;
            }
        }
        return num0+num1;
    }

    public static void main(String[] args) {
        斐波那契数列 test=new 斐波那契数列();
        System.out.println(test.Fibonacci(3));
    }
}
