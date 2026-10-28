package Arrays.Easy;

public class Geeks {

        public static boolean isPower(int x, int y) {
            // code here
            int max = Math.max(x, y);
            for (int i = 1; i < max; i++) {
                int m = (int) Math.pow(x, i);
                if (m == y) {
                    return true;
                }
            }
            return false;
        }

    public static void main(String[] args) {
        System.out.println(isPower(100,1));

    }
}
