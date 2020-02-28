package app;

import constants.CARD_SUITS;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {

    public static void main(String[] args) {
        int player = 1;
        JOptionPane.showMessageDialog(null, "Kılıç Oyununa Hoşgeldiniz!", "KILIÇ OYUNU BY YGTESN", JOptionPane.WARNING_MESSAGE);
        String choosedCard = JOptionPane.showInputDialog(null, "Desteden 1 kart seçiniz!", "KILIÇ OYUNU BY YGTESN", JOptionPane.WARNING_MESSAGE);
        List<String> pickedCards = new ArrayList<>();
        while (true) {
            String pickedCard = pickCard(pickedCards);
            if (pickedCard.equalsIgnoreCase(choosedCard)) {
                JOptionPane.showMessageDialog(null, ((player % 2) + 1) + "'inci Oyuncu " + choosedCard + " çekti ve KAZANDI!", "Winner Winner Chicken Dinner", JOptionPane.INFORMATION_MESSAGE);
                break;
            } else {
                JOptionPane.showMessageDialog(null, ((player % 2) + 1) + "'inci oyuncu " + pickedCard + " çekti!", "Heyecan Devam ediyor!", JOptionPane.INFORMATION_MESSAGE);
                player++;
            }
        }
    }

    private static String pickCard(List<String> pickedCards) {
        String card = chooseRandomSuit() + " " + chooseRandomNumber();
        if (pickedCards.contains(card)) {
            pickCard(pickedCards);
        }
        pickedCards.add(card);
        return card;
    }

    private static String chooseRandomSuit() {
        return CARD_SUITS.getSuitList().get(new Random().nextInt(CARD_SUITS.getSuitList().size())).getSuitName();
    }

    private static String chooseRandomNumber() {
        int randomNumber = new Random().nextInt(12);
        switch (randomNumber) {
            case 0:
                return "As";
            case 1:
                return "İki";
            case 2:
                return "Üç";
            case 3:
                return "Dört";
            case 4:
                return "Beş";
            case 5:
                return "Altı";
            case 6:
                return "Yedi";
            case 7:
                return "Sekiz";
            case 8:
                return "Dokuz";
            case 9:
                return "On";
            case 10:
                return "Vale";
            case 11:
                return "Kız";
            case 12:
                return "Papaz";
            default:
                return "";
        }

    }
}
