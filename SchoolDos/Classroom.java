package SchoolDos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Classroom {
    private int room;
    private Map<Integer, Student> students;// = new List<Student>();

    public Classroom(int room)
    {
        this.room = room;
        students = new HashMap<Integer, Student>();
        //STILL want to know if I should initialize it on the top as   Map<Integer, Student> students = new HashMap<yadda>(); or do it this way
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public Map<Integer, Student> getStudents() {
        return students;
    }

    public void setStudents(Map<Integer, Student> students) {
        this.students = students;
    }

    public void addStudent(Student s)
    {
        //Should I use an getter to get the variable or just modify it?
        //Why is this way bad?
        students.put(s.getId(), s);
    }

    public boolean removeStudent(Student s)
    {
        //was using students.length; zzzzzzz
       if(students.containsKey(s.getId()))
       {
           students.remove(s.getId());
           return true;
       }
       else
       {
           return false;
       }
    }




}
