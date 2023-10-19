package design.patterns.facade;

import subsystem1.crm.CrmService;
import subsystem2.zipcode.ZipcodeApi;

public class Facade {
    public void migrateCustomer(String name, String zipCode) {
        String city = ZipcodeApi.getInstancia().retrieveCity(zipCode);
        String state = ZipcodeApi.getInstancia().retrieveState(zipCode);


        CrmService.saveCostumer(name, zipCode, city, state);
    }
}
