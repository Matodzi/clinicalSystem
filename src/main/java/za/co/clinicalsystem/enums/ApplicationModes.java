package za.co.clinicalsystem.enums;

public enum ApplicationModes {

    NETWORK("network"),
    NONNETWORK("nonnetwork");

    private final String networkCode;

    ApplicationModes(String networkCode){
        this.networkCode = networkCode;
    }

    public String getNetworkCode(){
        return this.networkCode;
    }
}
