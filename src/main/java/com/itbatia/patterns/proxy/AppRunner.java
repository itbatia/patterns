package main.java.com.itbatia.patterns.proxy;

public class AppRunner {
    public static void main(String[] args) {

        // 1) без прокси:

        // Загрузка приложения происходит в момент создания объекта:
        Application application = new SomeApplication("https://www.application.com/some/good/app");

        // Установка приложения начинается в момент запуска метода run:
        application.run();

        // 2) с прокси.

        // только создание объекта:
        Application application2 = new ProxyApplication("https://www.application.com/some/good/app");

        // Загрузка и установка:
        application2.run();
    }
}
