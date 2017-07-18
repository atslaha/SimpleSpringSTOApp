package il.co.ssstoapp.classes;

import il.co.ssstoapp.interfaces.Service;

public class ServiceChangeTyres implements Service {
    
    public ServiceChangeTyres() {}

    @Override
    public void startService() {
        System.out.println("Service is started.");

    }

    @Override
    public void finishService() {
        System.out.println("Service is finished.");

    }

}
