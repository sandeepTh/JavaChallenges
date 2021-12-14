package codility;

public class StringFunctions {

    String a = "java main";
    String c = "java";
    String b = new String("java");

   public static void main(String[] args){

       StringFunctions str = new StringFunctions();
       System.out.println(str.reverseStringUtiliy(str.a));
       str.polindrome("masdm");

   }

    public String reverseStringUtiliy(String str) {

       char[] chars = str.toCharArray();
       StringBuilder stringBuilder = new StringBuilder();
       for(int i=chars.length-1;i>=0;i--){
           stringBuilder.append(chars[i]);
       }
      return stringBuilder.toString();
    }

    public void polindrome(String str){

       String revString = reverseStringUtiliy(str);
        if(revString.equals(str)){
            System.out.println("Its polindrome");
        }else {
            System.out.println("Not Polindrome");
        }

    }


}
