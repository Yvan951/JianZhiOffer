package practice;

/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class 替换空格 {
    public String replaceSpace(StringBuffer str) {
        //方法一：直接使用String内置的replaceAll方法
        /**
         {
         String temp = str.toString();
         temp = temp.replaceAll(" ", "%20");
         return temp;
         }
         */
        //方法二：使用StringBuffer(修改原字符串)
        /**
         {
         for (int i = 0; i < str.length(); i++) {
         if (str.charAt(i) == ' ') {
         str.replace(i, i + 1, "%20");
         i=i+2;
         }
         }
         return str.toString();
         }
         */
        //方法三：使用StringBuffer(不修改原字符串，创建新字符串)
        {
            StringBuffer newStr=new StringBuffer();
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)==' '){
                    newStr.append("%20");
                }else {
                    newStr.append(str.charAt(i));
                }
            }
            return newStr.toString();
        }
    }
}
