package exercitii.phone_ex1;

public class Main {
    public static void main(String[] args) throws Exception {
//        PhoneBook phoneBook = new PhoneBook();
//        List<String> allContacts = new ArrayList<>();
//        allContacts.add("23");
//        allContacts.add("34");
//        allContacts.add("56");
//
//        List<String> blackList = new ArrayList<>();
//        blackList.add("23");
//        blackList.add("33");
//        blackList.add("34");
//
//        phoneBook.setContacts(allContacts);
//        phoneBook.setBlackList(blackList);
//
//        PhoneBook phoneBook1 = new PhoneBook(allContacts,blackList);
        // System.out.println(PhoneBook.filterContacts(allContacts,blackList));
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.getContacts().add("23");
        phoneBook.getContacts().add("34");
        phoneBook.getContacts().add("56");

        phoneBook.getBlackList().add("23");
        phoneBook.getBlackList().add("33");
        phoneBook.getBlackList().add("34");
        try {
            phoneBook.addToBlackList("78");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        phoneBook.addToBlackList("56");
        System.out.println(phoneBook.getContacts());
        System.out.println(phoneBook.getBlackList());

        try {
            phoneBook.removeFromBlackList("78");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        phoneBook.removeFromBlackList("56");
        System.out.println(phoneBook.getContacts());
        System.out.println(phoneBook.getBlackList());
    }
}
