package com.company.entity;

import java.security.SecureRandom;
import java.util.Random;

/**
 * Created by Андрей on 15.06.2017.
 */
public class RandomizedHuman {
    private final Random random = new SecureRandom();

    protected int randomAction(){
        return random.nextInt(15);
    }
}
