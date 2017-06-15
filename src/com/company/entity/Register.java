package com.company.entity;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by Андрей on 15.06.2017.
 */
public class Register implements Runnable{

    private final Cashier cashier;

    private final Queue<Customer> queue = new LinkedList<>();

    public Register(Cashier cashier){

        this.cashier = cashier;
    }

    public void newCustomer(Customer customer){

        queue.add(customer);
    }

    public void run(){
        int numberOfCustomer = 0;
        int totalTime = 0;
        Customer customer;
        while((customer = queue.poll()) != null){
            totalTime += cashier.sellThing(customer);
            customer.byThings();
            /*totalTime += cashier.beepTheGoods();
            totalTime += cashier.callAmount();
            totalTime += customer.payForGoods();
            totalTime += cashier.giveChangeAndReceipt();*/
            numberOfCustomer++;
        }
        System.out.println("It was "+numberOfCustomer+" customers and it took "+totalTime+" seconds");
    }

}
