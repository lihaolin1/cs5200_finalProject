package edu.northeastern.cs5200.DAO;

import java.sql.SQLException;
import java.util.List;

import edu.northeastern.cs5200.Tables.Address;
import edu.northeastern.cs5200.Tables.Course;
import edu.northeastern.cs5200.Tables.CoursePriviledge;
import edu.northeastern.cs5200.Tables.CourseRole;
import edu.northeastern.cs5200.Tables.Department;
import edu.northeastern.cs5200.Tables.Department_assignment;
import edu.northeastern.cs5200.Tables.Email;
import edu.northeastern.cs5200.Tables.EmploymentRecord;
import edu.northeastern.cs5200.Tables.Enroll;
import edu.northeastern.cs5200.Tables.EnrollPriviledge;
import edu.northeastern.cs5200.Tables.EnrollRole;
import edu.northeastern.cs5200.Tables.EssayQuestion;
import edu.northeastern.cs5200.Tables.Evaluation;
import edu.northeastern.cs5200.Tables.Exam;
import edu.northeastern.cs5200.Tables.Faculty;
import edu.northeastern.cs5200.Tables.FillInTheBlank;
import edu.northeastern.cs5200.Tables.LearningModule;
import edu.northeastern.cs5200.Tables.MultipleChoiceQuestion;
import edu.northeastern.cs5200.Tables.PersonProfile;
import edu.northeastern.cs5200.Tables.Phones;
import edu.northeastern.cs5200.Tables.Priviledge;
import edu.northeastern.cs5200.Tables.RawHtml;
import edu.northeastern.cs5200.Tables.RegistraRecord;
import edu.northeastern.cs5200.Tables.Role;
import edu.northeastern.cs5200.Tables.Section;
import edu.northeastern.cs5200.Tables.SectionPriviledge;
import edu.northeastern.cs5200.Tables.SectionRole;
import edu.northeastern.cs5200.Tables.Semester;
import edu.northeastern.cs5200.Tables.Semester_assignment;
import edu.northeastern.cs5200.Tables.SimpleEssayAssignment;
import edu.northeastern.cs5200.Tables.Slide;
import edu.northeastern.cs5200.Tables.Student;
import edu.northeastern.cs5200.Tables.SubmissionAssignment;
import edu.northeastern.cs5200.Tables.Widget;
import edu.northeastern.cs5200.Tables.YoutubeVideo;
import edu.northeastern.cs5200.Tables.textDocument;


public interface WhiteBoard_Dao {
	//delete
	void truncateDatabase() throws SQLException; // need more
	void deleteAessayQuestion(String question) throws SQLException;
	void deleteAmultichoiceQuestion(String question) throws SQLException;
	void deleteAfillinblankQuestion(String question) throws SQLException;
	void deleteAexam(String name) throws SQLException;
	void deleteAsimpleessayassignment(String question) throws SQLException;
	void deleteAsubmissionassignment(String question) throws SQLException;
	void deleteAevaluation(String name) throws SQLException;
	void deleteAyoutube(String youtube) throws SQLException;
	void deleteAslide(String slide) throws SQLException;
	void deleteAtextDocument(String textDocument) throws SQLException;
	void deleteArawHtml(String rawHtml) throws SQLException;
	void deleteAwidget(String name) throws SQLException;
	void deletecoursePriviledge(Integer course_id, Integer EmployR_id) throws SQLException;
	void deletecoursePriviledgeBycourse(Integer course_id) throws SQLException;
	void deletesectionPriviledge(String sec_title, Integer EmployR_id) throws SQLException;
	void deletesectionPriviledgeBysection(String sec_title) throws SQLException;
	void deleteenrollPriviledge(Integer enroll_id, Integer EmployR_id) throws SQLException;
	void deleteenrollPriviledgeByenroll(Integer enroll_id) throws SQLException;
	void deletecourseRole(Integer course_id, Integer person_id, String sec_title) throws SQLException;
	void deletecourseRoleBycourse(Integer course_id) throws SQLException;
	void deletesectionRole(String sec_title, Integer person_id) throws SQLException;
	void deletesectionRoleBysection(String sec_title) throws SQLException;
	void deleteenrollRole(Integer enroll_id, Integer person_id, String sec_title) throws SQLException;
	void deleteenrollRoleByenroll(Integer enroll_id) throws SQLException;
	void deletedepartment_assign(Integer person_id, String dep_name) throws SQLException;
	void deleteregistraRecord(String sec_title, Integer course_id) throws SQLException;
	void deleteregistraRecordBycourse(Integer course_id) throws SQLException;
	void deleteregistraRecordBysection(String sec_title) throws SQLException;
	void deleteemploymentRecord(Integer person_id, String sec_title) throws SQLException;
	void deletesemester_assignment(Semester semester, Course course) throws SQLException;
	void deleteASemester(String semester) throws SQLException;
	void deleteACourse(String name) throws SQLException;
	void deleteAenroll(Integer stu_id, String sec_title) throws SQLException;
	void deleteASection(String sec_title) throws SQLException;
	void deleteAdepartment(String name) throws SQLException;
	void deleteAphone(String phone) throws SQLException;
	void deleteAaddress(String address) throws SQLException;
	void deleteAemail(String email) throws SQLException;
	void deleteAStudent(Integer stu_id) throws SQLException;
	void deleteAFaculty(Integer fac_id) throws SQLException;
	
	//create
	Faculty createFaculty(Faculty faculty) throws SQLException;
	Student createStudent(Student student) throws SQLException;
	Address creatAddress(Address address, Integer person_id) throws SQLException;
	Email creatEmail(Email email, Integer person_id) throws SQLException;
	Phones creatPhones(Phones phone, Integer person_id) throws SQLException;
	Department createDepartment(Department department) throws SQLException;
	Department_assignment createDepartmentAssign(PersonProfile person, Department department) throws SQLException;
	Course createCourse(Course course) throws SQLException;
	Semester createSemester(Semester semester) throws SQLException;
	Section createSection(Section section) throws SQLException;
	Semester_assignment createSemester_assign(Course course, String semester_name) throws SQLException;
	Boolean enrollStudentInSection(Enroll enroll, Integer stu_id, String sec_title) throws SQLException;
//	Enroll createEnroll(Enroll enroll) throws SQLException;
	
	EmploymentRecord createEmployRecord(EmploymentRecord record, Integer person_id, String sec_title) throws SQLException;
	RegistraRecord createRegistraRecord(RegistraRecord record, Section section, Course course) throws SQLException;///String sec_title, String course_name) throws SQLException;
	LearningModule createLearningModule(LearningModule module, Integer course_id) throws SQLException;
	EssayQuestion createEassyQuestion(EssayQuestion EQ, String exam_name) throws SQLException;
	MultipleChoiceQuestion createmultiplechoicequestion(MultipleChoiceQuestion MQ, String exam_name) throws SQLException;
	FillInTheBlank createfillintheblank(FillInTheBlank FB, String exam_name) throws SQLException;
	Exam createExam(Exam exam, String course_name) throws SQLException;
	SimpleEssayAssignment createsimpleessayassignment(SimpleEssayAssignment SA, String eva_name) throws SQLException;
	SubmissionAssignment createsubmissionassignment(SubmissionAssignment SA, String eva_name) throws SQLException;
	Evaluation createEvaluation(Evaluation evaluation, String course_name) throws SQLException;
	YoutubeVideo createyoutube(YoutubeVideo youtube, String widget_name) throws SQLException;
	Slide createslide(Slide slide, String widget_name) throws SQLException;
	textDocument createtextdocument(textDocument TD, String widget_name) throws SQLException;
	RawHtml createrawhtml(RawHtml RH, String widget_name) throws SQLException;
	Widget createWidget(Widget widget, String course_name) throws SQLException;
	Priviledge createPriviledge(Priviledge priviledge) throws SQLException;
	Role createRole(Role role) throws SQLException;
	//
	CoursePriviledge createcoursePriviledge(String priviledge_name, Course course, EmploymentRecord employ) throws SQLException;//Integer course_id, Integer EmployR_id) throws SQLException;
	EnrollPriviledge createenrollPriviledge(String priviledge_name, Enroll enroll, EmploymentRecord employ) throws SQLException;//Integer enroll_id, Integer EmployR_id) throws SQLException;
	SectionPriviledge createsectionPriviledge(String priviledge_name, Section section, EmploymentRecord employ) throws SQLException;//String sec_title, Integer EmployR_id) throws SQLException;
	CourseRole createcourseRole(String Role_name, Course course, PersonProfile person, Section section, EmploymentRecord employ) throws SQLException;//String course_name,  Integer person_id, String sec_title) throws SQLException;
	EnrollRole createenrollRole(String Role_name,Enroll enroll,Student student, Section section, EmploymentRecord employ) throws SQLException;//Integer person_id, String sec_title) throws SQLException;
	SectionRole createsectionRole(String Role_name, Section section, PersonProfile person, EmploymentRecord employ) throws SQLException;//String sec_title, Integer person_id) throws SQLException;
	
	
	//update
	EmploymentRecord findemplotrecordBypands(PersonProfile person, Section section) throws SQLException;
	void UpdateAddress(PersonProfile person, Address new_address) throws SQLException;
	
	void UpdatePhone(PersonProfile person, Phones new_phone) throws SQLException;
	
	void UpdateEmail(PersonProfile person, Email new_email) throws SQLException;
	
	void UpdateStudent(Student new_stu) throws SQLException;
	void UpdateFaculty(Faculty new_fac) throws SQLException;
	void UpdateEssayQuestion(String question, String original_question) throws SQLException;
	void Updatemultiplechoicequestion(String multiplechoicequestion, String original_question) throws SQLException;
	void Updatefillintheblank(String fillintheblank, String original_question) throws SQLException;
	void UpdateExam(Exam new_exam) throws SQLException;
	void Updatesimpleessayassignment(String SA, String o_assignment) throws SQLException;
	void Updatesubmissionassignment(String SA, String o_assignment) throws SQLException;
	void UpdateEvaluation(Evaluation new_evaluation) throws SQLException;
	void Updateyoutube(String youtube, String o_youtube) throws SQLException;
	void Updateslide(String slide, String o_slide) throws SQLException;
	void Updatetextdocument(String text, String o_text) throws SQLException;
	void Updaterawhtml(String RH, String o_RH) throws SQLException;
	void UpdateWidget(Widget new_widget) throws SQLException;
	void UpdatecourseRole(String new_role_name, Course course, PersonProfile person, Section section) throws SQLException;
	void UpdateenrollRole(String new_role_name, Student person, Section section) throws SQLException;
	void UpdatesectionRole(String new_role_name, Section section, PersonProfile person) throws SQLException;
	void UpdateEmployRecord(EmploymentRecord new_record) throws SQLException;
	void UpdateDepartmentAssign(Department_assignment new_assign) throws SQLException;
	void UpdateDepartment(Department new_department) throws SQLException;
	void UpdateSemester(Semester new_semester) throws SQLException;
	void UpdateCourse(Course new_course) throws SQLException;
	void UpdateSemester_assign(Semester_assignment new_se) throws SQLException;
	void UpdateSection(Section new_section) throws SQLException;
	void UpdateRegistraRecord(RegistraRecord new_record) throws SQLException;
	void Updateenroll(Enroll new_enroll) throws SQLException;
	void updateseats(Integer seats, String sec_title) throws SQLException;
	//find
	List<EmploymentRecord> findallemploy();
	List<Enroll> findEnrollByStudent(Student student);
	Widget findwidgetByname(String name);
	Evaluation findevaluationByname(String name);
	Exam findexamByname(String name);
	Enroll findenrollBysands(Student student, Section section);
	RegistraRecord findRegistrarecordBy(Section section, Course course);
	Semester_assignment findsemester_assignBycands(Course course, Semester semester);
	EmploymentRecord findrecordBypands(PersonProfile person, Section section);
	Phones findphoneBypandp(PersonProfile person, String o_phone);
	Address findaddressBypanda(PersonProfile person, String o_address);
	Faculty findfacultyByid(Integer fac_id);
	Course findcourseByname(String name);
	Section findsectionByname(String title);
	Semester findsemesterByname(String semester);
	PersonProfile findpersonByid(Integer person_id);
	Student findstudentByid(Integer stu_id);
	Department finddepartmentByname(String name);
	List<PersonProfile> findAllPerson();
	List<Faculty> findAllFaculty();
	List<Student> findAllStudents();
	List<Course> findAllCourses();
	List<Section> findAllSections();
	List<Enroll> findAllEnroll();
}
