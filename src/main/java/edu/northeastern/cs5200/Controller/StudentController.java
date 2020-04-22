package edu.northeastern.cs5200.Controller;

import edu.northeastern.cs5200.DAO.WhiteBoard_Dao;
import edu.northeastern.cs5200.Tables.Faculty;
import edu.northeastern.cs5200.Tables.Student;
import edu.northeastern.cs5200.Tables.Enroll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    WhiteBoard_Dao wd;

    @GetMapping("/findEnrollByStudent/{id}")
    public List<Enroll> findEnrollByStudent(
            @PathVariable("id") Integer id
    ) {
        Student student = wd.findstudentByid(id);
        return wd.findEnrollByStudent(student);
    }

    @GetMapping("/updateStudent/{id}/{uname}/{pw}/{fname}/{lname}/{status}/{fa}/{ws}/{gpa}/{s}")
    public void updateStudent(
            @PathVariable("id") Integer id,
            @PathVariable("uname") String uname,
            @PathVariable("pw") String pw,
            @PathVariable("fname") String fname,
            @PathVariable("lname") String lname,
            @PathVariable("status") Integer status,
            @PathVariable("fa") String fa,
            @PathVariable("ws") String ws,
            @PathVariable("gpa") double gpa,
            @PathVariable("s") double s
    ) throws SQLException {
        Student student = wd.findstudentByid(id);
        if (!lname.equals("-1")) {
            student.setLastName(lname);
        }
        if (!fname.equals("-1")) {
            student.setFirstName(fname);
        }
        if (!uname.equals("-1")) {
            student.setUsername(uname);
        }
        if (!pw.equals("-1")) {
            student.setPassword(pw);
        }
        if (status!=-1) {
            student.setStatus(status);
        }
        if (!fa.equals("-1")) {

            student.setFinacialAid(Boolean.parseBoolean(fa));
        }
        if (!ws.equals("-1")) {

            student.setWorkStudy(Boolean.parseBoolean(ws));
        }
        if (gpa!=-1) {
            student.setGpa(gpa);
        }
        if (s!=-1) {
            student.setScholarship(s);
        }

//        f1.setParking("qewerrrrrrr");
        //f1.setTenureStatus(true);
        wd.UpdateStudent(student);
    }

    @GetMapping("/student/{id}/{uname}/{pw}/{fname}/{lname}/{status}/{fa}/{ws}/{gpa}/{s}")
    public Student createStudent(
            @PathVariable("id") Integer id,
            @PathVariable("uname") String uname,
            @PathVariable("pw") String pw,
            @PathVariable("fname") String fname,
            @PathVariable("lname") String lname,
            @PathVariable("status") Integer status,
            @PathVariable("fa") boolean fa,
            @PathVariable("ws") boolean ws,
            @PathVariable("gpa") double gpa,
            @PathVariable("s") double s
    ) throws SQLException {
        Student student = new Student();
        student.setId(id);
        student.setUsername(uname);
        student.setPassword(pw);
        student.setFirstName(fname);
        student.setLastName(lname);
        student.setStatus(status); //1 means he is a TA
        student.setFinacialAid(fa); //don't have aid
        student.setWorkStudy(ws); //working
        student.setGpa(gpa);
        student.setScholarship(s);
        return wd.createStudent(student);
    }

    @GetMapping("/findAllStudent")
    public List<Student> findAllStudent() {
        return wd.findAllStudents();
    }

    @GetMapping("/findStudentById/{id}")
    public Student findStudentById(
            @PathVariable("id") Integer id
    ) {
        return wd.findstudentByid(id);
    }

    @GetMapping("/deleteStudent/{id}")
    public void deleteStudent(
            @PathVariable("id") Integer id
    ) throws SQLException {
        wd.deleteAStudent(id);
    }
    
    @GetMapping("/enrollStudentInSection/{sid}/{secTitle}")
    public Boolean setStudentEnrollment(
            @PathVariable("sid") Integer sid,
            @PathVariable("secTitle") String secTitle
    ) throws SQLException {
        return wd.enrollStudentInSection(new Enroll(), sid, secTitle);
    }

    @GetMapping("/getAllEnrollment")
    public List<Enroll> getAllEnrollment() {
        return wd.findAllEnroll();
    }
}
