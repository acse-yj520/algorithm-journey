import java.sql.SQLOutput;

public class Debugger {


    static int mod = 1000000007;

    public int f(String s, int n) {
        if (n <= 0) {
            return 0;
        }
        int res = 0;
        if (s.charAt(n) == '(') {
            return f(s, n - 1);
        } else {
            int p = n - f(s, n - 1) - 1;
            if (p >= 0 && s.charAt(p) == '(') {
                res = Math.max(res, 2 + f(s, n - 1) + f(s, p - 1));
            }else{
                res = Math.max(f(s,n-1),res);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Debugger debugger = new Debugger();
        System.out.println(debugger.f("(()))())(", 5));
    }
}
