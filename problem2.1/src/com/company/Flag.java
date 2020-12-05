package com.company;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Flag {
    static Stack<Character> stack = new Stack<>();
    static LinkedList<Character> flag = new LinkedList<>();

    static private int[] findStart(char[][] map){
        for(int i=0;i<1024;i++) {
            for (int j = 0; j < 1025; j++) {
                if(map[i][j]=='$'){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }

    static public List<Character> runOnMap(char[][] map){
        System.out.println(map.length);
        int[] startPoints = findStart(map);



        for(int i=startPoints[0];i<1024;i++){
            for (int j=startPoints[1];j<1025;j++){
                switch (map[i][j]){
                    case '$' : {
                        i++;
                    }
                    case '@' : {
                        return flag;
                    }
                    case '(' : {
                        if (!stack.isEmpty()){
                            flag.addFirst(stack.pop());
                        }
                        int nr = map[i][j+1];
                        j=-nr;
                    }
                    case ')' : {
                        if (!stack.isEmpty()){
                            flag.addLast(stack.pop());
                        }
                        int nr = map[i][j-1];
                        j=-+nr;
                    }
                    case '-' : {
                        if (!stack.isEmpty()){
                            flag.removeFirst();
                        }
                        int nr = map[i+1][j];
                        i-=nr;
                    }
                    case '+' : {
                        if (!stack.isEmpty()){
                            flag.removeLast();
                        }
                        int nr = map[i-1][j];
                        i+=nr;
                    }
                    case '%' : {
                        Collections.reverse(flag);
                        i++;
                    }
                    case '[' : {
                        char ch = map[i][j+1];
                        stack.push(ch);
                        j=+2;
                    }
                    case ']' : {
                        char ch = map[i][j-1];
                        stack.push(ch);
                        j=-2;
                    }
                    case '*' : {
                        char ch = map[i-1][j];
                        stack.push(ch);
                        i-=2;
                    }
                    case '.' : {
                        char ch = map[i+1][j];
                        stack.push(ch);
                        i+=2;
                    }
                    case '<' : {
                        int nr;
                        if(Character.isDigit(map[i][j+2])){
                            nr = Integer.parseInt(""+map[i][j+1]+map[i][j+2]);
                        }else{
                            nr = map[i][j+1];
                        }
                        j-=nr;
                    }
                    case '>' : {
                        int nr;
                        if(Character.isDigit(map[i][j-2])){
                            nr = Integer.parseInt(""+map[i][j-1]+map[i][j-2]);
                        }else{
                            nr = map[i][j-1];
                        }
                        j+=nr;
                    }
                    case '^' : {
                        int nr;
                        if(Character.isDigit(map[i+2][j])){
                            nr = Integer.parseInt(""+map[i+1][j]+map[i+2][j]);
                        }else{
                            nr = map[i+1][j];
                        }
                        i-=nr;
                    }
                    case 'v' : {
                        int nr;
                        if(Character.isDigit(map[i-2][j])){
                            nr = Integer.parseInt(""+map[i-1][j]+map[i-2][j]);
                        }else{
                            nr = map[i-1][j];
                        }
                        i+=nr;
                    }
                }
            }
        }
        return null;
    }

}
