package com.piseth.patterns.structural.composite.filesystemexample;

public class Main {
    static void main() {
        File readme = new File("README.md", 10L);
        File resume = new File("resume.pdf", 200L);
        File notes = new File("notes.txt", 50L);
        File mainJava = new File("Main.java", 30L);
        File pom = new File("pom.xml", 15L);

        Folder root = new Folder("root");
        Folder documents = new Folder("documents");
        Folder projects = new Folder("projects");
        Folder javaProject = new Folder("java");

        documents.addChild(resume);
        documents.addChild(notes);

        javaProject.addChild(mainJava);
        javaProject.addChild(pom);

        projects.addChild(javaProject);

        root.addChild(readme);
        root.addChild(documents);
        root.addChild(projects);

        root.show();
        IO.println("Total Size: " + root.getSize());
    }
}
