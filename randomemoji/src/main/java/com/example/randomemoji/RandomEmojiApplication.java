package com.example.randomemoji;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class RandomEmojiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RandomEmojiApplication.class, args);
        EmojiController emojiController = new EmojiController();
        String link = "https://emojihub.yurace.pro/api/random";
        ArrayList<String> emojis = emojiController.getEmojis(link);
        for (String emoji : emojis) {
            System.out.println(emoji);
        }
        System.exit(0);

    }

}


