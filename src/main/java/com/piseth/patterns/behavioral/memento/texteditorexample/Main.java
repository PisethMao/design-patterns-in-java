package com.piseth.patterns.behavioral.memento.texteditorexample;

import com.piseth.patterns.behavioral.memento.texteditorexample.editor.TextEditor;
import com.piseth.patterns.behavioral.memento.texteditorexample.history.EditorHistory;

public class Main {
    public static void main() {
        TextEditor textEditor = new TextEditor();
        EditorHistory editorHistory = new EditorHistory();

        textEditor.write("Hello");
        editorHistory.save(textEditor.save());

        textEditor.write("Hello Piseth");
        editorHistory.save(textEditor.save());

        textEditor.write("Hello Piseth, Welcome to Java!!!");

        IO.println(textEditor.getContent());
        textEditor.restore(editorHistory.undo());
        IO.println(textEditor.getContent());
        textEditor.restore(editorHistory.undo());
        IO.println(textEditor.getContent());
    }
}
