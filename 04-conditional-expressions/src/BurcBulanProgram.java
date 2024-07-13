import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz ay (1-12): ");
        int month = input.nextInt();
        System.out.print("Doğduğunuz gün (1-31): ");
        int day = input.nextInt();
        String burc = "";
        switch (month) {
            case 1:
                burc = (day >= 1 && day <= 19) ? "Oğlak Burcu" : "Kova Burcu";
                break;
            case 2:
                burc = (day >= 1 && day <= 18) ? "Kova Burcu" : "Balık Burcu";
                break;
            case 3:
                burc = (day >= 1 && day <= 20) ? "Balık Burcu" : "Koç Burcu";
                break;
            case 4:
                burc = (day >= 1 && day <= 20) ? "Koç Burcu" : "Boğa Burcu";
                break;
            case 5:
                burc = (day >= 1 && day <= 21) ? "Boğa Burcu" : "İkizler Burcu";
                break;
            case 6:
                burc = (day >= 1 && day <= 22) ? "İkizler Burcu" : "Yengeç Burcu";
                break;
            case 7:
                burc = (day >= 1 && day <= 22) ? "Yengeç Burcu" : "Aslan Burcu";
                break;
            case 8:
                burc = (day >= 1 && day <= 22) ? "Aslan Burcu" : "Başak Burcu";
                break;
            case 9:
                burc = (day >= 1 && day <= 22) ? "Başak Burcu" : "Terazi Burcu";
                break;
            case 10:
                burc = (day >= 1 && day <= 22) ? "Terazi Burcu" : "Akrep Burcu";
                break;
            case 11:
                burc = (day >= 1 && day <= 21) ? "Akrep Burcu" : "Yay Burcu";
                break;
            case 12:
                burc = (day >= 1 && day <= 21) ? "Yay Burcu" : "Oğlak Burcu";
                break;
            default:
                burc = "Geçersiz ay!";
                break;
        }

        if (!burc.equals("Geçersiz ay!")) {
            System.out.println("switch-case ile Burcunuz: " + burc);
        } else {
            System.out.println(burc);
        }



        if (month == 1) {
            if (day >= 1 && day <= 19) {
                burc = "Oğlak Burcu";
            } else if (day >= 20) {
                burc = "Kova Burcu";
            }
        } else if (month == 2) {
            if (day >= 1 && day <= 18) {
                burc = "Kova Burcu";
            } else if (day >= 19) {
                burc = "Balık Burcu";
            }
        } else if (month == 3) {
            if (day >= 1 && day <= 20) {
                burc = "Balık Burcu";
            } else if (day >= 21) {
                burc = "Koç Burcu";
            }
        } else if (month == 4) {
            if (day >= 1 && day <= 20) {
                burc = "Koç Burcu";
            } else if (day >= 21) {
                burc = "Boğa Burcu";
            }
        } else if (month == 5) {
            if (day >= 1 && day <= 21) {
                burc = "Boğa Burcu";
            } else if (day >= 22) {
                burc = "İkizler Burcu";
            }
        } else if (month == 6) {
            if (day >= 1 && day <= 22) {
                burc = "İkizler Burcu";
            } else if (day >= 23) {
                burc = "Yengeç Burcu";
            }
        } else if (month == 7) {
            if (day >= 1 && day <= 22) {
                burc = "Yengeç Burcu";
            } else if (day >= 23) {
                burc = "Aslan Burcu";
            }
        } else if (month == 8) {
            if (day >= 1 && day <= 22) {
                burc = "Aslan Burcu";
            } else if (day >= 23) {
                burc = "Başak Burcu";
            }
        } else if (month == 9) {
            if (day >= 1 && day <= 22) {
                burc = "Başak Burcu";
            } else if (day >= 23) {
                burc = "Terazi Burcu";
            }
        } else if (month == 10) {
            if (day >= 1 && day <= 22) {
                burc = "Terazi Burcu";
            } else if (day >= 23) {
                burc = "Akrep Burcu";
            }
        } else if (month == 11) {
            if (day >= 1 && day <= 21) {
                burc = "Akrep Burcu";
            } else if (day >= 22) {
                burc = "Yay Burcu";
            }
        } else if (month == 12) {
            if (day >= 1 && day <= 21) {
                burc = "Yay Burcu";
            } else if (day >= 22) {
                burc = "Oğlak Burcu";
            }
        } else {
            burc = "Geçersiz ay!";
        }

        if (!burc.equals("Geçersiz ay!")) {
            System.out.println("if-else ile Burcunuz: " + burc);
        } else {
            System.out.println(burc);
        }
    }
}
