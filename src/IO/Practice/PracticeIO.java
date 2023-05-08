package IO.Practice;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PracticeIO {
    public static void main(String[] args) throws IOException {
        /* Q1 */
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();

        int res = first + second;
        System.out.println(res);

        /* Q2 */
        while (true) {
            String line = sc.nextLine();
            if ("END".equals(line))
                break;
            System.out.println(line.toUpperCase(););
        }

        /* Q3 */
        FileWriter fw = new FileWriter("sample.txt");
        fw.write("Write once, run anywhere");
        fw.close();

        BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        String line1 = br.readLine();
        System.out.println(line1); 
        br.close();

        /* Q4 */
        // 방법 1
        FileWriter fw1 = new FileWriter("sample.txt", true);
        String temp = sc.nextLine();
        fw1.write(String.format("%s\n", temp));
        fw1.close();
    
        // 방법 2
        PrintWriter pw = new PrintWriter(new FileWriter("sample.txt", true));
        temp = sc.nextLine();
        pw.println(temp);
        pw.close();

        /* Q5 */
        ArrayList<String> data = new ArrayList<>();
        BufferedReader br1 = new BufferedReader(new FileReader("sample.txt"));
        while(true){
            String tmp = br1.readLine();
            if (tmp==null) break;
            data.add(tmp);
        }
        br1.close();

        String txt = String.join("\n", data);
        txt.replaceAll("python","java");

        FileWriter fw2 = new FileWriter("sample.txt");
        fw2.write(txt);
        fw2.close();

    }
}
