public class CommonElements {
    //Find the value of a^b using recursion
    public int rec(int a, int b) {
        int n = 0;
        if(b==0) {
            return 1;
        }
        n = a * rec(a, b-1);
        int digit = 0, sum = 0;
            
            if(n<10) {  
                return n;
               }
               else {
                while(n > 0) {
                    digit = n % 10;
                    sum = sum + digit;
                    n = n / 10;
                 }
            }
      return sum;
    }
    public static void main(String[] args) {
        CommonElements c = new CommonElements();
        int res = 0;
        res = c.rec(7, 3);
        System.out.print(res);


 




       /* int n1 = 5, n2 = 4, n3 = 6,temp;
        int []A = {20,50,60,40,30};
        int []B = {15,14,50,20,70};
        int []C = {56,50,75,18,20};
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < B.length; j++) {
                for(int k = 0; k < C.length; k++){
                    if(C[k] == B[j]) {
                        if(C[k] == A[i]) {
                            temp = C[k];
                            System.out.println(temp);
                        }
                    }
                }
            }
        }*/
    }
}
