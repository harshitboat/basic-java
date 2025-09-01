public class string {
    public static void main(String[] args) {
        String str1 = "string examples";
        int length = str1.length();
        char ch = str1.charAt(5);
        int indf = str1.indexOf("s");
        int indf1 = str1.lastIndexOf("s");
        String str2 = str1.toUpperCase();
        String str3 = str1.toLowerCase();
        String str4 = str1.replace("g","h");
        System.out.println(length);
        System.out.println(ch);
        System.out.println(indf);
        System.out.println(indf1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
