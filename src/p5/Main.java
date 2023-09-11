package p5;

import java.io.ByteArrayOutputStream;

public class Main {

    public static void main(String[] args) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        String text = "Hello all";
        byte[] buffer = text.getBytes();
        try {
            byteArrayOutputStream.write(buffer);
        }catch (Exception ex){
            ex.printStackTrace();
        }

        System.out.println(byteArrayOutputStream.toString());

        byte[] array = byteArrayOutputStream.toByteArray();
        for (byte b : array){
            System.out.print((char) b);
        }
        System.out.println();
    }

}
