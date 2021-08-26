package com.company;

public class Main {

    public static void main(String[] args) {
        String[] name = {"Руслан", "Рустам", "Адеми" ,"Куба"};

        for (int i = 0; i < name.length; i++) {
            switch (name[i]) {
                case "Руслан":
                    System.out.println("Доброе утро " + name[i]);
                    break;
                case "Рустам":
                    System.out.println("Добрый день " + name[i]);
                    break;
                case "Адеми":
                    System.out.println("Добрый вечер " + name[i]);
                    break;
                case "Куба":
                    System.out.println("Привет " + name[i]);
                    break;
            }
        }
    }
}
