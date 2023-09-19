package exercitii.phone_ex1;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private List<String> contacts;
    private List<String> blackList;
    public PhoneBook(){
        this.contacts = new ArrayList<>();
        this.blackList = new ArrayList<>();
    }
    public PhoneBook(List<String> contacts, List<String> blackList) {
        this.contacts = contacts;
        this.blackList = blackList;
    }

    public List<String> getContacts() {
        return contacts;
    }

    public void setContacts(List<String> contacts) {
        this.contacts = contacts;
    }

    public List<String> getBlackList() {
        return blackList;
    }

    public void setBlackList(List<String> blackList) {
        this.blackList = blackList;
    }

    public static List<String> filterContacts(List<String> allContacts, List<String> blackList) {
//        for (String contact:allContacts){
//            if (blackList.contains(contact)){
//                allContacts.remove(contact);//nu poate modifica elem in timp ce parcurge lista,da eroare la runtime
//            }
//        }
//        return allContacts;
//        List<String> result = new ArrayList<>(); //creez o alta lista
//        for (String contact : allContacts) {
//            if (!blackList.contains(contact)) {
//                result.add(contact);  //in care adaug contactele din allContacts care nu se regasesc in blackList
//            }
//        }
//        return result;
        for (String blackListContact : blackList) {
            if (allContacts.contains(blackListContact)) {
                allContacts.remove(blackListContact);//acum merge sa sterg pt ca parcurg blackList dar sterg elem din allContacts
            }
        }
        return allContacts;
    }
//addToBlackList()
//Metoda non-statică
//Adaugă numărul primit ca parametru în lista de numere blocate și îl șterge din lista de contacte

    public void addToBlackList(String phoneNumber) throws Exception {
        if (!contacts.contains(phoneNumber)){
            throw new Exception("numarul " + phoneNumber + " nu exista");
        }
        blackList.add(phoneNumber);
        contacts.remove(phoneNumber);
    }
//removeFromBlackList()
//Metoda non-statică
//Adaugă numărul primit ca parametru în lista de numere și îl șterge din lista de numere blocate
public void  removeFromBlackList(String phoneNumber) throws Exception {
    if (!blackList.contains(phoneNumber)){
        throw new Exception("numarul " + phoneNumber + " nu exista");
    }
    blackList.remove(phoneNumber);
    contacts.add(phoneNumber);
}

}
