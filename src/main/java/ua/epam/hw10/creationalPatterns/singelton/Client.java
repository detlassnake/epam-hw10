package ua.epam.hw10.creationalPatterns.singelton;

public class Client {
    public static void main(String[] args) {
        NumberLogger.getNumberLogger().addLogInfo(1);
        NumberLogger.getNumberLogger().addLogInfo(2);

        NumberLogger.getNumberLogger().showLog();
    }
}
