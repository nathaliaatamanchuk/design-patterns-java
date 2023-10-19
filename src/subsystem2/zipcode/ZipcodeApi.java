package subsystem2.zipcode;

import design.patterns.singleton.SingletonEager;

public class ZipcodeApi {
    private static ZipcodeApi instancia = new ZipcodeApi();

    private ZipcodeApi() {super();}

    public static ZipcodeApi getInstancia () {return instancia;}

    public String retrieveCity(String zipCode) {
        return "City";
    }

    public String retrieveState(String zipCode) {
        return "State";
    }
}
