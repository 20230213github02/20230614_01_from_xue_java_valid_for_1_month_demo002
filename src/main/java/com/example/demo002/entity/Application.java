package com.example.demo002.entity;

import java.io.Serializable;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Table(name = "news")
public class Application implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String appUketsukeNo;

    private String appShinseiKubun;

    private String appShinseiDate;

    private String appKokaiyoStatus;

    private String appShinseishaKoshinDateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppUketsukeNo() {
        return appUketsukeNo;
    }

    public void setAppUketsukeNo(String appUketsukeNo) {
        this.appUketsukeNo = appUketsukeNo;
    }

    public String getAppShinseiKubun() {
        return appShinseiKubun;
    }

    public void setAppShinseiKubun(String appShinseiKubun) {
        this.appShinseiKubun = appShinseiKubun;
    }

    public String getAppShinseiDate() {
        return appShinseiDate;
    }

    public void setAppShinseiDate(String appShinseiDate) {
        this.appShinseiDate = appShinseiDate;
    }

    public String getAppKokaiyoStatus() {
        return appKokaiyoStatus;
    }

    public void setAppKokaiyoStatus(String appKokaiyoStatus) {
        this.appKokaiyoStatus = appKokaiyoStatus;
    }

    public String getAppShinseishaKoshinDateTime() {
        return appShinseishaKoshinDateTime;
    }

    public void setAppShinseishaKoshinDateTime(String appShinseishaKoshinDateTime) {
        this.appShinseishaKoshinDateTime = appShinseishaKoshinDateTime;
    }

    @Override
    public String toString() {
        return "Application{" +
                "id=" + id +
                ", appUketsukeNo='" + appUketsukeNo + '\'' +
                ", appShinseiKubun='" + appShinseiKubun + '\'' +
                ", appShinseiDate='" + appShinseiDate + '\'' +
                ", appKokaiyoStatus='" + appKokaiyoStatus + '\'' +
                ", appShinseishaKoshinDateTime='" + appShinseishaKoshinDateTime + '\'' +
                '}';
    }
}
