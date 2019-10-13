public class Part1 {

    public static void main(String[] args) {
        String str = "FourscoreandsevenyearsagoourfaathersbroughtforthonthiscontainentanewnationconceivedinzLibertyanddedicatedtothepropositionthatallmenarecreatedequalNowweareengagedinagreahtcivilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";

        String maxPalindrome = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            String p1 = findPalindrome(str, i, i);
            if (p1.length() > maxPalindrome.length()) {
                maxPalindrome = p1;
            }

            String p2 = findPalindrome(str, i, i + 1);
            if (p2.length() > maxPalindrome.length()) {
                maxPalindrome = p2;
            }
        }

        System.out.println(maxPalindrome);
    }

    private static String findPalindrome(String str, int backFrom, int fwdFrom) {
        int maxlen = Math.min(str.length() - fwdFrom, backFrom);

        int pos = 0;
        while (pos < maxlen && str.charAt(backFrom - pos) == str.charAt(fwdFrom + pos)) {
            pos++;
        }

        return str.substring(backFrom - Math.max(0, pos - 1), fwdFrom + pos);
    }
}
