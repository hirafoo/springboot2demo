package net.hirafoo.todo.common.service;

public class SampleJavaService {
    public static void main(String[] args) {
        hoge();
    }
    public static void hoge() {
        String hoge = "one.two.".replaceAll(".", "*");
        System.out.println(hoge);
    }
}
