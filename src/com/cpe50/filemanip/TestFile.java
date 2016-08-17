package com.cpe50.filemanip;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by msalvio on 17/08/16.
 */
public class TestFile {
    public static void main(String[] args) {
        File file = new File("/Users/msalvio/Documents/testfile");

        try{

            PrintWriter output = new PrintWriter(new FileWriter(file,true),true);
            output.println();
            output.println("1,2016-05-06,08:00:00,12:23:23");

        } catch (Exception e){
            e.printStackTrace();
        }

//        if ( file.exists() ) {
//            readData(file);
//        }

    }
    public static void readData(File file){
        try {
            Scanner input = new Scanner(file);
            ArrayList<DTR> dtrs = new ArrayList<DTR>();

            while ( input.hasNextLine() ) {
                String line = input.next();
                String[] arr_line = line.split(",");

                DTR dtr = new DTR();
                dtr.setId(Integer.parseInt(arr_line[0]));
                dtr.setDate(arr_line[1]);
                dtr.setTimeIn(arr_line[2]);
                dtr.setTimeOut(arr_line[3]);

                System.out.println(dtr);
                System.out.println(dtr.computeHoursWorked());

                dtrs.add(dtr);

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
