package com.acme.banking.dbo.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.UUID;

public class Client {
    private UUID id;
    private String name;
    private Collection<UUID> accountIds = new ArrayList<>(); //TODO

    public Client(UUID id, String name) {
        //Guard clauses
        if (id == null) throw new RuntimeException("id can't be null");
        if (name == null || name.isEmpty()) throw new IllegalArgumentException("name can't be empty");

        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //TODO addAccount and reference integrity
    public void addAccount() {

    }
}