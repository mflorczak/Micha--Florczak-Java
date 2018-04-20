package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.publisher.FacebookPublisher;
import com.kodilla.patterns.strategy.social.publisher.SnapchatPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User john = new Millenials("John");
        User tommy = new YGeneration("Tommy");
        User amanda = new ZGeneration("Amanda");
        //When
        String johnUse = john.sharePost();
        System.out.println("John use: " + johnUse);
        String tommyUse = tommy.sharePost();
        System.out.println("Tommy use: " + tommyUse);
        String amandaUse = amanda.sharePost();
        System.out.println("Amanda use: " + amandaUse);
        //Then
        Assert.assertEquals("Facebook to share", johnUse);
        Assert.assertEquals("Twitter to share", tommyUse);
        Assert.assertEquals("Snapchat to share", amandaUse);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User carl = new Millenials("Carl");
        //When
        String carlUse = carl.sharePost();
        System.out.println("Carl use: " + carlUse);
        carl.setSocialPublisher(new SnapchatPublisher());
        String carlUseNow = carl.sharePost();
        System.out.println("Carl after change use now: " + carlUseNow);
        //Then
        Assert.assertEquals("Snapchat to share", carlUseNow);
    }
}
