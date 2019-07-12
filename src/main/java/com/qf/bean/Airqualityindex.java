package com.qf.bean;

import java.util.Date;

public class Airqualityindex {
    private Integer aid;

    private Integer did;

    private Date montime;

    private Integer pm10;

    private Integer pm25;

    private String monstation;

    private Date lastmodtime;

    private  District district;



    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Date getMontime() {
        return montime;
    }

    public void setMontime(Date montime) {
        this.montime = montime;
    }

    public Integer getPm10() {
        return pm10;
    }

    public void setPm10(Integer pm10) {
        this.pm10 = pm10;
    }

    public Integer getPm25() {
        return pm25;
    }

    public void setPm25(Integer pm25) {
        this.pm25 = pm25;
    }

    public String getMonstation() {
        return monstation;
    }

    public void setMonstation(String monstation) {
        this.monstation = monstation == null ? null : monstation.trim();
    }

    public Date getLastmodtime() {
        return lastmodtime;
    }

    public void setLastmodtime(Date lastmodtime) {
        this.lastmodtime = lastmodtime;
    }
}