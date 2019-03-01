/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_2;

/**
 *
 * @author ThuyLinh
 */
public class NhapMang {

    private int[] value;

    public NhapMang() {
        this.value = new int[5];
    }

    public NhapMang(int[] value) {
        this.value = value;
    }

    public int[] getValue() {
        return value;
    }

    public void setValue(int[] value) {
        this.value = value;
    }

    public void timViTriLN(int[] value) {
        int max = 0;
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                max = this.value[i];
            } else if (this.value[i] > max) {
                max = this.value[i];
            }
        }
        System.out.println("Giá trị lớn nhất của mảng là: " + max);
    }

    public void timViTriNN(int[] value) {
        int min = 0;
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                min = this.value[i];
            } else if (this.value[i] < min) {
                min = this.value[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất của mảng là: " + min);
    }

    public void chiaHetCho3() {
        for (int i = 0; i < 5; i++) {
            if (this.value[i] % 3 == 0) {
                System.out.println("Phần tử chia hết cho 3 là: " + this.value[i]);
            }
        }
    }
}
