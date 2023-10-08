package org.mirjalal.bot;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;

public class Bot extends TelegramLongPollingBot {
    public static String BOT_USERNAME = "BOT_USERNAME";
    public static String BOT_TOKEN = "BOT_TOKEN";

    @Override
    public String getBotUsername() {
        return System.getenv(BOT_USERNAME);
    }

    @Override
    public String getBotToken() {
        return System.getenv(BOT_TOKEN);
    }

    @Override
    public void onUpdateReceived(Update update) {
        System.out.println(update);
    }

}