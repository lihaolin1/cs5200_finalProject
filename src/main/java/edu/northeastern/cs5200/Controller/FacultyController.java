package edu.northeastern.cs5200.Controller;


import edu.northeastern.cs5200.DAO.WhiteBoard_Dao;
import edu.northeastern.cs5200.Tables.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class FacultyController {
    @Autowired
    WhiteBoard_Dao wd;

    @GetMapping("/test")
    public String showString() {
        return "im a test";
    }

    @GetMapping("/addAddress/{address}/{id}")
    public Address addAddress(
            @PathVariable("address") String address,
            @PathVariable("id") Integer id
    ) throws SQLException {
        Address a = new Address();
        a.setAddress(address);

        return wd.creatAddress(a, id);
    }

    @GetMapping("/createCourse/{cname}/{cdes}/{department}")
    public void createCourse(
            @PathVariable("cname") String cname,
            @PathVariable("cdes") String cdes,
            @PathVariable("department") String department
    ) throws SQLException {
        Course course = new Course();
        course.setDepartment(wd.finddepartmentByname(department));
        course.setDescription(cdes);
        course.setName(cname);
        wd.createCourse(course);
    }

    @GetMapping("/findstudents_forinstructor/{faculty_id}")
    public List<PersonProfile>  findstudentsforinstructor(
            @PathVariable("faculty_id") Integer fac_id)  throws SQLException {
        Faculty f1 = wd.findfacultyByid(fac_id);
        List<Section> sections = new ArrayList<>();
        List<PersonProfile> students = new ArrayList<>();
        List<EmploymentRecord> er = wd.findallemploy();
        int i;
        for(i = 0; i < er.size(); i++) {
            if(er.get(i).getPersonProfile() == f1 && er.get(i).getType().equals("instructor")) {
                sections.add(er.get(i).getSection());
            }
        }
        int j;
        for(j = 0; j < er.size(); j++) {
            for (i = 0; i < sections.size(); i++) {
                if (er.get(j).getSection() == sections.get(i) && !er.get(j).getType().equals("instructor")) {
                    students.add(er.get(j).getPersonProfile());
                }
            }
        }

        return students;
    }

    @GetMapping("/updateFaculty/{id}/{lname}/{fname}/{uname}/{pw}/{b}/{ts}/{park}/{bank}")
    public void updateFaculty(
            @PathVariable("id") Integer id,
            @PathVariable("lname") String lname,
            @PathVariable("fname") String fname,
            @PathVariable("uname") String uname,
            @PathVariable("b") String b,
            @PathVariable("ts") String ts,
            @PathVariable("pw") String pw,
            @PathVariable("park") String park,
            @PathVariable("bank") String bank
    ) throws SQLException {
        Faculty f1 = wd.findfacultyByid(id);
        if (!lname.equals("-1")) {
            f1.setLastName(lname);
        }
        if (!fname.equals("-1")) {
            f1.setFirstName(fname);
        }
        if (!uname.equals("-1")) {
            f1.setUsername(uname);
        }
        if (!pw.equals("-1")) {
            f1.setPassword(pw);
        }
        if (!b.equals("-1")) {
            f1.setBenefits(b);
        }
        if (!ts.equals("-1")) {

            f1.setTenureStatus(Boolean.parseBoolean(ts));
        }
        if (!park.equals("-1")) {
            f1.setParking(park);
        }
        if (!bank.equals("-1")) {
            f1.setBankAccount(bank);
        }

//        f1.setParking("qewerrrrrrr");
        //f1.setTenureStatus(true);
        wd.UpdateFaculty(f1);

    }

    @GetMapping("/deleteFaculty/{id}")
    public void deleteFaculty(
            @PathVariable("id") Integer id
    ) throws SQLException {
        wd.deleteAFaculty(id);
    }

    @GetMapping("/findAllFaculty")
    public List<Faculty> findAllFaculty() {
        return wd.findAllFaculty();
    }

    @GetMapping("/findFacultyById/{id}")
    public Faculty findFacultyById(
            @PathVariable("id") Integer id
    ){
        return wd.findfacultyByid(id);
    }

    ///{uanme}/{pw}/{fname}/{lname}
    @GetMapping("/faculty/{uname}/{id}/{pw}/{fname}/{lname}/{b}/{ts}/{park}/{bank}")
    public Faculty addFaculty(
            @PathVariable("id") Integer id,
            @PathVariable("uname") String uname,
            @PathVariable("pw") String pw,
            @PathVariable("fname") String fname,
            @PathVariable("lname") String lname,
            @PathVariable("b") String b,
            @PathVariable("ts") Boolean ts,
            @PathVariable("park") String park,
            @PathVariable("bank") String bank
    ) throws SQLException {
        Faculty f = new Faculty();

        f.setId(id);
        f.setUsername(uname);
        f.setPassword(pw);
        f.setFirstName(fname);
        f.setLastName(lname);
        f.setBenefits(b);
        f.setTenureStatus(ts);
        f.setParking(park);
        f.setBankAccount(bank);
        return wd.createFaculty(f);
    }


}
