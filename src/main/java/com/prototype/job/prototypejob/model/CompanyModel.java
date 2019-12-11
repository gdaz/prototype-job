package com.prototype.job.prototypejob.model;

import java.io.Serializable;

public class CompanyModel implements Serializable {

    private String companyName;
    private String address;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
