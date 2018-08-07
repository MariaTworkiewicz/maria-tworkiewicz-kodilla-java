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
        System.out.println("Ania will post on " + aniaSocialMedium );
        String beataSocialMedium = beata.sharePost();
        System.out.println("Beata will post on " + beataSocialMedium );
        String matyldaSocialMedium = matylda.sharePost();
        System.out.println("Matylda will post on " + matyldaSocialMedium );

        //Then
        Assert.assertEquals("Facebook", aniaSocialMedium);
        Assert.assertEquals("Snapchat", beataSocialMedium);
        Assert.assertEquals("Twitter", matyldaSocialMedium);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User piotrusPan = new Millenials("Piotrus Pan");
        //When
        String piotrusSocialMedium = piotrusPan.sharePost();
        System.out.println("Piotrus Pan originally uses " + piotrusSocialMedium + " to share his posts");
        piotrusPan.setSharingStrategy(new TwitterPublisher());
        piotrusSocialMedium = piotrusPan.sharePost();
        System.out.println("Piotrus Pan just started with " +piotrusSocialMedium + " to share his thoughts");
        //Then
        Assert.assertEquals("Twitter", piotrusSocialMedium);

    }
}
