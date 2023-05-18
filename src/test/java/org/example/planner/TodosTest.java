package org.example.planner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TodosTest {

    SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям из приложения");
    Epic epic = new Epic(55, new String[]{"молоко, яйца, хлеб"});
    Meeting meeting = new Meeting(555, "Выкатка 3й версии приложения",
            "Приложение НетоБанка", "Во вторник после обеда");
    Todos todos = new Todos();

    @BeforeEach
    public void setup() {

        todos.add(simpleTask);
        todos.add(epic);
        todos.add(meeting);
    }

    @Test
    public void shouldAddThreeTasksOfDifferentType() {
        Task[] expected = {simpleTask, epic, meeting};
        Task[] actual = todos.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchSimpleTask() {
        Task[] expected = {simpleTask};
        Task[] actual = todos.search("Позвонить");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchEpic() {
        Task[] expected = {epic};
        Task[] actual = todos.search("хлеб");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchMeeting() {
        Task[] expected = {meeting};
        Task[] actual = todos.search("НетоБанка");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchMeeting2() {
        Task[] expected = {meeting};
        Task[] actual = todos.search("Выкатка");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchQuery2Task() {
        Task[] expected = {simpleTask, meeting};
        Task[] actual = todos.search("приложения");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchQuery() {
        Task[] expected = {};
        Task[] actual = todos.search("после");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchQuery0Task() {
        Task[] expected = {};
        Task[] actual = todos.search("обеда");
        Assertions.assertArrayEquals(expected, actual);
    }
}
