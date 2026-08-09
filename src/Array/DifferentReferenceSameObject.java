package Array;

public class DifferentReferenceSameObject {
    static void main(String[] args) {
        int []arr={10,20,30,40,50};
        int []arr1=arr;
        arr1[1]=100;
        System.out.println(" array 1 arr[1] "+arr[1]+" array 2 arr[1] "+arr1[1]);
    }
}
