
public class Programa {
    public static void main(String[] args) {

        String original = "abcde FGHIJ ABC abc DEFG   ";
        String s01 = original.toUpperCase();
        String s02 = original.toLowerCase();
        String s03 = original.trim();
        String s04 = original.substring(2,9);
        String s05 = original.replace('a', 'x');
        String s06 = original.replace("abc", "xy");

        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println("Original = -" + original + "-");
        System.out.println("Upper Case = -" +s01 + "-");
        System.out.println("Lower Case = -" + s02 + "-");
        System.out.println("Trim = -" + s03 + "-");
        System.out.println("Substring = -" + s04 + "-");
        System.out.println("Replace = -" + s05 + "-");
        System.out.println("Replace = -" + s06 + "-");
        System.out.println("IndexOf = " + i);
        System.out.println("lastIndexOf = " + j);


    }
}