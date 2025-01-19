package com.dti.controlflow;

//Control Flow กลุ่ม Selection/Condition การเลือกทำ
public class Km01CF {

    public static void main(String[] args) {
//        แบบที่ 1 เรียกพิสูจน์ครั้งเดียวจริงทำเท็จไม่ทำ
        int a = 2;

        if (a > 5) {
            System.out.println("Hello....");
        }
        System.out.println("+++++++++++++");
//        แบบที่ 2 เรียกพิสูจน์ครั้งเดียวจริงทำอย่าง เท็จทำอย่าง : IF - Else
        int b = 100;
        if (b < 80) {
            System.out.println("Wow...");
        } else {
            System.out.println("Woo...");
        }
        System.out.println("+++++++++++++");
//        แบบที่ 3 พิสูจน์หลายครั้ง : if-else-if , switch-case
        int c = 70;
        if (c > 80) {
            System.out.println("111");
        } else if (c > 70) {
            System.out.println("222");
        } else if (c > 60) {
            System.out.println("333");
        } else {
            System.out.println("5555555");
        }
        System.out.println("+++++++++++++");

        int busNumber = 84;
        switch (busNumber) {
            case 80:
                System.out.println("SaNamLoang");
                break;
            case 57:
                System.out.println("PaTa");
                break;
            case 84:
                System.out.println("Wat Rai King");
                break;
            case 81:
                System.out.println("SiRiRaj");
                break;
            default:
                System.out.println("Have Not DaTa");
        }
    }
}
