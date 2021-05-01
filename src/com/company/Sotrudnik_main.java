package com.company;

public class Sotrudnik_main {
    public static  void main(String[] args) {
        Sotrudnik sotrudnik1 = SpisokSotrudnikov1();
        pechataetInfo(sotrudnik1);
        System.out.println();
        Sotrudnik [] sotrudniki=dangeonParty();
        for (int i = 0; i < sotrudniki.length; i++) {
            pechataetInfo(sotrudniki[i]);
        }  System.out.println();

        Sotrudnik [] sotrudniki2=dangeonParty();
        for (int i = 0; i < sotrudniki2.length; i++)
            pechataetInfo_Do_40_let(sotrudniki[i]);


        }

    private static Sotrudnik[] dangeonParty() {
        Sotrudnik [] sotrudniki;
        sotrudniki= new Sotrudnik[5];
        sotrudniki[0]= new Sotrudnik("aaa","bbb","ccc","aaa@mail.ru",98765432,70000,36,"warrior");
        sotrudniki[1]= new Sotrudnik("fff","hhh","yyy","art@mail.ru",98925432,40000,120,"archer");
        sotrudniki[2]= new Sotrudnik("agv","rbb","ncc","ata@mail.ru",98765432,50000,29,"cliric");
        sotrudniki[3]= new Sotrudnik("rtya","iiibb","ccc","ava@mail.ru",98765432,30000,35,"necromant");
        sotrudniki[4]= new Sotrudnik("asssaa","bblknkb","crtyc","aca@mail.ru",98765432,20000,67,"druid");
        return sotrudniki;
    }
    private static  Sotrudnik SpisokSotrudnikov1() {
        Sotrudnik sotrudnik1=new Sotrudnik("ivan","ivanov","ivanovich","ivanov@mail.ru",123456789,10000,93,"Stripdancer");
        return sotrudnik1;
    }
    private static void pechataetInfo(Sotrudnik sotrudnik) {
        System.out.println(sotrudnik.getSurname()+" "+ sotrudnik.getName()+" "+ sotrudnik.getLastname());
        System.out.println("phone: "+ sotrudnik.getPhone_number()+", mail: "+ sotrudnik.getEmail()+", age: "+sotrudnik.getAge()+ ", prof: "+sotrudnik.getPosition()+", zarplata: "+ sotrudnik.getSalary()+" rub");
}
    private static void pechataetInfo_Do_40_let(Sotrudnik sotrudnik) {
        if (sotrudnik.getAge()<40){
        System.out.println(sotrudnik.getSurname()+" "+ sotrudnik.getName()+" "+ sotrudnik.getLastname());
        System.out.println("phone: "+ sotrudnik.getPhone_number()+", mail: "+ sotrudnik.getEmail()+", age: "+sotrudnik.getAge()+ ", prof: "+sotrudnik.getPosition()+", zarplata: "+ sotrudnik.getSalary()+" rub");

    }
}
}

