package com.company;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        StringBuilder log = new StringBuilder();

        File dir = new File("D:\\Games");
        if (dir.mkdir())
            log.append("Каталог Games успешно создан.\n");
        else
            log.append("Ошибка создания каталога Games\n");

        File src = new File("D:\\Games\\src");
        if (src.mkdir())
            log.append("Каталог src успешно создан.\n");
        else
            log.append("Ошибка создания каталога src\n");

        File res = new File("D:\\Games\\res");
        if (res.mkdir())
            log.append("Каталог res успешно создан.\n");
        else
            log.append("Ошибка создания каталога res\n");

        File savegames = new File("D:\\Games\\savegames");
        if (savegames.mkdir())
            log.append("Каталог savegames успешно создан.\n");
        else
            log.append("Ошибка создания каталога savegames\n");

        File temp = new File("D:\\Games\\temp");
        if (temp.mkdir())
            log.append("Каталог temp успешно создан.\n");
        else
            log.append("Ошибка создания каталога temp\n");

        File tempTxt = new File("D:\\Games\\temp\\temp.txt");
        try {
            if (tempTxt.createNewFile())
                log.append("Файл temp.txt успешно создан.\n");
        } catch (IOException e) {
            log.append(Arrays.toString(e.getStackTrace()));
        }

        File main = new File("D:\\Games\\src\\main");
        if (main.mkdir())
            log.append("Каталог main успешно создан.\n");
        else
            log.append("Ошибка создания каталога main\n");

        File test = new File("D:\\Games\\src\\test");
        if (test.mkdir())
            log.append("Каталог test успешно создан.\n");
        else
            log.append("Ошибка создания каталога test\n");

        File mainFileFirst = new File("D:\\Games\\src\\main\\Main.java");
        try {
            if (mainFileFirst.createNewFile())
                log.append("Файл Main.java успешно создан.\n");
        } catch (IOException e) {
            log.append(Arrays.toString(e.getStackTrace()));
        }

        File mainFileSecond = new File("D:\\Games\\src\\main\\Utils.java");
        try {
            if (mainFileSecond.createNewFile())
                log.append("Файл Utils.java успешно создан.\n");
        } catch (IOException e) {
            log.append(Arrays.toString(e.getStackTrace()));
        }

        File drawables = new File("D:\\Games\\res\\drawables");
        if (drawables.mkdir())
            log.append("Каталог vectors успешно создан.\n");
        else
            log.append("Ошибка создания каталога drawables.\n");

        File vectors = new File("D:\\Games\\res\\vectors");
        if (vectors.mkdir())
            log.append("Каталог vectors успешно создан.\n");

        else
            log.append("Ошибка создания каталога vectors\n");

        File icons = new File("D:\\Games\\res\\icons");
        if (icons.mkdir())
            log.append("Каталог icons успешно создан.\n");
        else
            log.append("Ошибка создания каталога icons.\n");

        FileWriter fw = new FileWriter("D:\\Games\\temp\\temp.txt", false);
        fw.write(log.toString());
        fw.flush();
    }
}
