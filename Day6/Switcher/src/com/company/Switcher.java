package com.company;

public class Switcher {
    String TransmissionMode;
    String Manufacturers;
    int Ports;
    int Speed;
    int Bandwidth;

    public Switcher(int Ports, int Speed,int Bandwidth, String TransmissionMode,String Manufacturers) {
            this.Ports=Ports;
            this.Speed=Speed;
            this.TransmissionMode=TransmissionMode;
            this.Bandwidth=Bandwidth;
            this.Manufacturers=Manufacturers;
    }
    public void On() {
        System.out.println("Switched Turned On");
    }
    public void Off() {
        System.out.println("Switched Turned Off");
    }
    public void Disabled() {
        System.out.println("Switched Disabled");
    }
    public void display() {
        System.out.println("Ports "+this.Ports);
        System.out.println("Speed "+this.Speed);
        System.out.println("Bandwidth "+this.Bandwidth);
        System.out.println("TransmissionMode "+this.TransmissionMode);
        System.out.println("Manufacturers "+this.Manufacturers);

    }
}
