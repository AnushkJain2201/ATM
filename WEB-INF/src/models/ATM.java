package models;

public class ATM {
    private Integer ATM_id;
    private String name;
    private String address;
    private String pin;

    public Integer getATM_id() {
        return ATM_id;
    }
    public void setATM_id(Integer aTM_id) {
        ATM_id = aTM_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPin() {
        return pin;
    }
    public void setPin(String pin) {
        this.pin = pin;
    }

    
}

