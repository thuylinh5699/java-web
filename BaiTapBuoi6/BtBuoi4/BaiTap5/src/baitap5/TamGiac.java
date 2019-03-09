/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap5;

/**
 *
 * @author ThuyLinh
 */
public class TamGiac {

    private float a;
    private float b;
    private float c;

    public TamGiac() {
    }

    public TamGiac(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public void kieuTamGiac() {
        if (a == b) {
            if (b == c) {
                System.out.println("Tam giac deu");
            } else if (c * c == a * a + b * b) {
                System.out.println("Tam giac vuong can");
            } else {
                System.out.println("Tam giac can");
            }
        } else if ((c * c == a * a + b * b) || (b * b == a * a + c * c) || (a * a == b * b + c * c)) {
            System.out.println("Tam giac vuong");
        } else {
            System.out.println("Tam giac thuong");
        }
    }

    public float chuVi(float a, float b, float c) {
        float chuvi = 0;
        chuvi = a + b + c;
        return chuvi;
    }

    public float dienTich(float a, float b, float c) {
        float dienTich = 0;
        float p = (a + b + c) / 2;
        dienTich = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return dienTich;
    }

    public void showInfo() {

        System.out.println("Do dai canh a: " + a);
        System.out.println("Do dai canh b: " + b);
        System.out.println("Do dai canh c: " + c);
        float chuvi = chuVi(a, b, c);
        System.out.println("Chu vi = " + chuvi);
        float dientich = dienTich(a, b, c);
        System.out.println("Dien tich = " + dientich);

    }
}
