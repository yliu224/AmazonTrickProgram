/**
 * Created by dean on 1/20/17.
 */
public class RotateString {
    public boolean isRotated(String s, String t)
    {
        if(s == null && t == null) return true;
        else if(s == null || t == null) return false;
        return (s.length() == t.length()) && ((s + s).indexOf(t) != -1);

    }
}
