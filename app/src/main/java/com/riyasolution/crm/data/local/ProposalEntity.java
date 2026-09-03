package com.riyasolution.crm.data.local;

public class ProposalEntity {
    public int id;
    public String title;
    public String client;
    public double amount;

    public ProposalEntity(int id, String title, String client, double amount) {
        this.id = id;
        this.title = title;
        this.client = client;
        this.amount = amount;
    }
}