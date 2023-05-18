package org.example.planner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TaskTest {
    @Test
    public void shouldTrueAndFalseSimpleTask() {
        SimpleTask simpleTask = new SimpleTask(
                5, "Позвонить родителям");
        Assertions.assertTrue(simpleTask.matches("Позвонить"));
        Assertions.assertFalse(simpleTask.matches("купить"));
    }

    @Test
    public void shouldTrueAndFalseEpic() {
        String[] subtasks = {"Молоко", "Яйца", "Хлеб"};
        Epic epic = new Epic(55, subtasks);
        Assertions.assertTrue(epic.matches("Яйца"));
        Assertions.assertFalse(epic.matches("вода"));
    }

    @Test
    public void shouldTrueAndFalseMeeting() {
        Meeting meeting = new Meeting(
                555,
                "Выкатка 3й версии приложения",
                "Приложение НетоБанка",
                "Во вторник после обеда");
        Assertions.assertTrue(meeting.matches("приложения"));
        Assertions.assertFalse(meeting.matches("устранение"));
    }
}
