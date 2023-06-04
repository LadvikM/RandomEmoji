package com.example.randomemoji;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


class RandomEmojiApplicationTests {


    @Test
    void networkErrorShouldPrintSadFace() {
        EmojiController emojiController = new EmojiController();
        String link = "https://stoplight.io/mocks/homeofficea/emoji/189317525%20/randomemoji";
        ArrayList<String> emojis = emojiController.getEmojis(link);
        for (String emoji : emojis) {
            assertEquals("☹", emoji);
        }

    }

    @Test
    void successFullResponseShouldPrintEmoji() {
        EmojiController emojiController = new EmojiController();
        String link = "https://stoplight.io/mocks/homeoffice1/successfulresponse/189319011%20/success";
        ArrayList<String> emojis = emojiController.getEmojis(link);
        String expectedEmoji = "😕";
        for (String emoji : emojis) {
            assertEquals(expectedEmoji, emoji);

        }


    }

}
