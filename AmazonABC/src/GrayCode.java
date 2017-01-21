/**
 * Created by dean on 1/20/17.
 */
public class GrayCode {
    public boolean isConsecutive(byte a, byte b)
    {
        byte c = (byte)(a ^ b);
        int cnt = 0;
        for(int i=0;i<16;i++){
            if((c&1)==1) cnt++;
            c>>=1;
        }
        return cnt == 1;
    }
}
