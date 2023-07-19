package chapter6;

public class PhoneBill { //здесь мьі задаем СХЕМУ (поля) PhoneBill-a!!!!!!!!!

    // a phone bill should have an ID;
    // a number of allotted minutes;
    // and a number of minutes used.

    // a default constructor;
    // constructor that accepts the phone bill ID only;
    // constructor that accepts all fields.

    public PhoneBill(){
        //тут мьі задаем ДЕФОЛТНЬІЕ ДАННЬІЕ (обьічно конструктор пишется перед всеми полями)
        id = 1;
        allottedMinutes = 60;
        usedMinutes = 0;
    }

    public PhoneBill(int externalId) {
        id = externalId;
        allottedMinutes = 60;
        usedMinutes = 0;
    }

    public PhoneBill(int externalId, int externalAllottedMinutes, int externalUsedMinutes) {
        id = externalId;
        allottedMinutes = externalAllottedMinutes;
        usedMinutes = externalUsedMinutes;
    }

    public int id;
    public double allottedMinutes;
    public double usedMinutes;

}