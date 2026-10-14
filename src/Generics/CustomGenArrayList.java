package Generics;

import java.util.Arrays;
import java.util.List;

public class CustomGenArrayList <T> {
//     T ref=T;
//     int s=10;
    private Object[] data;
    private static final int defaultSize=10;
    private int size=0;

    public CustomGenArrayList() {
        this.data=new Object[defaultSize];
    }
    public void add(T num)
    {
        if(isFull())
            resize();
        data[size++]=num;
    }

    public  void resize() {
        Object []temp=new Object[data.length*2];
        for(int i=0;i<data.length;i++)
        {
            temp[i]=data[i];
        }
        data=temp;
    }

    public boolean isFull() {
        return data.length==size;
    }

    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public T remove()
    {
        return (T)(data[--size]);
//        return removed;

    }
    public T get(int index)
    {
        return (T) (data[index]);
    }
    public void set(int index,T value)
    {
        data[index]=value;
    }
    public void getList(List<? extends Number> list)// Can pass number and  its sub class Integer Float etc

//    (List<Number> list)
    {
        //can pass only number
    }

    public static void main(String[] args) {
        CustomGenArrayList <String>obj=new CustomGenArrayList();
        obj.add("String");
        System.out.println(obj.get(0));
        obj.set(1,"ritesh");
        System.out.println(obj);
        CustomGenArrayList <Integer> objInt=new CustomGenArrayList<>();
        for(int i=0;i<20;i++)
        {
            objInt.add(i);
        }
        System.out.println(objInt);
        objInt.add(20);
        System.out.println(objInt);
//        obj.add(2);


    }
}
