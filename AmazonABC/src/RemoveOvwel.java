/**
 * Created by dean on 1/20/17.
 */
public class RemoveOvwel {
    public String removeVowel(String s)
    {
        String t = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray())
        {
            if(t.indexOf(c) >= 0) continue;
            sb.append(c);
        }
        return sb.toString();
    }
}
