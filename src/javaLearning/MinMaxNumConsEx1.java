package javaLearning;

class MinMaxNum{

    MinMaxNum(int a[]){
        int min =a[0];
        int max =a[0];
        for(int i=0;i<a.length;i++)
        {
            if(min>a[i])
            {
                min=a[i];
            }
            if(max<a[i])
            {
                max=a[i];
            }
        }
        System.out.println("Minimum value of Array "+min);
        System.out.println("Maximum value of Array "+max);
        System.out.println();

    }



}

public class MinMaxNumConsEx1 {
    public static void main(String[] args) {
        MinMaxNum mm=new MinMaxNum(new int[] {10,50,55,25,100});
        MinMaxNum mm1=new MinMaxNum(new int[] {255,155,655,333,55,655,725,25,88});
        MinMaxNum mm2=new MinMaxNum(new int[] {100,1000});
    }

}
