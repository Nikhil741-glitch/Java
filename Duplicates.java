import java.util.ArrayList;
import java.util.Collections;

public class Duplicates {
    public static void main(String[] args) {
        int i,j;
        int count =0;
        int a[] = {13,9, 25, 1, 1, 0, 22, 13, 22, 20, 3, 8, 11, 25, 10, 3, 15, 11, 19, 20, 2, 4, 25, 14, 23, 14};
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(i = 0; i < a.length; i++) {
            if(al.contains(a[i])) {
                continue;
            }
            else {
                for(j = i+1; j < a.length; j++) {
                    if(a[i] == a[j]) {
                        count++;
                    }
                }
            }
            if(count != 0) {
                al.add(a[i]);
            }
            count = 0;
        }
        if(al.isEmpty() == true){
            al.add(-1);
        }
        else {
            Collections.sort(al);
        }
        System.out.println(al);
    }
}
/*
 * Optimised Way :
 * 
 * class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
          //List<Integer> list = IntStream.of(arr).boxed().collect(Collectors.toList());
       Set<Integer> set =new HashSet<>();
       ArrayList<Integer> response = new ArrayList<>();
       for(int i=0;i<n;i++){
           if(set.contains(arr[i])){
               response.add(arr[i]);
           }else{
               set.add(arr[i]);
           }
       }
       if(response.size()==0)
           response.add(-1);
       TreeSet<Integer> sorted = new TreeSet<Integer>(response);
       ArrayList<Integer> list=new ArrayList<Integer>(sorted);
       //Collections.sort(response);
       return list;
    }
}

 */
