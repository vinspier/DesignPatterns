package com.fxb.patterns.visitor;


import com.fxb.patterns.visitor.example.Directory;
import com.fxb.patterns.visitor.example.File;
import com.fxb.patterns.visitor.example.ListVisitor;

public class TestVisitor {
    public static void main(String[] args) {
        System.out.println("Making root entries first....");
        Directory rootDir = new Directory("root");
        Directory binDir = new Directory("bin");
        Directory tmpDir = new Directory("tmp");
        Directory usrDir = new Directory("usr");

        rootDir.add(binDir);
        rootDir.add(tmpDir);
        rootDir.add(usrDir);
        binDir.add(new File("vi",1000));
        binDir.add(new File("latex",3000));
        rootDir.accept(new ListVisitor());

        System.out.println("- - - - - - - - - - - - - - - - - - - - ");
        System.out.println("Making user entries second...");
        Directory yuki = new Directory("yuki");
        Directory hanako = new Directory("hanako");
        Directory tomura = new Directory("tomura");
        usrDir.add(yuki);
        usrDir.add(hanako);
        usrDir.add(tomura);
        yuki.add(new File("diary.html",100));
        yuki.add(new File("name.txt",200));
        hanako.add(new File("sdfg.jpg",58));
        hanako.add(new File("direction.doc",504));
        tomura.add(new File("sfdg.mail",567));
        rootDir.accept(new ListVisitor());
        System.out.println("- - - - - - - - - - - - - - - - - - - - ");
        System.out.println(tomura.getFullName());
    }
}
