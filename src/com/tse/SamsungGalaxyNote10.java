package com.tse;

public class SamsungGalaxyNote10 extends Samsung {
    public SamsungGalaxyNote10() {
        super(12, "Gray", "Carbon", "IM23455667777");
    }

    @Override
    public void addContact(int nr, String phoneNumber, String firstName, String lastName) {
        super.addContact(nr, phoneNumber, firstName, lastName);
    }

    @Override
    public void listContacts() {
        super.listContacts();
    }

    @Override
    public void sendMessage(String phoneNumber, String messageContent) {
        super.sendMessage(phoneNumber, messageContent);
    }

    @Override
    public void listMessages(String phoneNumber) {
        super.listMessages(phoneNumber);
    }

    @Override
    public void call(String phoneNumber) {
        super.call(phoneNumber);
    }

    @Override
    public double getAvailableBatteryLife() {
        System.out.print("Available battery life(hours) for SamsungGalaxyNote10: ");
        return Math.round(super.getBatteryLife() - getBatteryConsumption());
    }

}
