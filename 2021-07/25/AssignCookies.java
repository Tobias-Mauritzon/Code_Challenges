import java.util.Arrays;

/**
 * Assume you are an awesome parent and want to give your children some cookies. But, you should give each child at most one cookie.
 * Each child i has a greed factor g[i], which is the minimum size of a cookie that the child will be content with
 * and each cookie j has a size s[j]. If s[j] >= g[i], we can assign the cookie j to the child i, and the child i will be content. 
 * Your goal is to maximize the number of your content children and output the maximum number.
 */
public class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int counter = 0;
        for(int i = 0; counter<g.length && i<s.length; i++) {
            if(g[counter]<=s[i]) counter++;
        }
        return counter;
    }
}
