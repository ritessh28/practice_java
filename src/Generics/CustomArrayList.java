package Generics;

import java.util.Arrays;

public class CustomArrayList {
    private int data[];
    private static int defaultSize=10;
    private int size=0;

    public CustomArrayList() {
        this.data=new int[defaultSize];
    }
    public void add(int num)
    {
        if(isFull())
            resize();
        data[size++]=num;
    }

   public  void resize() {
        int []temp=new int[data.length*2];
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
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }
    public int  remove()
    {
        return data[--size];
//        return removed;

    }
    public int get(int index)
    {
        return data[index];
    }
    public void set(int index,int value)
    {
        data[index]=value;
    }

    public static void main(String[] args) {
        CustomArrayList obj=new CustomArrayList();
        obj.add(1);
        obj.add(20);
        obj.add(30);
        System.out.println(obj.get(0));
        obj.set(0,300);
        System.out.println(obj);
        System.out.println(obj.remove());
        System.out.println(obj);
        System.out.println(obj.remove());
        System.out.println(obj);
        System.out.println(obj.get(0));

    }
}
