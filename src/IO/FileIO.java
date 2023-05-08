package IO;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileIO {
    public static void main(String[] args) throws IOException {
        /* 파일 쓰기 */
        // 1. FileOutputStream: 값을 쓸 때는 byte배열로 쓴다.
        FileOutputStream output = new FileOutputStream("c:/out.txt");

        String data1 = "첫 번 째 줄 입니다.\r\n"; // 윈도우즈의 경우 \r\n
        output.write(data1.getBytes()); // byte 배열로 변환

        String data2 = "두 번 째 줄 입니다.\r\n"; // 윈도우즈의 경우 \r\n
        output.write(data2.getBytes()); // byte 배열로 변환

        output.close();

        // 2. FileWriter: 문자열을 파일에 쓸 때(byte 변환 x)
        FileWriter fw = new FileWriter("output.txt");
        String data3 = "test data\r\n"; // 줄바꿈은 자동으로 되지 않는다.
        fw.write(data3);
        fw.close();

        // 3. PrintWriter: \r\n을 덧붙이는 대신 println이라는 메써드를 사용
        PrintWriter pw = new PrintWriter("output.txt");
        String data4 = "줄바꿈 없음~";
        pw.println(data4);
        pw.close();

        /* 파일에 내용 추가하기: 추가 모드 */
        // 1. FileWriter: 문자열을 파일에 쓸 때(byte 변환 x)
        FileWriter fw2 = new FileWriter("c:/out.txt", true); // 파일을 추가 모드로 연다.
        fw2.close();

        // 2. PrintWriter: \r\n을 덧붙이는 대신 println이라는 메써드를 사용
        PrintWriter pw2 = new PrintWriter(new FileWriter("c:/out.txt", true));
        pw2.close();

        /* 파일 읽기 */
        // 1. FileInputStream: byte 배열을 이용하여 파일을 읽음
        byte[] bylist = new byte[1024];
        FileInputStream fi = new FileInputStream("output.txt");
        fi.read(bylist);
        System.out.println(new String(bylist)); // byte를 string으로 변환
        fi.close();

        // 2. BufferedReader: 파일을 라인단위로 읽음
        BufferedReader br = new BufferedReader(new FileReader("output.txt"));
        String line = br.readLine();
        System.out.println(line);
        br.close();

    }
}
