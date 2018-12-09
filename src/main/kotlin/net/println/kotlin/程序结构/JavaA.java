package net.println.kotlin.程序结构;

public class JavaA {
    private int b = 0;

    public int getB() {
        System.out.println("some one tries to get b");
        return b;
    }

    public void setB(int b) {
        System.out.println("some one tries to set b");
        this.b = b;
    }
}
