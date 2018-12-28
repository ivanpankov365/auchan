package com.auchan.startblock.model;

import javax.persistence.*;

@Entity
@Table(name = "products")
public class UserProducts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "position", nullable = false)
    private String position;

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public String getPosition() {
        return position;
    }
}
