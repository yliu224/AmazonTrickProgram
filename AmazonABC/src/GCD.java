/**
 * Created by dean on 1/20/17.
 */
public class GCD {
    public int GCD(int[] input)
    {
        if(input.length == 1) return input[0];
        int res = input[0];
        for(int i = 1; i < input.length; i++)
        {
            res = helper(res, input[i]);
        }
        return res;
    }
    public int helper(int a, int b)
    {
        if(b == 0) return a;
        return helper(b, a%b);
    }
}
