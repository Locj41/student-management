package model;

import java.util.ArrayList;

public class StudentManegement {
    private ArrayList<Student> dsSinhVien;

    public ArrayList<Student> getDsSinhVien() {
        return dsSinhVien;
    }

    public void setDsSinhVien(ArrayList<Student> dsSinhVien) {
        this.dsSinhVien = dsSinhVien;
    }

    public StudentManegement() {
    }

    public StudentManegement(ArrayList<Student> dsSinhVien) {
        this.dsSinhVien = dsSinhVien;
    }
    
    public void insert(Student st) {
        dsSinhVien.add(st);
    }


    public int searchStudentById(Student searchStudent){
        for(int i = 0; i < dsSinhVien.size() - 1; i++){
            if(dsSinhVien.get(i) == searchStudent) 
                return i;
        }
        return -1;
    }

    public void delete(Student deletedStudent) throws Exception{
        int index = searchStudentById(deletedStudent);
        if(index != -1)
            dsSinhVien.remove(index);
        else
            throw new Exception("Student with id " + deletedStudent.getMaThiSinh() + "does not exist"); 
    }

    public void update(Student updaStudent) {
        int index = searchStudentById(updaStudent);
        if(index != -1){            
            dsSinhVien.remove(index);
            dsSinhVien.add(updaStudent);
        }
        else {
            dsSinhVien.add(updaStudent);
        }
    }

}
