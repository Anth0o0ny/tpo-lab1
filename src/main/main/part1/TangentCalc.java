package part1;

public class TangentCalc {
    public double calculateBernoulli(int n) {
        switch (n) {
            case 0:
                return 1;
            case 1:
                return -0.5;
            case 2:
                return 1.0 / 6;
            case 4:
                return -1.0 / 30;
            case 6:
                return 1.0 / 42;
            case 8:
                return -1.0 / 30;
            case 10:
                return 5.0 / 66;
            case 12:
                return -691.0 / 2730;
            case 14:
                return 7.0 / 6;
            case 16:
                return -3617.0 / 510;
            case 18:
                return 43867.0 / 798;
            case 20:
                return -174611.0 / 330;
            default:
                return 0;
        }
    }

    public int getFactorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    public double getTgSeries(double value, int n){
        double result = 0;
        for (int i = 1; i <= n; i++){
            double temp = Math.pow(-1, i + 1) * Math.pow(2, 2 * i) * (Math.pow(2, 2 * i) - 1) * Math.pow(value, 2 * i - 1) * calculateBernoulli(2 * i) / getFactorial(2 * i);
            result += temp;
        }
        return result;
    }
}
