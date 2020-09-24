package com.tse;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public abstract class MobilePhone implements Phone {
    private List<Message> messages;
    private List<Contact> contacts;
    private List<Call> calls;

    private final double batteryLife;
    private double batteryConsumption;
    private String colour;
    private String material;
    private String imei;

    public MobilePhone(double batteryLife, String colour, String material, String imei) {
        this.batteryLife = batteryLife;
        this.colour = colour;
        this.material = material;
        this.imei = imei;
        this.contacts = new ArrayList<>();
        this.messages = new ArrayList<>();
        this.calls = new ArrayList<>();
        this.batteryConsumption = 0;
    }

    protected abstract double getAvailableBatteryLife();

    @Override
    public void addContact(int nr, String phoneNumber, String firstName, String lastName) {
        contacts.add(new Contact(nr, phoneNumber, firstName, lastName));
        System.out.println("Contact added: " + firstName + " " + lastName);
    }

    @Override
    public void listContacts() {
        System.out.println("Phone contacts: ");
        for(Contact contact:contacts){
            System.out.println(contact.getNr() + " " + contact.firstName + " " + contact.getLastName() + " " + contact.getPhoneNumber());
        }
        System.out.println("-----------------------------------");
    }

    @Override
    public void sendMessage(String phoneNumber, String messageContent) {
        if(messageContent.length() < 500){
            messages.add(new Message(phoneNumber, messageContent));
            batteryConsumption += 1;
            for(Contact contact:contacts){
                if(contact.getPhoneNumber().equals(phoneNumber)){
                    System.out.println("Message sent to: " + contact.getFirstName() + " " + contact.getLastName() + " " + " \nMessage content: " + messageContent);
                    break;
                } else{
                    System.out.println("Message sent to " + phoneNumber + "\n" + "Message content: " + messageContent);
                    break;
                }
            }

        } else {
            System.out.println("Your message is too large, exceeds 500 characters.");
        }
    }

    @Override
    public void listMessages(String phoneNumber) {
        System.out.println("Messages: ");
        for(Message message:messages){
            if(message.getPhoneNumber().equals(phoneNumber)){
                for(Contact contact:contacts){
                    if(contact.getPhoneNumber().equals(phoneNumber)){
                        System.out.println("To: " + contact.getFirstName() + " " + contact.getLastName() + ": \n" + "Message content: " + message.getContent());
                    }
                }

            }
        }
        System.out.println("-----------------------------------");
    }

    @Override
    public void call(String phoneNumber) {
        for(Contact contact:contacts){
            if(contact.getPhoneNumber().equals(phoneNumber)){
                System.out.println("Calling " + contact.getFirstName() + " " + contact.getLastName());
                calls.add(new Call(phoneNumber));
                batteryConsumption += 2;

            } else {
                System.out.println("You don`t have this contact in your contacts list, you cant still call him ... but as a hint: add it");
                calls.add(new Call(phoneNumber));
                batteryConsumption +=2;
                break;
            }
        }
    }

    @Override
    public void viewHistory() {
        System.out.println("Calls: ");
        for(Call call:calls){
            for(Contact contact:contacts){
                if(contact.getPhoneNumber().equals(call.getPhoneNumber())){
                    System.out.println("To: " + contact.getFirstName() + " " + contact.getLastName() + "\n" + call.phoneNumber + " " + call.getDateAndTime());
                }
            }
        }
        System.out.println("-----------------------------------");
    }

    private class Contact {
        private int nr;
        private String phoneNumber;
        private String firstName;
        private String lastName;

        public Contact(int nr, String phoneNumber, String firstName, String lastName) {
            this.nr = nr;
            this.phoneNumber = phoneNumber;
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public int getNr() {
            return nr;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
    }

    private class Message {
        private String phoneNumber;
        private String content;

        public Message(String phoneNumber, String content) {
            this.phoneNumber = phoneNumber;
            this.content = content;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public String getContent() {
            return content;
        }
    }

    private class Call {
        private String phoneNumber;
        private LocalDateTime dateAndTime;

        public Call(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            this.dateAndTime = LocalDateTime.now();
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public LocalDateTime getDateAndTime() {
            return dateAndTime;
        }
    }

    public double getBatteryLife() {
        return batteryLife;
    }

    public double getBatteryConsumption() {
        return batteryConsumption;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public String getImei() {
        return imei;
    }

}
