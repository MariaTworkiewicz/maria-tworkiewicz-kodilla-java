package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User ania = new Millenials("Ania Mania");
        User beata = new YGeneration("Beata Rogata");
        User matylda = new ZGeneration("Matylda Krótka");

        //When
        String aniaSocialMedium = ania.sharePost();
        String beataSocialMedium = beata.sharePost();
        String matyldaSocialMedium = matylda.sharePost();

        //Then
        Assert.assertEquals("Fejsbuk", aniaSocialMedium);
        Assert.assertEquals("Snapchat", beataSocialMedium);
        Assert.assertEquals("Twitter", matyldaSocialMedium);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User piotrusPan = new Millenials("Piotrus Pan");
        //When
        String piotrusSocialMedium = piotrusPan.sharePost();
        piotrusPan.setSharingStrategy(new TwitterPublisher());
        piotrusSocialMedium = piotrusPan.sharePost();
        //Then
        Assert.assertEquals("Twitter", piotrusSocialMedium);

    }
}
