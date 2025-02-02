package com.sau.workshop;

import java.util.Scanner;
//ป้อนตัวเลข 2 จำนวนทางหน้าจอแล้วแสดงผลรวมทางหน้าจอ
//หากผลรวมไม่เกิน 500 ให้วนป้อนตัวเลขทางแป้นพิม แล้วแสดงผลทางหน้าจอไปเรื่อยๆ

public class WorkshopCF02 {

    public static void main(String[] args) {

        int n1, n2, sum;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Input 1st Number : ");
            n1 = sc.nextInt();
            System.out.println("Input 2nd Number : ");
            n2 = sc.nextInt();
            sum = n1 + n2;
            System.out.println(n1 + "+" + n2 + " = " + sum);
            System.out.println("----------------------------------------");
        } while (sum < 501);

    }
}

