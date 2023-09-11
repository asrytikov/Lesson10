package p2;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String text = "Hello all!";

        try(FileOutputStream fileOutputStream = new FileOutputStream("string.txt")){
            byte[] buffer = text.getBytes();
            fileOutputStream.write(buffer, 0, buffer.length);
            //fileOutputStream.write(buffer[0]);
            System.out.println("The file written");
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }

        try(FileInputStream fileInputStream = new FileInputStream("string.txt")){
            int i;
            while ((i=fileInputStream.read())!=-1){
                System.out.print((char) i);
            }
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }

        System.out.println();
        try(FileInputStream fileInputStream = new FileInputStream("string.txt")){
            byte[] buffer = new byte[256];
            System.out.println("File: ");
            int count;
            while((count=fileInputStream.read(buffer))!=-1){
                for (int i=0; i<count; i++){
                    System.out.print((char)buffer[i]);
                }
            }
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }

    }
}
