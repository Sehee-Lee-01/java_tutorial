package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleIO {
    public static void main(String[] args) throws IOException {
        // 콘솔 입력
        /* 1. Inputstream: 1byte ASCII code */
        // byte
        InputStream in = System.in;
        System.out.println("1byte input");
        int a = in.read(); // read 1byte
        System.out.println(a); // ASCII code

        // more 1byte
        InputStream in2 = System.in;
        byte b[] = new byte[3];
        System.out.println("3byte input");
        in2.read(b);
        System.out.println(b[0]); // ASCII code Array

        /* 2. InputStreamReader: 입력한 문자값을 그대로 출력, 고정 길이 */
        // character
        InputStream in3 = System.in;
        InputStreamReader reader = new InputStreamReader(in3);
        char[] c = new char[3]; // byte 대신 char 배열을 사용
        System.out.println("3 char input");
        reader.read(c);
        System.out.println(c[0]);

        /* 3. BufferedReader:엔터키를 입력할 때까지 사용자의 입력을 전부 받기 */
        // String
        InputStream in4 = System.in;
        InputStreamReader reader2 = new InputStreamReader(in4);
        BufferedReader br = new BufferedReader(reader2);
        System.out.println("String input");
        String str = br.readLine(); // read 1 line form console
        System.out.println(str);

        // /* 4. Scanner:콘솔입력을 보다 쉽게 처리 */
        Scanner sc = new Scanner(System.in);
        System.out.println("word input");

        String word = sc.next(); // 단어
        System.out.println("line input");
        String line = sc.nextLine(); // 라인

        System.out.println("integer input");
        int integer = sc.nextInt(); // 정수

        System.out.println(String.format("%s is word, %s is line, %d is int", word,
                line, integer));
        sc.close();

        // 콘솔 출력
        System.out.println("줄바꿈 하고 출력");
        System.out.print("줄바꿈 안하고 출력");
        System.err.println("에러 출력");

        /* 에러출력과 일반출력 구분 */
        // java Sample > out.txt 2> error.txt
    }
}
