package leskionee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main44 {
    public static void main(String[] args) {
        try {
            FileInputStream in= new FileInputStream("fileone.txt");
            FileOutputStream out= new FileOutputStream("new-fileone.txt");
            int c;
            while ((c=in.read())!=-1){
                System.out.println((char) c);
                out.write(c);
                out.write((int)'F');
                System.out.println((char) c);
            }

        }catch (FileNotFoundException fnfe){
            System.out.println(fnfe.getLocalizedMessage())
            ;

        }catch(IOException e){
            throw new RuntimeException(e);
        }




    }
}
