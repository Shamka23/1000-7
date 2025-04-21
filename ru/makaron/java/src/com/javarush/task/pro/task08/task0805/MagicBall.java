package com.javarush.task.pro.task08.task0805;

import java.util.Random;

public class MagicBall {
    private static final String CERTAIN = "Бесспорно";
    private static final String DEFINITELY = "Определённо да";
    private static final String MOST_LIKELY = "Вероятнее всего";
    private static final String OUTLOOK_GOOD = "Хорошие перспективы";
    private static final String ASK_AGAIN_LATER = "Спроси позже";
    private static final String TRY_AGAIN = "Попробуй снова";
    private static final String NO = "Мой ответ — нет";
    private static final String VERY_DOUBTFUL = "Весьма сомнительно";

    public static String getPrediction() {
        Random randomNumber = new Random();
        int MagicNumber = randomNumber.nextInt(8);
        if (MagicNumber == 0) {
            return CERTAIN;
        } else if (MagicNumber == 1) {
            return DEFINITELY;
        } else if (MagicNumber == 2) {
            return MOST_LIKELY;
        } else if (MagicNumber == 3) {
            return OUTLOOK_GOOD;
        } else if (MagicNumber == 4) {
            return ASK_AGAIN_LATER;
        } else if (MagicNumber == 5) {
            return TRY_AGAIN;
        } else if (MagicNumber == 6) {
            return NO;
        } else if (MagicNumber == 7) {
            return VERY_DOUBTFUL;
        } else return null;
    }
}
