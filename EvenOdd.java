public class EvenOdd {
    public static void main(String[] args) {
        int a = 20;
        /*if (a % 2 == 0) {
            System.out.println(a + "   EVEN");
        }*/
       if ((a & 1) == 0) {
            System.out.println(a + "   EVEN");
        }
        else {
            System.out.println(a + "   Odd");
        }
    }
}
