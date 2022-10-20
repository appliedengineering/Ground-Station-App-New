package main;

public class AppLauncher {

    private static AppManager appManager;

    public static void main(String[] args) {
        appManager = new AppManager();
        appManager.run();
    }

}
