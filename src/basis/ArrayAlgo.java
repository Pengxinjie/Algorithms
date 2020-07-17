package basis;

/**
 * @author Pengxinjie
 * @DATE 2020/7/17 - 15:29
 *
 * 典型的数组处理代码
 */
public class ArrayAlgo {
    //1.求数组中的最大值
    public static double max(double[] a){
        double max = a[0];
        int N = a.length;
        for (int i = 1; i < N; i++) {
            if (a[i]>max){
                max = a[i];
            }
        }
        return max;
    }

    //2.计算数组元素的平均值
    public static double aver(double[] a){
        double sum = 0;
        for (double v : a) {
            sum+=v;
        }
        return sum/a.length;
    }

    //3.颠倒数组元素的顺序
    public static void reverse(double[] a){
        int N = a.length;
        for (int i = 0; i < N/2; i++) {
            double temp = a[i];
            a[i] = a[N-i-1];
            a[N-i-1] = temp;
        }
    }

    //4.方阵相乘
    public static double[][] matrixTimes(double[][] a,double[][] b){
        int N = a.length;
        double[][] c = new double[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }

    public static void main(String[] args) {
        //方阵乘法测试
        double[][] a = new double[3][3];
        double[][] b = new double[3][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = i+j;
                b[i][j] = i*j+1;
            }
        }

        double[][] c = new double[3][3];
        c = matrixTimes(a,b);

        for (double[] doubles : c) {
            for (double aDouble : doubles) {
                System.out.print(aDouble+" ");
            }
            System.out.println();
        }
    }
}
