package com.Areksoft.mychittiapplication;

import java.io.Serializable;

class User implements Serializable {
    private String fName;
    private String EmailID;
    private String lName;
    private String PhoneNo;

    User(){}

    User(String fName, String lName, String PhoneNo, String EmailID){
        this.fName=fName;
        this.lName=lName;
        this.PhoneNo=PhoneNo;
        this.EmailID=EmailID;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    public String getEmailID() {
        return EmailID;
    }

    public void setEmailID(String emailID) {
        EmailID = emailID;
    }

}
