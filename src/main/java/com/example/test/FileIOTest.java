package com.example.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIOTest {
    public static void main(String[] args) throws FileNotFoundException {
        FileIOTest t1 = new FileIOTest();
        t1.input();
        t1.output();

    }

    public void input() throws FileNotFoundException{
        File file = new File("F:\\a.txt");

        try(PrintWriter output = new PrintWriter(file))
        {
            output.println("join");
            output.println("xiaomi");
            output.println("reshuiqi");
            output.println(21);
        }

    }

    public  void output() throws FileNotFoundException {
        File file = new File("F:\\a.txt");
        Scanner input = new Scanner(file);
        while (input.hasNext())
        {
            String firstName = input.next();
            String mi = input.next();
            String lastName = input.next();
            int score = input.nextInt();
            System.out.println(firstName + " " + mi + " " + lastName + " " + score);
        }
        //关闭文件，释放资源
        input.close();
    }


}
