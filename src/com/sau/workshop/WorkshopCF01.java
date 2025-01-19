package com.sau.workshop;

import java.util.Scanner;

public class WorkshopCF01 {
    //สร้างเมนูให้ผู้ใช้เลือก 1,2,3 หากไม่ใช่ให้แสดงขอบคุณและจบโปรแกรม
    //1 คำนวณพื้นที่สี่เหลี่ยม ป้อนกว้าง ยาว คำนวณ แสดงผล (w*d)
    //2 คำนวณพื้นที่สามเหลี่ยม ป้อนฐาน สูง คำนวณ แสดงผล (b*h/2)
    //3 คำนวณพื้นที่วงกลม ป้อนรัศมี  คำนวณ แสดงผล (Pi * r^2)
    
    public static void main(String[] args) {
        int menu;
        double w, l, b, h, r, areaSquare, areaTriangle, areaCircle;
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("+++++++++++++++");
        System.out.println("   Shape Area Program   ");
        System.out.println("+++++++++++++++");
        System.out.println("1.SquareArea");
        System.out.println("2.TriangleArea");
        System.out.println("3.CircleArea");
        System.out.println("+++++++++++++++");
        System.out.println("Select menu : ");
        menu = sc.nextInt();
        System.out.println("+++++++++++++++");
        
         if (menu == 1) {
            System.out.println("+++SquareArea+++");
            System.out.println("Input Width : ");
            w = sc.nextDouble();
            System.out.println("Input Long : ");
            l = sc.nextDouble();
            areaSquare = w * l;
            System.out.println("Area Square is : " + areaSquare);
        } else if (menu == 2) {
            System.out.println("+++TriangleArea+++");
            System.out.println("Input Base : ");
            b = sc.nextDouble();
            System.out.println("Input high : ");
            h = sc.nextDouble();
            areaTriangle = b * h/2;
            System.out.println("Area triangle is : " + areaTriangle);
        } else if (menu == 3) {
            System.out.println("+++CircleArea+++");
            
            System.out.println("Input Radian : ");
            r = sc.nextDouble();
            areaCircle = Math.PI * Math.pow(r, 2);
            System.out.println("Area Circle is : " + areaCircle);
        } else {
            System.out.println("Thank You See You Next Time");
        }
        System.out.println("+++++++++++++");
        
    }
}
