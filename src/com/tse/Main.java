package com.tse;

public class Main {

    public static void main(String[] args) {
        Phone phone1 = new SamsungGalaxyNote10();
        phone1.addContact(1, "0742409405", "John", "Doe1");
        phone1.addContact(2, "0741596085", "John", "Doe2");
        phone1.sendMessage("0742409405", "First message");
        phone1.sendMessage("0742409405", "Second message");
        phone1.call("0741596085");
        phone1.call("0742409405");
        phone1.sendMessage("0728906789", "Third message");
        phone1.listContacts();
        phone1.listMessages("0742409405");
        phone1.viewHistory();
        MobilePhone mob1 = (MobilePhone) phone1;
        System.out.println(mob1.getAvailableBatteryLife());
        mob1.sendMessage("0742409403", "Fourth message");
        mob1.sendMessage("0789098765", "Fifth message");
        System.out.println(mob1.getAvailableBatteryLife());
        System.out.println("------------------------------------------------------------------------------------");


        MobilePhone mob2 = new SamsungGalaxyS12();
        mob2.addContact(1, "0710210222", "Johny", "Doe1");
        mob2.addContact(2, "0723456789", "Johny", "Doe2");
        mob2.addContact(3, "0789678901", "Johny", "Doe3");
        mob2.sendMessage("0710210222", "First message");
        mob2.sendMessage("0710210222", "Second message");
        mob2.sendMessage("0710210222", "Third message");
        mob2.call("0710210222");
        mob2.call("0897654324");
        mob2.listContacts();
        mob2.listMessages("0710210222");
        mob2.viewHistory();
        System.out.println(mob2.getAvailableBatteryLife());
        System.out.println("--------------------------------------------------------------------");



        MobilePhone mob3 = new IphoneSE();
        mob3.addContact(1, "0789987654", "Johnyy", "Doe1");
        mob3.addContact(2, "0879654321", "Johnyy", "Doe2");
        mob3.addContact(3, "0756432145", "Johnyy", "Doe3");
        mob3.sendMessage("0789987654", "First message");
        mob3.sendMessage("0789987654", "Message two");
        mob3.call("0789987654");
        mob3.call("0756432145");
        mob3.listContacts();
        mob3.listMessages("0789987654");
        mob3.viewHistory();
        System.out.println(mob3.getAvailableBatteryLife());
        System.out.println("--------------------------------------------------");


        MobilePhone mob4 = new Iphone12();
        mob4.addContact(1, "0789098723", "Johnel", "Doe1");
        mob4.addContact(2, "0789675423", "Johnel", "Doe2");
        mob4.addContact(3, "0765432145", "Johnel", "Doe3");
        mob4.sendMessage("0789098723", "First message");
        mob4.sendMessage("0789098723", "Second message");
        mob4.sendMessage("0789098723", "Third message");
        mob4.sendMessage("0765432145", "First message to this contact");
        mob4.call("0765432145");
        mob4.call("0765432145");
        mob4.listContacts();
        mob4.listMessages("0765432145");
        mob4.listMessages("0789098723");
        mob4.viewHistory();
        System.out.println(mob4.getAvailableBatteryLife());

    }
}
