package sda.SingleResponsibilityOfBusiness;

public class Firma {

    public String typeOfBusiness;
    public int NIP;

    Firma (String typeOfBusiness, int NIP) {
        this.typeOfBusiness = typeOfBusiness;
        this.NIP = NIP;
    }

    public String getTypeOfBusiness() {
        return typeOfBusiness;
    }

    public int getNIP() {
        return NIP;
    }

    public void setTypeOfBusiness(String typeOfBusiness) {
        this.typeOfBusiness = typeOfBusiness;
    }

    public void setNIP(int NIP) {
        this.NIP = NIP;
    }

}
