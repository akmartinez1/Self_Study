/**
 * Created by alanmartinez on 3/2/16.
 */
public class fibonacci {

    public static void main(String[] args){

        double fn=0;
        double fn1=0;
        double fn2=1;
        double fn3;

        /*

        do {

            System.out.print(fn1 + " " + fn2 + " ");

            fn3=fn1+fn2;
            fn1=fn2;
            fn2=fn3;

        }while (fn1!=-1);

        */

        System.out.println(fn1);
        System.out.println(fn2);


        for(int loop=0;loop<200;loop++){

            fn3=fn1+fn2;

            System.out.println(fn3);

            fn1=fn2;
            fn2=fn3;

        }


    }

}
