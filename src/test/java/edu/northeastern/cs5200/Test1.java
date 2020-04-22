package edu.northeastern.cs5200;

import java.sql.SQLException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import edu.northeastern.cs5200.DAO.WhiteBoard_Dao;
import edu.northeastern.cs5200.Repository.EnrollRoleRepository;
import edu.northeastern.cs5200.Tables.Address;
import edu.northeastern.cs5200.Tables.Course;
import edu.northeastern.cs5200.Tables.Department;
import edu.northeastern.cs5200.Tables.Email;
import edu.northeastern.cs5200.Tables.EmploymentRecord;
import edu.northeastern.cs5200.Tables.Enroll;
import edu.northeastern.cs5200.Tables.EnrollRole;
import edu.northeastern.cs5200.Tables.EssayQuestion;
import edu.northeastern.cs5200.Tables.Evaluation;
import edu.northeastern.cs5200.Tables.Exam;
import edu.northeastern.cs5200.Tables.Faculty;
import edu.northeastern.cs5200.Tables.FillInTheBlank;
import edu.northeastern.cs5200.Tables.MultipleChoiceQuestion;
import edu.northeastern.cs5200.Tables.PersonProfile;
import edu.northeastern.cs5200.Tables.Phones;
import edu.northeastern.cs5200.Tables.RawHtml;
import edu.northeastern.cs5200.Tables.RegistraRecord;
import edu.northeastern.cs5200.Tables.Section;
import edu.northeastern.cs5200.Tables.Semester;
import edu.northeastern.cs5200.Tables.Semester_assignment;
import edu.northeastern.cs5200.Tables.SimpleEssayAssignment;
import edu.northeastern.cs5200.Tables.Slide;
import edu.northeastern.cs5200.Tables.Student;
import edu.northeastern.cs5200.Tables.SubmissionAssignment;
import edu.northeastern.cs5200.Tables.Widget;
import edu.northeastern.cs5200.Tables.YoutubeVideo;
import edu.northeastern.cs5200.Tables.textDocument;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test1 {
	@Autowired 
	WhiteBoard_Dao wd;
	@Test//Before
	public void testcreate() {
		try {
			// create person
			Student s1 = new Student();
			Student s2 = new Student();
			Faculty f1 = new Faculty();
			Faculty f2 = new Faculty();
			//s1
			s1.setId(123);
			s1.setUsername("alice");
			s1.setPassword("alice");
			s1.setFirstName("aa");
			s1.setLastName("Alice");
			s1.setStatus(0); //0 means normal student
			s1.setFinacialAid(false); //don't have aid
			s1.setWorkStudy(false); //not work
			s1.setGpa(100.00);
			s1.setScholarship(0.00);
			wd.createStudent(s1);


			Phones phone1 = new Phones();
			Address address1 = new Address();
			Email email1 = new Email();
			phone1.setPhone("123-456");
			address1.setAddress("abc,123");
			email1.setEmail("alice@husky.edu");
			wd.creatPhones(phone1, 123);
			wd.creatAddress(address1, 123);
			wd.creatEmail(email1, 123);
			//s2
			s2.setId(234);
			s2.setUsername("bob");
			s2.setPassword("bob");
			s2.setFirstName("bb");
			s2.setLastName("Bob");
			s2.setStatus(1); //1 means he is a TA
			s2.setFinacialAid(false); //don't have aid
			s2.setWorkStudy(true); //working
			s2.setGpa(100.00);
			s2.setScholarship(1000.00);
			wd.createStudent(s2);
			Phones phone2 = new Phones();
			Address address2 = new Address();
			Email email2 = new Email();
			phone2.setPhone("234-567");
			address2.setAddress("abc,234");
			email2.setEmail("bob@husky.edu");
			wd.creatPhones(phone2, 234);
			wd.creatAddress(address2, 234);
			wd.creatEmail(email2, 234);
			//f1
			f1.setId(345);
			f1.setUsername("jose");
			f1.setPassword("jose");
			f1.setFirstName("jj");
			f1.setLastName("Jose");
			f1.setBenefits("benfits1");
			f1.setTenureStatus(true);
			f1.setParking("F1-A1");
			f1.setBankAccount("12345678");
			wd.createFaculty(f1);
			Phones phone3 = new Phones();
			Address address3 = new Address();
			Email email3 = new Email();
			phone3.setPhone("345-567");
			address3.setAddress("abc,345");
			email3.setEmail("jose@husky.edu");
			wd.creatPhones(phone3, 345);
			wd.creatAddress(address3, 345);
			wd.creatEmail(email3, 345);
			//f2
			f2.setId(456);
			f2.setUsername("camp");
			f2.setPassword("camp");
			f2.setFirstName("ff");
			f2.setLastName("Camp");
			f2.setBenefits("benfits1");
			f2.setTenureStatus(true);
			f2.setParking("F1-A2");
			f2.setBankAccount("23456789");
			wd.createFaculty(f2);
			Phones phone4 = new Phones();
			Address address4 = new Address();
			Email email4 = new Email();
			phone4.setPhone("456-567");
			address4.setAddress("abc,456");
			email4.setEmail("camp@husky.edu");
			wd.creatPhones(phone4, 456);
			wd.creatAddress(address4, 456);
			wd.creatEmail(email4, 456);

			//create department
			Department d1 = new Department();
			Department d2 = new Department();
			d1.setName("Electronic Engineering");
			d1.setLocation("Snell Engineering-101");
			d2.setName("Computer Science");
			d2.setLocation("Cory 212");
			wd.createDepartment(d1);
			wd.createDepartment(d2);

			//create section
			Section sec1 = new Section();
			Section sec2 = new Section();
			sec1.setTitle("Database management jose");
			sec1.setSeatCapacity(50);
			sec1.setFaculty("Jose");
			sec2.setTitle("Computer Vision camp");
			sec2.setSeatCapacity(50);
			sec2.setFaculty("Camp");
			wd.createSection(sec1);
			wd.createSection(sec2);

			//create Course
			Course cou1 = new Course();
			Course cou2 = new Course();
			cou1.setName("Database management");
			cou1.setDescription("Introduce database");
			cou1.setDepartment(wd.finddepartmentByname("Computer Science"));
			//cou1.setCalendar(2020110); find a way to insert date
			cou2.setName("Computer Vision");
			cou2.setDescription("Introduce traditional computer vision");
			cou2.setDepartment(wd.finddepartmentByname("Electronic Engineering"));
			//cou2.setCalendar(2020.1.12);
			wd.createCourse(cou1);
			wd.createCourse(cou2);
			//create semester
			Semester sem1 = new Semester();
			Semester sem2 = new Semester();
			sem1.setSemester("Fall 2019");
			sem2.setSemester("Spring 2020");
			wd.createSemester(sem1);
			wd.createSemester(sem2);

			//create Learning module
			//create Exam
			Exam ex1 = new Exam();
			Exam ex2 = new Exam();
			EssayQuestion es1 = new EssayQuestion();
			EssayQuestion es2 = new EssayQuestion();
			MultipleChoiceQuestion mc1 = new MultipleChoiceQuestion();
			MultipleChoiceQuestion mc2 = new MultipleChoiceQuestion();
			FillInTheBlank fi1 = new FillInTheBlank();
			FillInTheBlank fi2 = new FillInTheBlank();
			ex1.setExam_name("database exam1");
			ex1.setRubric("de");
			ex2.setExam_name("computervision_exam1");
			ex2.setRubric("ce");
			wd.createExam(ex1,"Database management");
			wd.createExam(ex2,"Computer Vision");

			es1.setEassayQuestion("Essay1");
			es2.setEassayQuestion("Essay2");
			wd.createEassyQuestion(es1, "database exam1");
			wd.createEassyQuestion(es2, "computervision_exam1");
			mc1.setMultipleChoiceQuestion("multiple1");
			mc2.setMultipleChoiceQuestion("multiple2");
			wd.createmultiplechoicequestion(mc1, "database exam1");
			wd.createmultiplechoicequestion(mc2, "computervision_exam1");
			fi1.setFillInTheBlank("fill1");
			fi2.setFillInTheBlank("fill2");
			wd.createfillintheblank(fi1, "database exam1");
			wd.createfillintheblank(fi2, "computervision_exam1");

			//create Evaluation
			Evaluation ev1 = new Evaluation();
			Evaluation ev2 = new Evaluation();
			SimpleEssayAssignment sea1 = new SimpleEssayAssignment();
			SimpleEssayAssignment sea2 = new SimpleEssayAssignment();
			SubmissionAssignment sba1 = new SubmissionAssignment();
			SubmissionAssignment sba2 = new SubmissionAssignment();
			ev1.setRubric("ev1");
			ev1.setEvaluation_name("evaluation1");
			ev2.setRubric("ev2");
			ev2.setEvaluation_name("evaluation2");
			wd.createEvaluation(ev1, "Database management");
			wd.createEvaluation(ev2, "Computer Vision");
			sea1.setSimpleEssayAssignment("simpleEssayAssignment1");
			sea2.setSimpleEssayAssignment("simpleEssayAssignment2");
			wd.createsimpleessayassignment(sea1, "evaluation1");
			wd.createsimpleessayassignment(sea2, "evaluation2");
			sba1.setSubmissionAssignment("submissionAssignment1");
			sba2.setSubmissionAssignment("submissionAssignment2");
			wd.createsubmissionassignment(sba1, "evaluation1");
			wd.createsubmissionassignment(sba2, "evaluation2");
			//create widget
			Widget w1 = new Widget();
			Widget w2 = new Widget();
			YoutubeVideo y1 = new YoutubeVideo();
			YoutubeVideo y2 = new YoutubeVideo();
			Slide sli1 = new Slide();
			Slide sli2 = new Slide();
			textDocument text1 = new textDocument();
			textDocument text2 = new textDocument();
			RawHtml rh1 = new RawHtml();
			RawHtml rh2 = new RawHtml();
			w1.setRubric("w1");
			w1.setWidget_name("widget1");
			w2.setRubric("w2");
			w2.setWidget_name("widget2");
			wd.createWidget(w1, "Database management");
			wd.createWidget(w2, "Computer Vision");
			y1.setYoutubeVideo("http1");
			y2.setYoutubeVideo("http2");
			wd.createyoutube(y1, "widget1");
			wd.createyoutube(y2, "widget2");
			sli1.setSlide("slide1");
			sli2.setSlide("slide2");
			wd.createslide(sli1, "widget1");
			wd.createslide(sli2, "widget2");
			text1.setTextDocument("textDocument1");
			text2.setTextDocument("textDocument2");
			wd.createtextdocument(text1, "widget1");
			wd.createtextdocument(text2, "widget2");
			rh1.setRawHtml("rawHtml1");
			rh2.setRawHtml("rawHtml2");
			wd.createrawhtml(rh1, "widget1");
			wd.createrawhtml(rh2, "widget2");


			//department assign
			Student pp1 = wd.findstudentByid(123);
			Student pp2 = wd.findstudentByid(234);
			PersonProfile pp3 = wd.findpersonByid(345);
			PersonProfile pp4 = wd.findpersonByid(456);
			//Student pp5
			Department dep1 = wd.finddepartmentByname("Electronic Engineering");
			Department dep2 = wd.finddepartmentByname("Computer Science");
			//section role

			//create enroll
			Enroll e1 = new Enroll();
			Enroll e2 = new Enroll();
			Enroll e3 = new Enroll();
			e1.setFinalGrade("A");
			e1.setLetterGrade("A");
			e1.setDetailedGrade("good,good,normal");
			e1.setStudentFeedback("Nothing right now");
			e2.setFinalGrade("A");
			e2.setLetterGrade("A");
			e2.setDetailedGrade("good,good,good");
			e2.setStudentFeedback("I love this school");
			e3.setFinalGrade("A");
			e3.setLetterGrade("A");
			e3.setDetailedGrade("good,good,normal");
			e3.setStudentFeedback("Nothing right now");
			wd.enrollStudentInSection(e1, 123, "Computer Vision camp");
			wd.enrollStudentInSection(e3, 123, "Database management jose"); //student 123 have two courses
			wd.enrollStudentInSection(e2, 234, "Database management jose");
//			Enroll e4 = new Enroll();
//			e4.setFinalGrade("A");
//			e4.setLetterGrade("A");
//			e4.setDetailedGrade("good,good,normal");
//			e4.setStudentFeedback("Nothing right now");
//			wd.enrollStudentInSection(e4, 234, "Computer Vision camp");


			//create employment record
			EmploymentRecord er1 = new EmploymentRecord(); //for student 1
			EmploymentRecord er2 = new EmploymentRecord(); //for student 2
			EmploymentRecord er3 = new EmploymentRecord();
			EmploymentRecord er4 = new EmploymentRecord();
			EmploymentRecord er5 = new EmploymentRecord();
			er1.setType("course coordinator");
			er2.setType("advisor");
			er2.setOfficeHour("Monday 12:00, Thursday 15:00"); //second student is a TA
			er3.setType("instructor");
			er3.setOfficeHour("Monday 13:00"); //jose is the administer
			er4.setType("instructor");
			er4.setOfficeHour("Tuesday 10:00");
			er5.setType("course coordinator");
			wd.createEmployRecord(er1, 123, "Database management jose");
			wd.createEmployRecord(er5, 123, "Computer Vision camp");
			wd.createEmployRecord(er2, 234, "Database management jose");
			wd.createEmployRecord(er3, 345, "Database management jose");
			wd.createEmployRecord(er4, 456, "Computer Vision camp");

			//enroll role use the previous pp1 and create new section here

			Section section1 = wd.findsectionByname("Database management jose");
			Section section2 = wd.findsectionByname("Computer Vision camp");
			Course course1 = wd.findcourseByname("Database management");
			Course course2 = wd.findcourseByname("Computer Vision");

			EmploymentRecord employrecord1 = wd.findemplotrecordBypands(pp1, section1);
			EmploymentRecord employrecord2 = wd.findemplotrecordBypands(pp1, section2);
			EmploymentRecord employrecord3 = wd.findemplotrecordBypands(pp2, section1);
			EmploymentRecord employrecord4 = wd.findemplotrecordBypands(pp3, section1);
			EmploymentRecord employrecord5 = wd.findemplotrecordBypands(pp4, section2);


			wd.createenrollRole("course coordinator", e3, pp1, section1, employrecord1);
			wd.createenrollRole("course coordinator", e1, pp1, section2, employrecord2);
			wd.createenrollRole("advisor", e2, pp2, section1, employrecord3);
			//section role
			wd.createsectionRole("course coordinator", section1, pp1, employrecord1);
			wd.createsectionRole("course coordinator", section2, pp1, employrecord2);
			wd.createsectionRole("advisor", section1, pp2, employrecord3);
			wd.createsectionRole("instructor", section1, pp3, employrecord4);
			wd.createsectionRole("instructor", section2, pp4, employrecord5);
			//course role
			wd.createcourseRole("course coordinator",course1 ,pp1, section1, employrecord1);
			wd.createcourseRole("course coordinator",course2, pp1, section2, employrecord2);
			wd.createcourseRole("advisor",course1, pp2, section1, employrecord3);
			wd.createcourseRole("instructor",course1, pp3, section1, employrecord4);
			wd.createcourseRole("instructor",course2, pp4, section2, employrecord5);



			// create semester assignment
			RegistraRecord rr1 = new RegistraRecord();
			RegistraRecord rr2 = new RegistraRecord();
			rr1.setCRN(12345);
			rr2.setCRN(23456);
			wd.createRegistraRecord(rr1, section1, course1);//"Database management jose", "Database management");
			wd.createRegistraRecord(rr2, section2, course2);//"Computer Vision camp", "Computer Vision");

			wd.createSemester_assign(course2, "Fall 2019");
			wd.createSemester_assign(course1, "Spring 2020");

			//create registra record
			//create assignment
			wd.createDepartmentAssign(pp1, dep1);
			wd.createDepartmentAssign(pp2, dep2);
			wd.createDepartmentAssign(pp3, dep2);
			wd.createDepartmentAssign(pp4, dep1);



//			//update
//			//update phone
//			Phones new_phone = phone2;//wd.findphoneBypandp(pp2, "234-567");
//			//PersonProfile p2 = wd.findpersonByid(234);
//			new_phone.setPhone("111-222");
//			new_phone.setPersonProfile(pp2);
//			wd.UpdatePhone(pp2, new_phone);
//			//update address
//			Address new_address = address1;//wd.findaddressBypanda(pp1, "abc,123");
//			//Student s1 = wd.findstudentByid(123);
//			//PersonProfile p1 = wd.findpersonByid(123);
//			new_address.setAddress("bcd,123");
//			//new_address.setPersonProfile(pp1);
//			wd.UpdateAddress(pp1, new_address);
//			//update email
//			Email new_email = new Email();
//			//PersonProfile p3 = new PersonProfile();
//			new_email.setEmail("jose@husky.northeastern");
//			new_email.setPersonProfile(pp3);
//			wd.UpdateEmail(pp3, new_email);
//			//update student
//			Student o_student = pp2;//wd.findstudentByid(234);
//			o_student.setUsername("bob_change");
//			wd.UpdateStudent(o_student);
//			//update faculty
//			Faculty fac1 = wd.findfacultyByid(456);
//			Faculty o_faculty = fac1;//wd.findfacultyByid(456);
//			o_faculty.setBankAccount("new_bank account");
//			wd.UpdateFaculty(o_faculty);
//
//			s1 = wd.findstudentByid(123);
//			s1.setLastName("new_aa111");
//			wd.UpdateStudent(s1);
//
//			f1 = wd.findfacultyByid(4);
//			f1.setParking("qewerrrrrrr");
//			//f1.setTenureStatus(true);
//			wd.UpdateFaculty(f1);
//			s2 = new Student();
//
//			Course c1 = wd.findcourseByname("Database");
//			c1.setDescription("database introduction 2");
//			wd.UpdateCourse(c1);
			
			//others are same
			//create几个role的时候需要的参数比较多，用对应的wd.find找到后再作为输入即可
		}
		catch (SQLException e) {
			 //TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	@Test
//	public void testUpdate() {
//		try {
//			//up date address
//			Address new_address = new Address();
//			//Student s1 = wd.findstudentByid(123);
//			PersonProfile p1 = wd.findpersonByid(123);
//			new_address.setAddress("bcd 123");
//			new_address.setPersonProfile(p1);
//			wd.UpdateAddress(123, new_address, "abc,123");
//			//update phone
//			Phones new_phone = new Phones();
//			PersonProfile p2 = wd.findpersonByid(234);
//			new_phone.setPhone("111-222");
//			new_phone.setPersonProfile(p2);
//			wd.UpdatePhone(234, new_phone, "234-567");
//			//update email
//			Email new_email = new Email();
//			PersonProfile p3 = new PersonProfile();
//			new_email.setEmail("jose@husky.northeastern");
//			new_email.setPersonProfile(p3);
//			wd.UpdateEmail(345, new_email, "jose@husky.edu");
//			//update student
//			Student o_student = wd.findstudentByid(234);
//			o_student.setUsername("bob_change");
//			wd.UpdateStudent(234, o_student);
//			//update faculty
//			Faculty o_faculty = wd.findfacultyByid(456);
//			o_faculty.setBankAccount("new_bank account");
//			wd.UpdateFaculty(456, o_faculty);
//			
//		}
//		catch(SQLException e) {
//			e.printStackTrace();
//		}
//	}
}
