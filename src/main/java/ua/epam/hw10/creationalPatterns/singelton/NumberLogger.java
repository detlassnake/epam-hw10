package ua.epam.hw10.creationalPatterns.singelton;

public class NumberLogger {
    private static NumberLogger numberLogger = null;
    private static int logInt = 0;

    private NumberLogger() {}

    public static synchronized NumberLogger getNumberLogger() {
        if (numberLogger == null)
            numberLogger = new NumberLogger();
        return numberLogger;
    }

    public void addLogInfo(int logInfo) {
        logInt += logInfo;
    }

    public void showLog() {
        System.out.println(logInt);
    }
}
