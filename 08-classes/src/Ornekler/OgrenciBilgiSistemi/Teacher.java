package Ornekler.OgrenciBilgiSistemi;

public class Teacher {
    String name, mpno, branch;

    Teacher(String name, String branch, String mpno) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void print() {
        System.out.println("İsim : " + this.name);
        System.out.println("Telefon : " + this.mpno);
        System.out.println("Branş : " + this.branch);

    }
}
