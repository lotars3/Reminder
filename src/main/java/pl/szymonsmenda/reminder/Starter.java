package pl.szymonsmenda.reminder;

import pl.szymonsmenda.reminder.controllers.AuthController;

public class Starter {
    public static void main(String[] args) {
        new AuthController().start();
    }
}
