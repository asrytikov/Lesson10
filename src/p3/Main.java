package p3;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try{
            fileInputStream = new FileInputStream("string.txt");
            int i = -1;
            while ((i=fileInputStream.read())!=-1){
                System.out.print((char) i);
            }
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }finally {
            try{
                if (fileInputStream!=null){
                    fileInputStream.close();
                }
            }catch (IOException exception){
                System.out.println(exception.getMessage());
            }
        }

        try(FileInputStream fileInputStream1 = new FileInputStream("string.txt");
        FileInputStream fileInputStream2 = new FileInputStream("string.txt")){
            int i = -1;
            while ((i=fileInputStream.read())!=-1){
                System.out.print((char) i);
            }
        }catch (IOException exception){
        System.out.println(exception.getMessage());
    }

    }
}
