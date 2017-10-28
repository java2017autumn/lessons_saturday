package com.javaguru.lesson5;

public class PencilMain {

    public static void main(String[] args) {
        Handlebar handlebar = new Handlebar();
        handlebar.setColor("Black");
        handlebar.setPointerRadius(1);
        handlebar.setCapacity(100);

        Pencil pencil = new Pencil(handlebar);
        System.out.println(pencil.getHandleBarColor());

        System.out.println(pencil.toString());

        pencil.write();

        System.out.println(pencil.toString());
    }
}
