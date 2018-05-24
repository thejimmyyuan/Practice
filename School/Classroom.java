package School;

import java.util.ArrayList;

public class Classroom {
    private int room;
    private ArrayList<Student> students;// = new ArrayList<Student>();

    public Classroom(int room)
    {
        this.room = room;
        students = new ArrayList<Student>(); //I think I wrote this RIP
        //dunno if this is better ArrayList<Student> students = new ArrayList<Student>();
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Student s)
    {
        //Should I use an getter to get the variable or just modify it?

        students.add(s);
    }

    public void removeStudent(Student s)
    {
        //was using students.length; zzzzzzz
        for(int i = 0; i < students.size(); i++)
        {
            //I was using students[i] im pretty sure. shit lol
            if(s.getName().equals(students.get(i).getName()))
            {
                students.remove(i);
            }
        }
    }




}
