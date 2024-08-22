package ku.cs.models;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student s1;

    @BeforeEach
    void init()
    {
        s1 = new Student("6610450404",  "Yok");
    }

    @Test
    void testAddScore()
    {
        s1 = new Student("6610450404",  "Yok");
        s1.addScore(10.5);
        assertEquals(10.5, s1.getScore());
    }

    @Test
    void testCalculateGrade()
    {
        s1 = new Student("6610450404", "Yok", 50);
        s1.addScore(20);
        assertEquals("B", s1.grade());
    }

    @Test
    void testChangeName()
    {
        s1 = new Student("6610450404", "Yok");
        s1.changeName("YOK");
        assertEquals("YOK", s1.getName());
    }

    @Test
    void testisId()
    {
        s1 = new Student("6610450404", "Yok");
        s1.isId("6610450404");
        assertEquals("6610450404", s1.getId());
    }
}