package string_2;

/**
 * Created by Sergio on 2/21/19.
 */

/**
 * Look for patterns like "zip" and "zap" in the string --
 * length-3, starting with 'z' and ending with 'p'.
 * Return a string where for all such words,
 * the middle letter is gone, so "zipXzap" yields "zpXzp".


 zipZap("zipXzap") → "zpXzp"
 zipZap("zopzop") → "zpzp"
 zipZap("zzzopzop") → "zzzpzp"
 */
public class ZipZap {

    public String zipZap(String str) {
        return str.replaceAll("z.p", "zp");
    }

}
