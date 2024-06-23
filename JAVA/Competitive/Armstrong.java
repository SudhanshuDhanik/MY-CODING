public class Armstrong {
    static boolean arm(int no) {
        int sum = 0;
        int temp = no;
        while (temp > 0) {
            int r = temp % 10;
            sum += r * r * r;
            temp = no / 10;
        }
        return no == sum;
    }

    public static void main(String[] args) {
        boolean res = arm(152);
        System.out.println(res);
    }
}
