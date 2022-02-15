import java.util.Arrays;

import java.util.Arrays;

class A {
    int first, second;

    public A(int first, int second) {

        this.first = first;
        this.second = second;
    }

    public static void enqueue(A[] arrnew) {
        for(int i=0;i< arrnew.length;i++)
        {
            System.out.println(
                    arrnew[i].first + " " + arrnew[i].second);
        }


    }
}

public class Test {
    public static void main(String[] args) {
        int arr[]={5,3,7,2,8,1};
        Arrays.sort(arr);
        A[] arrnew=new A[2];
        arrnew[0]=new A(arr[0],arr[1]);
        arrnew[1]=new A(arr[arr.length-2],arr[arr.length-1]);
        A.enqueue(arrnew);
    }
}
