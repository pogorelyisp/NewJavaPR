public class Main {
    public static void main(String[] args) {

        int eaters = 5; // сколько людей будут есть

        int water = 3000; // миллилитров воды
        int potatoes = 5; // картофелин
        int chicken = 6; // куриных бёдер
        int spices = 10; // ложек специй

//        if (eaters <= 0) {
//            System.out.println("Едоков должно быть больше нуля");
//            return;
//        }

        try {
            System.out.println("Сварили суп. На одного человека вышло:");
            System.out.println((water / eaters) + " миллилитров(а) воды");
            System.out.println(((float) potatoes / eaters) + " картофелин(а/ы)");
            System.out.println(((float) chicken / eaters) + " куриных(ое) бёдер(ро)");
            System.out.println(((float) spices / eaters) + " ложек(ки/ка) специй");
        }
        catch(Exception e){
            System.out.println("Ошибка:" + e.getMessage() + "\nСообщение: Едоков должно быть больше нуля");
        }


    }
}