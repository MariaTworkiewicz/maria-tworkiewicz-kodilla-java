package com.kodilla.patterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeworkMakerQueueTestSuite {
    @Test
    public void testUpdate(){
        //Given
        HomeworkMakerQueue arturOlszewskiHomeworkQueue = new HomeworkMakerQueue("Artur Olszewski");
        HomeworkMakerQueue annaBanasiakHomeworkQueue = new HomeworkMakerQueue("Hanna Banasiak");
        HomeworkMakerQueue karolinaStankiewiczQueue = new HomeworkMakerQueue("Karolina Stankiewicz");
        Mentor januszSzustakMentor = new Mentor("Janusz Szustak");
        Mentor arturJesiolkiewiczMentor = new Mentor("Artur Jesiolkiewicz");
        arturOlszewskiHomeworkQueue.registerObserver(januszSzustakMentor);
        annaBanasiakHomeworkQueue.registerObserver(januszSzustakMentor);
        annaBanasiakHomeworkQueue.registerObserver(arturJesiolkiewiczMentor);
        karolinaStankiewiczQueue.registerObserver(januszSzustakMentor);
        karolinaStankiewiczQueue.registerObserver(arturJesiolkiewiczMentor);
        //When
        arturOlszewskiHomeworkQueue.addHomework("Artur - Resolution for chapter 11");
        annaBanasiakHomeworkQueue.addHomework("Anna - Resolution for chapter 12");
        karolinaStankiewiczQueue.addHomework("Karolina - Resolution for chapter 13");
        //Then
        assertEquals(2, arturJesiolkiewiczMentor.getUpdateCount());
        assertEquals(3, januszSzustakMentor.getUpdateCount());
    }
}
