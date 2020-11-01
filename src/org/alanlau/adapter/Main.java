package org.alanlau.adapter;

import java.io.*;

/**
 * @author alan
 * @version 1.0
 * @date 2020/11/1 21:05
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // FileInputStream 充当了 Adapter 的角色，因为 InputStreamReader 不能识别 String 类型的参数，所以 FileInputStream
        // 传入了 String 类型的参数，然后适配得到了 InputStreamReader 能接收的参数
        FileInputStream fis = new FileInputStream("c:/test.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);

        String line = br.readLine();
        while (null != line && !"".equals(line)) {
            System.out.println(line);
        }
        br.close();
    }
}
