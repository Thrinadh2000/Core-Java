public class ArrayMin {

    public static void main(String[] args) {


        int[] a = {45,76,23,98,34};
        int min = a[0];
        for(int i=0;i <a.length;i++)
        {
            if(a[i] < min)
                min = a[i];


        }

        System.out.println(min);
    }

}

