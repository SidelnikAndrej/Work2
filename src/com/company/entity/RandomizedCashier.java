package com.company.entity;

/**
 * Created by Андрей on 15.06.2017.
 */
public class RandomizedCashier extends RandomizedHuman implements Cashier {
    @Override
    public int sellThing(Customer customer) {
        return randomAction();
    }
}
