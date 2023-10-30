package com.l;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class writeFile {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\dnu05\\OneDrive\\바탕 화면\\kwon\\a.txt"));
        while(true) {
            String line = br.readLine();
            if(line == null) break;

            System.out.println(line);
        }
        br.close();
    }
}
