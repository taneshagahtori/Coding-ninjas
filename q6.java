import java.util.*;

public class Solution {

    public static List< Integer > nextGreaterPermutation(List< Integer > A) {

        int indx=-1;

        for(int i=A.size()-2;i>=0;i--){

            if(A.get(i)<A.get(i+1)){

                 indx=i;

                break;

            }

        }

        if(indx==-1){

            Collections.reverse(A);

            return A;

        }

        for(int i=A.size()-1;i>=indx;i--){

            if(A.get(i)>A.get(indx)){

                Collections.swap(A, i, indx);

                break;

            }

        }

        reverse(A,indx+1,A.size()-1);

        return A;

    }

    public static   void reverse(List<Integer> A,int a,int b){

        while(a<b){

            Collections.swap(A, a, b);

            a++;

            b--;

        }

    }

}