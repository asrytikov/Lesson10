package p4;

import java.io.ByteArrayInputStream;

public class Main {

    public static void main(String[] args) {
        byte[] array1 = new byte[]{1,3,4,5};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(array1);
        int b;
        while ((b=byteArrayInputStream.read())!=-1){
            System.out.print(b);
        }
        System.out.println();
        String text = "Hello all";
        byte[] array2 = text.getBytes();
        ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(array2, 0, 5);
        int c;
        while ((c=byteArrayInputStream1.read())!=-1){
            System.out.print((char) c);
        }
    }

}
