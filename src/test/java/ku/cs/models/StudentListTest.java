package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {
    StudentList studentList = new StudentList();

    @Test
    void testAddNewStudent()
    {
        studentList.addNewStudent("6610000000", "a");
        studentList.addNewStudent("6610000001", "b", 10);
    }

    @Test
    void  testFindStudentById()
    {
        Student s = studentList.findStudentById("6610000000");
    }

    @Test
    void testGiveScoreToId()
    {
        studentList.giveScoreToId("6610000001", 10);
    }

    @Test
    void testViewGradeOfId()
    {
        studentList.viewGradeOfId("6610000001");
    }
}