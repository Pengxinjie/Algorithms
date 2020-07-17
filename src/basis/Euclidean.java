package basis;

import java.util.Scanner;

/**
 * @author Pengxinjie
 * @DATE 2020/7/17 - 15:12
 *
 * 欧几里得算法(也称辗转相除法)计算两个非负整数p和q的最大公约数:
 *     若q是0，则最大公约数为p；否则，将篇p除以q得到余数r，p和q的最大公约数就是q和r的最大公约数
 */
public class Euclidean {
    public static int gcd(int p,int q){
        if (q==0) {
            return p;
        }
        return gcd(q,p%q);
    }

    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(gcd(a,b));

        sc.close();
    }
}
