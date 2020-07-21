package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder log = new StringBuilder();

        String dir = "D:\\Games";
        createDir(dir, log);

        String src = "D:\\Games\\src";
        createDir(src, log);

        String res = "D:\\Games\\res";
        createDir(res, log);

        String savegames = "D:\\Games\\savegames";
        createDir(savegames, log);

        String temp = "D:\\Games\\temp";
        createDir(temp, log);

        String tempTxt = "D:\\Games\\temp\\temp.txt";
        createFile(tempTxt, log);

        String main = "D:\\Games\\src\\main";
        createDir(main, log);

        String test = "D:\\Games\\src\\test";
        createDir(test, log);

        String mainFileFirst = "D:\\Games\\src\\main\\Main.java";
        createFile(mainFileFirst, log);

        String mainFileSecond = "D:\\Games\\src\\main\\Utils.java";
        createFile(mainFileSecond, log);

        String drawables = "D:\\Games\\res\\drawables";
        createDir(drawables, log);

        String vectors = "D:\\Games\\res\\vectors";
        createDir(vectors, log);

        String icons = "D:\\Games\\res\\icons";
        createDir(icons, log);

        FileWriter fw = new FileWriter("D:\\Games\\temp\\temp.txt", false);
        fw.write(log.toString());
        fw.flush();
    }

    private static void createFile(String path, StringBuilder log) {
        File file = new File(path);
        try {
            if (file.createNewFile())
                log.append("Файл Utils.java успешно создан.\n");
        } catch (IOException e) {
            log.append(Arrays.toString(e.getStackTrace()));
        }
    }

    private static void createDir(String path, StringBuilder log) {
        File dir = new File(path);
        if (dir.mkdir())
            log.append("Каталог ").append(path).append(" успешно создан.\n");
        else
            log.append("Ошибка создания каталога ").append(path).append(".\n");
    }
}
