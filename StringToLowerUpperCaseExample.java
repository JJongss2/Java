package study._11.String1;

public class StringToLowerUpperCaseExample {
    public static void main(String[] args){
        String str1 = "Java Programming";
        String str2 = "JAVA Programming";

        System.out.println(str1.equals(str2)); // false

        String lowerStr1 = str1.toLowerCase();
        String lowerStr2 = str2.toLowerCase();
        System.out.println(lowerStr1.equals(lowerStr2)); // true

        String str3 = new String("abc");
        String str4 = new String("abc");
        System.out.println(str3 == str4); // false
        System.out.println(lowerStr1 == lowerStr2); // false

        System.out.println(str1.equalsIgnoreCase(str2)); // 대소문자 구별 x



    }
}
