package string_2;

/**
 * Created by Sergio on 2/21/19.
 */

/**
 * A sandwich is two pieces of bread with something in between.
 * Return the string that is between the first and last appearance of "bread"
 * in the given string, or return the empty string ""
 * if there are not two pieces of bread.

 getSandwich("breadjambread") → "jam"
 getSandwich("xxbreadjambreadyy") → "jam"
 getSandwich("xxbreadyy") → ""
 */
public class GetSandwich {

    public String getSandwich(String str) {
        int k = 0;
        if (str.length() >= 10) {
            for (int i = 0; i < str.length() - 4; i++) {

                if (str.substring(i, i + 5).equals("bread")) {

                    k = i;

                }

            }

            String text = str.substring(5 + str.indexOf("bread"), k);


            return text;
        }
        return "";
    }

}
