package com.piseth.patterns.behavioral.memento.texteditorexample.history;

import com.piseth.patterns.behavioral.memento.texteditorexample.memento.EditorMemento;

import java.util.ArrayDeque;
import java.util.Deque;

public class EditorHistory {
    private final Deque<EditorMemento> history = new ArrayDeque<>();

    public void save(EditorMemento editorMemento){
        history.push(editorMemento);
    }

    public EditorMemento undo(){
        if(history.isEmpty()){
            throw new IllegalStateException("No previous state is available.");
        }
        return history.pop();
    }
}
