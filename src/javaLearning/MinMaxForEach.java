package javaLearning;

public class MinMaxForEach {
    public static void main(String[] args) {
        int a[]={10,40,20,30,50,100,200,0};
        int min=a[0];
        int max=a[0];
        for (int i:a)
        {
            if (i<min)
            {
                min=i;
            }
            if (i>max)
            {
                max=i;
            }
        }
        System.out.println("minimum "+min);
        System.out.println("maximum "+max);
    }
}
