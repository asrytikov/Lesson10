package p6;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        String text = "Hello all";
        byte[] buffer = text.getBytes();
        try{
            stream.write(buffer);
        }catch (Exception exception){
            exception.printStackTrace();
        }

        try(FileOutputStream fileOutputStream = new FileOutputStream("hello.txt")) {
            stream.writeTo(fileOutputStream);
        }catch (IOException exception){
            exception.printStackTrace();
        }


    }

}
