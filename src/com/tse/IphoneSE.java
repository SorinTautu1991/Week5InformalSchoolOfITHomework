package com.tse;

public class IphoneSE extends Apple {
    public IphoneSE() {
        super(13, "Black", "Titan", "IM263738292922");
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
    public void viewHistory() {
        super.viewHistory();
    }

    @Override
    public double getAvailableBatteryLife() {
        System.out.print("Available battery life(hours) for IphoneSE: ");
        return Math.round(super.getBatteryLife() - getBatteryConsumption());
    }
}
