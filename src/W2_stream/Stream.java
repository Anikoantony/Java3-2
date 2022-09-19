package W2_stream;

import java.io.*;


public class Stream {
    public static void readArr(byte[] arrr)
    {
        ByteArrayInputStream in = new ByteArrayInputStream(arrr);
        int x;
        while ((x=in.read())!=-1)
        {
            System.out.print(x + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        byte[] arr = {65,66,67};
        // Input - чтение из потока
       readArr(arr);
        // Output - запись в поток
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(10);
        out.write(11);
        byte[] arr2 = out.toByteArray();
        readArr(arr2);

        byte[] outData = new byte[1024*1024];
        for (int i=0; i<outData.length; i++)
        {
            outData[i]=65;
        }
        //readArr(outData);
        try {
            FileOutputStream out2 = new FileOutputStream("demo.txt");
            for (int i=0; i<outData.length; i++)
            {out2.write(outData[i]);}
        } catch (IOException e) {
            e.printStackTrace();
        }
byte[] buf=new byte[100];
        readArr(buf);
        try {
            FileInputStream fileinputStream = new FileInputStream("demo.txt");
            int count;
            while ((count=fileinputStream.read(buf))>0)
            {
                System.out.println("\nfileinputStream.read(buf) " + count);
                for (int i=0; i<count; i++)
            {
                System.out.print((char) buf[i]);
            }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
