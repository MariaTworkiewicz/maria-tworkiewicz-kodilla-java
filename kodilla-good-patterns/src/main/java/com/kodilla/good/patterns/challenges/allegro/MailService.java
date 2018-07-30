package com.kodilla.good.patterns.challenges.allegro;

public class MailService implements InformationService {
    @Override
    public void inform(User user, Product product) {
        System.out.println("Thank you " + user + " for buying " + product);
    }

}
