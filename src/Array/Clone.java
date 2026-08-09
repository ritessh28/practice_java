package Array;

public class Clone {
        static void main(String[] args) {
            int []arr={10,20,30,40};
            int []arr2=arr.clone();
            arr[0]=20;
            System.out.println(" array 1 arr[0] "+arr[0]+" array 2 arr[0] "+arr2[0]);
            System.out.println(arr[0]==arr2[0]);
        }
    }


