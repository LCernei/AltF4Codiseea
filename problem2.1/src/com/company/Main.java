package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        URL url = Main.class.getResource("labirint.txt");
        File inFile = new File(url.getPath());

        String content = null;
        try {
            content = new String(Files.readAllBytes(Paths.get(inFile.getPath())));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(content);
        char[][] map = new char[1024][1025];

        for(int i=0;i<1024;i++){
            map[i] = scanner.nextLine().toCharArray();
        }

//        for(int i=0;i<1024;i++){
//            System.out.println(Arrays.toString(map[i]));
//        }

        System.out.println(Flag.runOnMap(map));

    }
}
