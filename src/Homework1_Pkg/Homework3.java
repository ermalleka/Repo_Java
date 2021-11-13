package Homework1_Pkg;

public class Homework3 {
    public static void main(String[] args) {

        String tarkString = "Hello dear, how are you?";
        int result1 = 100;
        System.out.println("result1 =" + result1);

        String news = "Health was earlier said to be the ability of the body functioning Well";
        String newsReplace_a_Z = news.replace("a","Z");
        System.out.println("\nAfter replace ->" + newsReplace_a_Z);

        String newsString = "Health was earlier said to be the ability of the Body functioning Well";
        int taskStringLength = newsString.length();
        System.out.println("\nLength of '" + newsString + "Is: '" + taskStringLength);
        boolean isStartsWith_health = newsString.startsWith("health");
        System.out.println("\nis'" + newsString + "'starts with 'health? :" + isStartsWith_health);
        boolean isContains_Body = newsString.contains("Body");
        System.out.println("\nis'" + newsString+ "'contains 'Body'? :" + isContains_Body);
        int indexOf_Body = newsString.indexOf("body");
        System.out.println(" Index of 'Body' in " + newsString + "' is : " + indexOf_Body);


    }
}
