package com.auchan.startblock.model;

import javax.persistence.*;

@Entity
@Table(name = "pushs")
public class ActionFlag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "flag", nullable = false)
    private String flag;

    public void setName(String name) {
        this.name = name;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public String getFlag() {
        return flag;
    }
}
