
public class SumOfPrimeIndex {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,60,70,80,90,100 };
        int k=0;
        String s="";
        for(int i=2;i<a.length;i++)
        {
            int c=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                c++;
            }
            if(c==2)
            {
                s+=a[i];
                k+=a[i];
            }
        }
        System.out.println(s + " ");
        System.out.println(k);
    }
}
