package Ornekler.OgrenciBilgiSistemi;

public class Course {
    Teacher teacher;
    String name, code, prefix;
    int note;
    int verbalNote;
    double verbalEffect;

    Course(String name, String code, String prefix, double verbalEffect) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.verbalNote = 0;
        this.verbalEffect = verbalEffect;
    }


    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            printTeacher();
        } else {
            System.out.println("Eğitmen ve Ders Bölümleri Uyuşmuyor");
        }

    }

    void printTeacher() {
//        System.out.println(this.name + " Dersinin Eğitmen Bilgileri : ");
//        this.teacher.print();
    }
}
