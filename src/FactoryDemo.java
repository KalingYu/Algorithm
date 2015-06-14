interface TV{
    public void turnOn();
    public void turnOff();
}

class ChangHongTV implements TV{

    @Override
    public void turnOn() {
        System.out.println("ChanghongTV has turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("ChanghongTV has turned off");
    }
}



interface TVFactory{
    public TV createTV();
}

class ChangHongTVFactory implements TVFactory {

    @Override
    public TV createTV() {
        return new ChangHongTV();
    }
}



public class FactoryDemo {

    public static void main(String[] args) {
        TVFactory tvFactory = new ChangHongTVFactory();
        TV tv = tvFactory.createTV();
        tv.turnOn();
    }
}
