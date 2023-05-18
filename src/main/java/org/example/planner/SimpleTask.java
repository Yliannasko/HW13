package org.example.planner;

import java.util.Objects;

public class SimpleTask extends Task {
    private String title;

    public SimpleTask(int id, String title) { //реализация наследника
        super(id);//вызов родительского конструктора
        this.title = title;//заполнение своего поля
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean matches(String query) {
        if (title.contains(query)) {
            return true;
        }
        return false;
    }
}