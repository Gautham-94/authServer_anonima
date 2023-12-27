package com.anonima.authServer.utils;

import com.github.javafaker.Faker;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Locale;
import java.util.Random;
import java.util.Set;

@Service
public class RandomUserGeneratorServiceImpl implements RandomUserGeneratorService{
//    private static final String[] ADJECTIVES = {"happy", "brave", "sunny", "clever", "gentle", "swift", "dazzling"};
//    private static final String[] NOUNS = {"fox", "lion", "moon", "river", "tree", "ocean", "star","mechanic"};


    private static final int MAX_RANDOM_SUFFIX = 1000;
    private static final Set<String> usedUsernames = new HashSet<>();
    //
    private static final Faker faker = new Faker();

    @Override
    public String generateRandomUserName() {
        Random rand  = new Random();
        int numberSuffix =  rand.nextInt(MAX_RANDOM_SUFFIX);
        String username = generateRandomWordFromGameOfThrones() + "_" + generateRandomWordFromHarryPotter() + numberSuffix;

        // Ensure uniqueness
        while (usedUsernames.contains(username)) {
            username = generateRandomWordFromGameOfThrones() + "_" + generateRandomWordFromHarryPotter() + numberSuffix;
        }

        usedUsernames.add(username);
        return username;
    }

    private static String generateRandomWordFromHarryPotter() {
        return faker.harryPotter().house();
    }
    private static String generateRandomWordFromGameOfThrones() {
        return faker.gameOfThrones().character();
    }



}
