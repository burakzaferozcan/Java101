package Ornekler.OgrenciBilgiSistemi;

public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mahmut", "TRH", "05546834040");
        Teacher t2 = new Teacher("Burak", "FZK", "05546833548");
        Teacher t3 = new Teacher("Külyutmaz", "BIO", "05547865123");

        Course tarih = new Course("Tarih", "101", "TRH", 0.20);
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik", "102", "FZK", 0.30);
        fizik.addTeacher(t2);
        Course biyo = new Course("Biyoloji", "103", "BIO", 0.25);
        biyo.addTeacher(t3);
        Student s1 = new Student("İnek Şaban", "123", "4", tarih, fizik, biyo);
        s1.addBulkExamNota(100, 90, 78, 80, 50, 60);
        s1.isPass();
        Student s2 = new Student("Güdük Necmi", "124", "4", tarih, fizik, biyo);
        s2.addBulkExamNota(50, 50, 50, 50, 50, 50);
        s2.isPass();
    }
}
