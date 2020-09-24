package com.tse;

public interface Phone {
    void addContact(int nr, String phoneNumber, String firstName, String lastName);
    void listContacts();
    void sendMessage(String phoneNumber, String messageContent);
    void listMessages(String phoneNumber);
    void call(String phoneNumber);
    void viewHistory();
}
