package Ornekler.OgrenciBilgiSistemi;

public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name, stuNo, classes;
    double average;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNota(int note1, int verbalNote1, int note2, int verbalNote2, int note3, int verbalNote3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (verbalNote1 >= 0 && verbalNote1 <= 100) {
            this.c1.verbalNote = verbalNote1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (verbalNote2 >= 0 && verbalNote2 <= 100) {
            this.c2.verbalNote = verbalNote2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
        if (verbalNote3 >= 0 && verbalNote3 <= 100) {
            this.c3.verbalNote = verbalNote3;
        }
    }

    void isPass() {
        this.average = ((this.c1.note * (1 - this.c1.verbalEffect) + this.c1.verbalNote * this.c1.verbalEffect) +
                (this.c2.note * (1 - this.c2.verbalEffect) + this.c2.verbalNote * this.c2.verbalEffect) +
                (this.c3.note * (1 - this.c3.verbalEffect) + this.c3.verbalNote * this.c3.verbalEffect)) / 3.0;

        if (this.average >= 55) {
            System.out.println(this.name + " Tebrikler Sınıfı Geçtin");
            this.isPass = true;
        } else {
            System.out.println(this.name + " Sınıfta Kaldın");
            this.isPass = false;
        }
        printNote();
    }

    void printNote() {
        System.out.println(this.c1.name + " Notu : " + this.c1.note + " Sözlü Notu : " + this.c1.verbalNote);
        System.out.println(this.c2.name + " Notu : " + this.c2.note + " Sözlü Notu : " + this.c2.verbalNote);
        System.out.println(this.c3.name + " Notu : " + this.c3.note + " Sözlü Notu : " + this.c3.verbalNote);
        System.out.println("Ortalamanız : " + this.average);
        System.out.println("-------------------");
    }
}
