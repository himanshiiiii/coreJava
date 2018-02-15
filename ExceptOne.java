import java.util.Scanner;
import java.util.*;

        public class ExceptOne {

            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int a=0,c=1;
                System.out.println("enter number of elements in array1");
                int n1 =sc.nextInt();
                int arr1[] = new int[n1];

                System.out.println("enter elements of array 1");

                for (int i = 0; i < n1; i++) {
                    arr1[i] = sc.nextInt();

                }

                for (int i = 0; i < n1; i++) {

                    Arrays.sort(arr1);

                }

                System.out.println("sorted array is ");

                for (int i = 0; i < n1; i++) {

                    System.out.println(arr1[i]);

                }

                for (int i = 0; i < n1; i++) {

                    c=1;

                    if (arr1[i] == arr1[i + 1]) {
                        c++;

                        System.out.println("value of c for " + arr1[i] + " is :" + c);
                    }
                    i = i + c-1;
                    if(c==1)
                    {
                        a=arr1[i];
                    }

                }

                System.out.println("the element exactly onces is :"+ a);


            }

        }
