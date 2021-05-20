package javaprogram;
import java.util.Scanner;
public class sortedstrings
{
    public static void main(String[] args) 
    {
        int count;
        String temp;
        Scanner scan = new Scanner(System.in); 
        //User will be asked to enter the count of strings 
        System.out.print("Enter number of strings you would like to enter:");
        count = scan.nextInt();
        String str[] = new String[count];
        Scanner scan2 = new Scanner(System.in);
        //User is entering the strings and they are stored in an array
        System.out.println("Enter the Strings one by one:");
        for(int i = 0; i < count; i++)
        {
            str[i] = scan2.nextLine();
        }

        brandsort(str);
    }
    
 public static void brandsort(String k[])
 {
	 for (int i = 0; i < k.length; i++) 
     {
         for (int j = i+1; j < k.length; j++) { 
             if (k[i].compareTo(k[j])>0) 
             {
                 String temp = k[i];
                 k[i] = k[j];
                 k[j] = temp;
             }
         }
     }
     
     //Displaying the strings after sorting them based on alphabetical order
     System.out.print("Strings in Sorted Order:");
     for (int i =k.length-1; i >=0; i--) 
     {
         System.out.print(k[i] + ", ");
     }
 }
}
        