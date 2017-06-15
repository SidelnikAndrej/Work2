package com.company.entity;

/**
 * Created by Андрей on 15.06.2017.
 */
public class RandomizedCustomer extends RandomizedHuman implements Customer {
    @Override
    public int byThings() {
        return randomAction();
    }
}
