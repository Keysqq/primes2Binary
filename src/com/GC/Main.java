package com.GC;
//Dev:Justin Fredericks
//Class: 171
//Date: 4/4/2022
//Script: read and write prime numbers with in a set range
import java.io.*;

public class Main {

    public static void main(String[] args)  throws IOException {
        int i =0;
        int num =0;


        try(
                DataOutputStream output =
                        new DataOutputStream(new FileOutputStream("Exercise22.8", true))
                ){
            for (i = 1; i <= 100; i++)
            {
                int counter=0;
                for(num =i; num>=1; num--)
                {
                    if(i%num==0)
                    {
                        counter = counter + 1;
                    }
                }
                if (counter ==2)
                {
                    //Appended the Prime number to the String
                    output.writeInt(i);
                }
            }//end of for
            int count =0;
            try(
                    DataInputStream dis =
                            new DataInputStream(new FileInputStream("Exercise22.8"));

                    ){
                int total = 0;
                while(dis.available()>0){
                    int temp = dis.readInt();
                    total += temp;
                    count++;
                    System.out.print(temp + " ");
                }
            }
        }//end of try

    }//main
}
