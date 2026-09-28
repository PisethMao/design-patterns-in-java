package com.piseth.patterns.behavioral.memento.texteditorexample.editor;

import com.piseth.patterns.behavioral.memento.texteditorexample.memento.EditorMemento;

public class TextEditor {
    String content = "";

    public void write(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public EditorMemento save() {
        return new EditorMemento(content);
    }

    public void restore(EditorMemento memento) {
        this.content = memento.content();
    }
}
