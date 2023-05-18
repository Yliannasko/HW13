package org.example.planner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
//    @Test
//    public void shouldSearchEpic (){
//        String[] subtasks = { "Молоко", "Яйца", "Хлеб" };
//        Epic epic = new Epic(55, subtasks);
//
//        boolean expected = true;
//        boolean actual = epic.matches("Хлеб");
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldSearchMeeting (){
//        Meeting meeting = new Meeting(
//                555,
//                "Выкатка 3й версии приложения",
//                "Приложение НетоБанка",
//                "Во вторник после обеда");
//        boolean expected = true;
//        boolean actual = meeting.matches("версии");
//        Assertions.assertEquals(expected, actual);
//    }
//    @Test
//    public void shouldSearchMeeting2 (){
//        Meeting meeting = new Meeting(
//                555,
//                "Выкатка 3й версии приложения",
//                "Приложение НетоБанка",
//                "Во вторник после обеда");
//        boolean expected = true;
//        boolean actual = meeting.matches("Приложение");
//        Assertions.assertEquals(expected, actual);
//    }