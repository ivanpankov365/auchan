package com.auchan.startblock.model;

import javax.persistence.*;

@Entity
@Table(name = "auchanfriends")
public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "phone", nullable = false)
    private String phone;

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }
}
