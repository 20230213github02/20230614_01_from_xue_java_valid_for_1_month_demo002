package com.example.demo002.entity;

import java.io.Serializable;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Table(name = "newspaper")
public class Ball implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String ntcTITLE;

    private String ntcJUYO;
    private String ntcDATE;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNtcTITLE() {
        return ntcTITLE;
    }

    public void setNtcTITLE(String ntcTITLE) {
        this.ntcTITLE = ntcTITLE;
    }

    public String getNtcJUYO() {
        return ntcJUYO;
    }

    public void setNtcJUYO(String ntcJUYO) {
        this.ntcJUYO = ntcJUYO;
    }


    public String getNtcDATE() { return ntcDATE; }

    public void setNtcDATE(String ntcDATE) { this.ntcDATE = ntcDATE; }


    @Override
    public String toString() {
        return "Ball{" +
                "id=" + id +
                ", ntcTITLE='" + ntcTITLE + '\'' +
                ", ntcJUYO='" + ntcJUYO + '\''+ ", " +
                "ntcDATE='" + ntcDATE + '\''+
                '}';
    }
}
