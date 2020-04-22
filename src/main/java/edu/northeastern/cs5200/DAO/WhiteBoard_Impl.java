package edu.northeastern.cs5200.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.northeastern.cs5200.Repository.AddressRepository;
import edu.northeastern.cs5200.Repository.CoursePriviledgeRepository;
import edu.northeastern.cs5200.Repository.CourseRoleRepository;
import edu.northeastern.cs5200.Repository.DepartmentRepository;
import edu.northeastern.cs5200.Repository.Department_assignRepository;
import edu.northeastern.cs5200.Repository.EassyQuestionRepository;
import edu.northeastern.cs5200.Repository.EmailRepository;
import edu.northeastern.cs5200.Repository.EmploymentRecordRepository;
import edu.northeastern.cs5200.Repository.EnrollPriviledgeRepository;
import edu.northeastern.cs5200.Repository.EnrollRepository;
import edu.northeastern.cs5200.Repository.EnrollRoleRepository;
import edu.northeastern.cs5200.Repository.EvaluationRepository;
import edu.northeastern.cs5200.Repository.ExamRepository;
import edu.northeastern.cs5200.Repository.FacultyRepository;
import edu.northeastern.cs5200.Repository.FillInTheBlankRepository;
import edu.northeastern.cs5200.Repository.LearningModuleRepository;
import edu.northeastern.cs5200.Repository.MultipleChoiceQuestionRepository;
import edu.northeastern.cs5200.Repository.PersonRepository;
import edu.northeastern.cs5200.Repository.PhoneRepository;
import edu.northeastern.cs5200.Repository.PriviledgeRepository;
import edu.northeastern.cs5200.Repository.RawHtmlRepository;
import edu.northeastern.cs5200.Repository.RegistraRecordRepository;
import edu.northeastern.cs5200.Repository.RoleRepository;
import edu.northeastern.cs5200.Repository.SectionPriviledgeRepository;
import edu.northeastern.cs5200.Repository.SectionRoleRepository;
import edu.northeastern.cs5200.Repository.SemesterRepository;
import edu.northeastern.cs5200.Repository.Semester_assignmentRepository;
import edu.northeastern.cs5200.Repository.SimpleEssayAssignmentRepository;
import edu.northeastern.cs5200.Repository.SlideRepository;
import edu.northeastern.cs5200.Repository.StudentRepository;
import edu.northeastern.cs5200.Repository.SubmissionAssignmentRepository;
import edu.northeastern.cs5200.Repository.TextDocumentRepository;
import edu.northeastern.cs5200.Repository.WidgetRepository;
import edu.northeastern.cs5200.Repository.YoutubeRepository;
import edu.northeastern.cs5200.Repository.courseRepository;
import edu.northeastern.cs5200.Repository.sectionRepository;
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



@Component
public class WhiteBoard_Impl implements WhiteBoard_Dao{
	@Autowired
	PersonRepository personRepository;
	@Autowired
	FacultyRepository facultyRepository;
	@Autowired
	StudentRepository studentRepository;
	@Autowired
	PhoneRepository phoneRepository;
	@Autowired
	EmailRepository emailRepository;
	@Autowired
	AddressRepository addressRepository;
	@Autowired
	courseRepository courseRepository;
	@Autowired
	SemesterRepository semesterRepository;
	@Autowired
	sectionRepository sectionRepository;
	@Autowired
	EnrollRepository enrollRepository;
	
	@Autowired
	DepartmentRepository departmentRepository;
	@Autowired
	Department_assignRepository department_assignRepository;
	@Autowired
	EmploymentRecordRepository employmentrecordRepository;
	@Autowired
	RegistraRecordRepository registraRecordRepository;
	@Autowired
	LearningModuleRepository learningModuleRepository;
	@Autowired
	PriviledgeRepository priviledgeRepository;
	@Autowired
	RoleRepository roleRepository;
	@Autowired
	CoursePriviledgeRepository coursePriviledgeRpository;
	@Autowired
	EnrollPriviledgeRepository enrollPriviledgeRpository;
	@Autowired
	SectionPriviledgeRepository sectionPriviledgeRepository;
	@Autowired
	CourseRoleRepository courseroleRepository;
	@Autowired
	EnrollRoleRepository enrollroleRepository;
	@Autowired
	SectionRoleRepository sectionroleRepository;
	@Autowired
	EassyQuestionRepository essayquestionRepository;
	@Autowired
	MultipleChoiceQuestionRepository multiplechoicequestionRepository;
	@Autowired
	FillInTheBlankRepository fillintheblankRepository;
	@Autowired
	ExamRepository examRepository;
	@Autowired
	SimpleEssayAssignmentRepository simpleessayassignmentRepository;
	@Autowired
	SubmissionAssignmentRepository submissionassignmentRepository;
	@Autowired
	EvaluationRepository evaluationRepository;
	@Autowired
	YoutubeRepository youtubeRepository;
	@Autowired
	SlideRepository slideRepository;
	@Autowired
	TextDocumentRepository textdocumentRepository;
	@Autowired
	RawHtmlRepository rawhtmlRepository;
	@Autowired
	WidgetRepository widgetRepository;
	@Autowired
	Semester_assignmentRepository semester_assignRepository;
	public void WhiteBorad_Impl() {
		
	}
	//delete
	public void truncateDatabase() {
		//should delete table in order
		essayquestionRepository.deleteAll();
		multiplechoicequestionRepository.deleteAll();
		fillintheblankRepository.deleteAll();
		simpleessayassignmentRepository.deleteAll();
		submissionassignmentRepository.deleteAll();
		youtubeRepository.deleteAll();
		slideRepository.deleteAll();
		textdocumentRepository.deleteAll();
		rawhtmlRepository.deleteAll();
		learningModuleRepository.deleteAll();
		//
		coursePriviledgeRpository.deleteAll();
		sectionPriviledgeRepository.deleteAll();
		enrollPriviledgeRpository.deleteAll();
		courseroleRepository.deleteAll();
		sectionroleRepository.deleteAll();
		enrollroleRepository.deleteAll();
		
		department_assignRepository.deleteAll();
		registraRecordRepository.deleteAll();
		employmentrecordRepository.deleteAll();
		//
		semester_assignRepository.deleteAll();
		semesterRepository.deleteAll();
		courseRepository.deleteAll();
		enrollRepository.deleteAll();
		sectionRepository.deleteAll();
		departmentRepository.deleteAll();
		phoneRepository.deleteAll();
		emailRepository.deleteAll();
		addressRepository.deleteAll();
		personRepository.deleteAll();
	}
	public void deleteAessayQuestion(String question) {
		essayquestionRepository.deleteByquestion(question);
	}
	public void deleteAmultichoiceQuestion(String question) {
		multiplechoicequestionRepository.deleteByquestion(question);
	}
	public void deleteAfillinblankQuestion(String question){
		fillintheblankRepository.deleteByquestion(question);
	}
	public void deleteAexam(String name) {
		essayquestionRepository.deleteByexam(examRepository.findByname(name));
		multiplechoicequestionRepository.deleteByexam(examRepository.findByname(name));
		fillintheblankRepository.deleteByexam(examRepository.findByname(name));
		examRepository.deleteByname(name);
	}
	
	public void deleteAsimpleessayassignment(String question) {
		simpleessayassignmentRepository.deleteByquestion(question);
	}
	public void deleteAsubmissionassignment(String question) {
		submissionassignmentRepository.deleteByquestion(question);
	}
	public void deleteAevaluation(String name) {
		simpleessayassignmentRepository.deleteByevaluation(evaluationRepository.findByname(name));
		submissionassignmentRepository.deleteByevaluation(evaluationRepository.findByname(name));
		evaluationRepository.deleteByname(name);
	}
	
	public void deleteAyoutube(String youtube) {
		youtubeRepository.deleteByyoutube(youtube);
	}
	public void deleteAslide(String slide) {
		slideRepository.deleteByslide(slide);
	}
	public void deleteAtextDocument(String textDocument) {
		textdocumentRepository.deleteBytext(textDocument);
	}
	public void deleteArawHtml(String rawHtml) {
		rawhtmlRepository.deleteByhtml(rawHtml);
	}
	public void deleteAwidget(String name) {
		youtubeRepository.deleteBywidget(widgetRepository.findByname(name));
		slideRepository.deleteBywidget(widgetRepository.findByname(name));
		textdocumentRepository.deleteBywidget(widgetRepository.findByname(name));
		rawhtmlRepository.deleteBywidget(widgetRepository.findByname(name));
		widgetRepository.deleteByname(name);
	}
	//
	public void deletecoursePriviledge(Integer course_id, Integer EmployR_id) {
		coursePriviledgeRpository.deleterecord(courseRepository.findBycid(course_id), employmentrecordRepository.findByeid(EmployR_id));
	}
	public void deletecoursePriviledgeBycourse(Integer course_id) {
		coursePriviledgeRpository.deleterecordBycourse(courseRepository.findBycid(course_id));
	}
	public void deletesectionPriviledge(String sec_title, Integer EmployR_id) {
		sectionPriviledgeRepository.deleterecord(sectionRepository.findBytitle(sec_title), employmentrecordRepository.findByeid(EmployR_id));
	}
	public void deletesectionPriviledgeBysection(String sec_title) {
		sectionPriviledgeRepository.deleterecordBysection(sectionRepository.findBytitle(sec_title));
	}
	public void deleteenrollPriviledge(Integer enroll_id, Integer EmployR_id) {
		enrollPriviledgeRpository.deleterecord(enrollRepository.findByeid(enroll_id), employmentrecordRepository.findByeid(EmployR_id));
	}
	public void deleteenrollPriviledgeByenroll(Integer enroll_id) {
		enrollPriviledgeRpository.deleterecordByenroll(enrollRepository.findByeid(enroll_id));
	}
	public void deletecourseRole(Integer course_id, Integer person_id, String sec_title) {
		EmploymentRecord e = employmentrecordRepository.findrecord(personRepository.findBypid(person_id), sectionRepository.findBytitle(sec_title));
		Integer EmployR_id = e.getId();
		deletecoursePriviledge(course_id, EmployR_id);
		courseroleRepository.deleterecord(courseRepository.findBycid(course_id), employmentrecordRepository.findByeid(EmployR_id));
	}
	public void deletecourseRoleBycourse(Integer course_id) {
		deletecoursePriviledgeBycourse(course_id);
		courseroleRepository.deleterecordBycourse(courseRepository.findBycid(course_id));
	}
	public void deletesectionRole(String sec_title, Integer person_id) {
		EmploymentRecord e = employmentrecordRepository.findrecord(personRepository.findBypid(person_id), sectionRepository.findBytitle(sec_title));
		Integer EmployR_id = e.getId();
		deletesectionPriviledge(sec_title, EmployR_id);
		sectionroleRepository.deleterecord(sectionRepository.findBytitle(sec_title), employmentrecordRepository.findByeid(EmployR_id));
	}
	public void deletesectionRoleBysection(String sec_title) {
		deletesectionPriviledgeBysection(sec_title);
		sectionroleRepository.deleterecordBysection(sectionRepository.findBytitle(sec_title));
	}
	public void deleteenrollRole(Integer enroll_id, Integer person_id, String sec_title) {
		EmploymentRecord e = employmentrecordRepository.findrecord(personRepository.findBypid(person_id), sectionRepository.findBytitle(sec_title));
		Integer EmployR_id = e.getId();
		deleteenrollPriviledge(enroll_id, EmployR_id);
		enrollroleRepository.deleterecord(enrollRepository.findByeid(enroll_id), employmentrecordRepository.findByeid(EmployR_id));
	}
	public void deleteenrollRoleByenroll(Integer enroll_id) {
		deleteenrollPriviledgeByenroll(enroll_id);
		enrollroleRepository.deleterecordByenroll(enrollRepository.findByeid(enroll_id));
	}
	//
	public void deletedepartment_assign(Integer person_id, String dep_name) {
		department_assignRepository.deleterecord(personRepository.findBypid(person_id), departmentRepository.findByname(dep_name));
	}
	public void deleteregistraRecord(String sec_title, Integer course_id) {
		registraRecordRepository.deleterecord(courseRepository.findBycid(course_id), sectionRepository.findBytitle(sec_title));
	}
	public void deleteregistraRecordBycourse(Integer course_id) {
		registraRecordRepository.deleterecordBycourse(courseRepository.findBycid(course_id));
	}
	public void deleteregistraRecordBysection(String sec_title) {
		registraRecordRepository.deleterecordBysection(sectionRepository.findBytitle(sec_title));
	}
	public void deleteemploymentRecord(Integer person_id, String sec_title) {
		EmploymentRecord e = employmentrecordRepository.findrecord(personRepository.findBypid(person_id), sectionRepository.findBytitle(sec_title));
		
		List<CourseRole> c = e.getCourseRole();
		//List<SectionRole> s = e.getSectionRole();
		List<EnrollRole> en = e.getEnrollRole();
		Integer i;
		Integer j;
		for(i = 0; i< c.size(); i++) {deletecourseRole(c.get(i).getId(), person_id, sec_title); }
		deletesectionRole(sec_title, person_id);
		for(j = 0; j < en.size(); j++) {deleteenrollRole(en.get(j).getId(), person_id, sec_title); }
	}
	
	public void deletesemester_assignment(Semester semester, Course course) {
		semester_assignRepository.deletesemester_assign(semester, course);
	}
	
	public void deleteACourse(String name) {
		//if delete course, then the section of this course will disappear
		//need more
		Course course = courseRepository.findByname(name);
		List<CourseRole> cr = course.getCourseRole();
		//List<RegistraRecord> rr = course.getRegistraRecords();
		List<LearningModule> lm = course.getLearningModules();
		List<Semester_assignment> s = course.getSemesters();
		Integer i;
		Integer id;
		for(i = 0; i < s.size();i++) {deletesemester_assignment(s.get(i).getSemester(), course);} //delete semester
		for(i = 0; i < lm.size(); i++) {
			id = lm.get(i).getId();
			if(widgetRepository.findById(id) != null) {
				deleteAwidget(widgetRepository.findById(id).get().getWidget_name());
			}
			else if (evaluationRepository.findById(id) != null) {
				deleteAevaluation(evaluationRepository.findById(id).get().getEvaluation_name());
			}
			else {
				deleteAexam(examRepository.findById(id).get().getExam_name());
			}
		} //delete learning model
		deleteregistraRecordBycourse(course.getId());
		
		deletecourseRoleBycourse(cr.get(i).getId());
		
		courseRepository.deleteById(course.getId());
	}
	
	public void deleteASemester(String semester) {
		//delete all course and semester_assignment in this semester
		Semester s = semesterRepository.findByname(semester);
		List<Semester_assignment> sa = s.getCourse();
		int i;
		for(i = 0; i < sa.size(); i++) {
			deleteACourse(sa.get(i).getCourse().getName());
			deletesemester_assignment(sa.get(i).getSemester(), sa.get(i).getCourse());
		}
		semesterRepository.deleteByname(semester);
	}
	
	public void deleteAenroll(Integer stu_id, String sec_title) {
		Enroll enroll = enrollRepository.findBypands(studentRepository.findBysid(stu_id), sectionRepository.findBytitle(sec_title));
		deleteenrollRoleByenroll(enroll.getId());
		enrollRepository.deleteById(enroll.getId());
	}
	
	public void deleteASection(String sec_title) {
		//need more
		Section s = sectionRepository.findBytitle(sec_title);
		deleteregistraRecordBysection(s.getTitle());
		deletesectionRoleBysection(s.getTitle());
		List<Enroll> e = s.getEnrolls();
		List<EmploymentRecord> em = s.getEmploymentRecords();
		Integer i,j;
		for(i = 0; i<e.size(); i++) {enrollRepository.deleteById(e.get(i).getId());}
		for(j = 0;j<em.size(); j++) {employmentrecordRepository.deleteById(em.get(j).getId());}
//		List<Student> stu = findAllStudents(); 
//		Integer i;
//		for(i = 0; i < stu.size(); i++) {
//			deleteAenroll(stu.get(i).getId(), sec_title);
//			deleteemploymentRecord(stu.get(i).getId(), sec_title);
//		}
		sectionRepository.deleteById(s.getId());
	}
	
	public void deleteAdepartment(String name) {
		Department d = departmentRepository.findByname(name);
		List<Course> c = d.getCourse();
		List<Department_assignment> de = d.getPersonProfile();
		Integer i;
		for(i = 0;i<c.size();i++) {deleteACourse(c.get(i).getName());}
		Integer j;
		for(j = 0; j < de.size(); j++) {deletedepartment_assign(de.get(i).getpersonProfile().getId(), name);}
		departmentRepository.deleteByname(name);
	}
	
	public void deleteAphone(String phone) {
		phoneRepository.deletephone(phone);
	}
	public void deleteAaddress(String address) {
		addressRepository.deleteaddress(address);
	}
	public void deleteAemail(String email) {
		emailRepository.deleteemail(email);
	}
	
	public void deleteAStudent(Integer stu_id) {
		//need more
		Student s = studentRepository.findBysid(stu_id);
		List<Department_assignment> d = s.getDepartments();
		List<Enroll> e = s.getEnrolls();
		List<Address> a = s.getAddresses();
		List<Phones> p = s.getPhones();
		List<Email> em = s.getEmails();
		Integer i;
		for(i = 0; i < d.size(); i++) {deletedepartment_assign(stu_id, d.get(i).getdepartment().getName());}
		for(i = 0; i < e.size(); i++) {deleteAenroll(stu_id, e.get(i).getSection().getTitle());}
		for(i = 0; i < a.size(); i++) {deleteAaddress(a.get(i).getAddress());}
		for(i = 0; i < p.size(); i++) {deleteAphone(p.get(i).getPhone());}
		for(i = 0; i < p.size(); i++) {deleteAemail(em.get(i).getEmail());}
		studentRepository.deleteById(stu_id);
	}
	public void deleteAFaculty(Integer fac_id) {
		//if Faculty is disappear, then class will disappear
		// need more
		Faculty f = facultyRepository.findByfpid(fac_id);
		List<Department_assignment> d = f.getDepartments();
		List<Address> a = f.getAddresses();
		List<Phones> p = f.getPhones();
		List<Email> em = f.getEmails();
		Integer i;
		for(i = 0; i < d.size(); i++) {deletedepartment_assign(fac_id, d.get(i).getdepartment().getName());}
		for(i = 0; i < a.size(); i++) {deleteAaddress(a.get(i).getAddress());}
		for(i = 0; i < p.size(); i++) {deleteAphone(p.get(i).getPhone());}
		for(i = 0; i < p.size(); i++) {deleteAemail(em.get(i).getEmail());}
		facultyRepository.deleteById(fac_id);
	}
	
	//public void deleteAperson(Integer person_id)
	
	
	//create
	public Faculty createFaculty(Faculty faculty) {
		return facultyRepository.save(faculty);
	}
	public Student createStudent(Student student) {
		return studentRepository.save(student);
	}
	public Address creatAddress(Address address, Integer person_id) {
		address.setPersonProfile(personRepository.findBypid(person_id));
		return addressRepository.save(address);
	}
	public Email creatEmail(Email email, Integer person_id) {
		email.setPersonProfile(personRepository.findBypid(person_id));
		return emailRepository.save(email);
	}
	public Phones creatPhones(Phones phone, Integer person_id) {
		phone.setPersonProfile(personRepository.findBypid(person_id));
		return phoneRepository.save(phone);
	}
	public Department createDepartment(Department department) {
		return departmentRepository.save(department);
	}
	public Department_assignment createDepartmentAssign(PersonProfile person, Department department) {
		Department_assignment dep_assign = new Department_assignment();//.create_department_assignment(personRepository.findBypid(person_id), departmentRepository.findByname(dep_name));
			//PersonProfile person = personRepository.findBypid(person_id);
			//Department department = departmentRepository.findByname(dep_name);
		//dep_assign.setpersonProfile(person);
		//dep_assign.setDepartment(department);
		dep_assign.create_department_assignment(person, department);
		return department_assignRepository.save(dep_assign);
		//return department_assignRepository.saveByself(person, department);
	}
	public Section createSection(Section section) {
		return sectionRepository.save(section);
	}
	public Course createCourse(Course course) {
		return courseRepository.save(course);
	}
	public Semester createSemester(Semester semester) {
		return semesterRepository.save(semester);
	}
	public Semester_assignment createSemester_assign(Course course, String semester_name) {
		//Course course = courseRepository.findByname(course_name);
		Semester semester = semesterRepository.findByname(semester_name);
		Semester_assignment semester_assign = new Semester_assignment();
		semester_assign.setCourse(course);
		semester_assign.setSemester(semester);
		return semester_assignRepository.save(semester_assign);
	}
	
	//help function
	public Boolean enrollStudentInSection(Enroll enroll, Integer stu_id, String sec_title) {
		try {
			Section use_section = sectionRepository.findBytitle(sec_title);
			enroll.setSection(use_section);
			enroll.setStudent(studentRepository.findBysid(stu_id)); // the seat cap will decrease 1	
			enrollRepository.save(enroll);
			Integer new_seats;
			new_seats = use_section.getSeatCapacity()-1;
			use_section.setSeatCapacity(new_seats);
			sectionRepository.save(use_section);
//			updateseats(new_seats, sec_title);
			//sectionRepository.updateseat(new_seats, sec_title); // may cause some problem
		}catch(Exception e){
			return false;
		}
		return true;
	}
	public void updateseats(Integer seats, String sec_title) {
		sectionRepository.updateseat(seats, sec_title);
	}
//	public Enroll createEnroll(Enroll enroll) {
//		return enrollRepository.save(enroll);
//	}
	
	public EmploymentRecord createEmployRecord(EmploymentRecord record, Integer person_id, String sec_title) {
			record.setPersonProfile(personRepository.findBypid(person_id));
			record.setSection(sectionRepository.findBytitle(sec_title));
		return employmentrecordRepository.save(record);
	}
	public RegistraRecord createRegistraRecord(RegistraRecord record, Section section, Course course) {//String sec_title, String course_name) {
		record.setCourse(course);//courseRepository.findByname(course_name));
		record.setSection(section);//sectionRepository.findBytitle(sec_title));
		return registraRecordRepository.save(record);
	}
	public LearningModule createLearningModule(LearningModule module, Integer course_id) {
		module.setCourse(courseRepository.findBycid(course_id));
		return learningModuleRepository.save(module);
	}
	// exam, evaluation and widget need some thing before
	public EssayQuestion createEassyQuestion(EssayQuestion EQ, String exam_name) {
		EQ.setExam(examRepository.findByname(exam_name));
		return essayquestionRepository.save(EQ);
	}
	public MultipleChoiceQuestion createmultiplechoicequestion(MultipleChoiceQuestion MQ, String exam_name) {
		MQ.setExam(examRepository.findByname(exam_name));
		return multiplechoicequestionRepository.save(MQ);
	}
	public FillInTheBlank createfillintheblank(FillInTheBlank FB, String exam_name) {
		FB.setExam(examRepository.findByname(exam_name));
		return fillintheblankRepository.save(FB);
	}
	public Exam createExam(Exam exam, String course_name) {
		exam.setCourse(courseRepository.findByname(course_name));
		return examRepository.save(exam);
	}
	
	public SimpleEssayAssignment createsimpleessayassignment(SimpleEssayAssignment SA, String eva_name) {
		SA.setEvaluation(evaluationRepository.findByname(eva_name));
		return simpleessayassignmentRepository.save(SA);
	}
	public SubmissionAssignment createsubmissionassignment(SubmissionAssignment SA, String eva_name) {
		SA.setEvaluation(evaluationRepository.findByname(eva_name));
		return submissionassignmentRepository.save(SA);
	}
	public Evaluation createEvaluation(Evaluation evaluation, String course_name) {
		evaluation.setCourse(courseRepository.findByname(course_name));
		return evaluationRepository.save(evaluation);
	}
	
	public YoutubeVideo createyoutube(YoutubeVideo youtube, String widget_name) {
		youtube.setWidget(widgetRepository.findByname(widget_name));
		return youtubeRepository.save(youtube);
	}
	public Slide createslide(Slide slide, String widget_name) {
		slide.setWidget(widgetRepository.findByname(widget_name));
		return slideRepository.save(slide);
	}
	public textDocument createtextdocument(textDocument TD, String widget_name) {
		TD.setWidget(widgetRepository.findByname(widget_name));
		return textdocumentRepository.save(TD);
	}
	public RawHtml createrawhtml(RawHtml RH, String widget_name) {
		RH.setWidget(widgetRepository.findByname(widget_name));
		return rawhtmlRepository.save(RH);
	}
	public Widget createWidget(Widget widget, String course_name) {
		widget.setCourse(courseRepository.findByname(course_name));
		return widgetRepository.save(widget);
	}
	// create Enum
	public Priviledge createPriviledge(Priviledge priviledge) {
		return priviledgeRepository.save(priviledge);
	}
	public Role createRole(Role role) {
		return roleRepository.save(role);
	}
	public CoursePriviledge createcoursePriviledge(String priviledge_name, Course course, EmploymentRecord employ) {//Integer course_id, Integer EmployR_id) {
		CoursePriviledge CP = new CoursePriviledge();
		CP.setPriviledgeName(priviledge_name);
		CP.setCourse(course);//courseRepository.findBycid(course_id));
		CP.setEmploymentRecord(employ);//employmentrecordRepository.findByeid(EmployR_id));
		return coursePriviledgeRpository.save(CP);
	}
	public EnrollPriviledge createenrollPriviledge(String priviledge_name, Enroll enroll, EmploymentRecord employ) {//Integer enroll_id, Integer EmployR_id) {
		EnrollPriviledge EP = new EnrollPriviledge();
		EP.setEmploymentRecord(employ);//employmentrecordRepository.findByeid(EmployR_id));
		EP.setEnroll(enroll);//enrollRepository.findByeid(enroll_id));
		EP.setPriviledgeName(priviledge_name);
		return enrollPriviledgeRpository.save(EP);
	}
	public SectionPriviledge createsectionPriviledge(String priviledge_name, Section section, EmploymentRecord employ) {
		SectionPriviledge SP = new SectionPriviledge();
		SP.setEmploymentRecord(employ);//employmentrecordRepository.findByeid(EmployR_id));
		SP.setPriviledgeName(priviledge_name);
		SP.setSection(section);//sectionRepository.findBytitle(sec_title));
		return sectionPriviledgeRepository.save(SP);
	}
	public CourseRole createcourseRole(String Role_name, Course course, PersonProfile person, Section section, EmploymentRecord employ) {//String course_name, Integer person_id, String sec_title) {
		//Course course = courseRepository.findByname(course_name);
		Integer course_id = course.getId();
		//EmploymentRecord employ = employmentrecordRepository.findById(e_id).get();//findBypands(person, section);//(personRepository.findBypid(person_id), sectionRepository.findBytitle(sec_title));
		Integer EmployR_id = employ.getId();
		CourseRole CR = new CourseRole();
		CR.setRolename(Role_name);
		CR.setEmploymentRecord(employ);//employmentrecordRepository.findByeid(EmployR_id));
		CR.setCourse(course);//courseRepository.findBycid(course_id));
		createcoursePriviledge("view", course, employ);
		if(Role_name != "course coordinator") {
			createcoursePriviledge("update", course, employ);
			if(Role_name != "advisor") {
				createcoursePriviledge("create", course, employ);
				createcoursePriviledge("delete", course, employ);
			}
		}
		return courseroleRepository.save(CR);
	}
	
	public EnrollRole createenrollRole(String Role_name,Enroll enroll, Student student, Section section, EmploymentRecord employ) {//Integer person_id, String sec_title) {
		//Student student = studentRepository.findBysid(person_id);
		//Section section = sectionRepository.findBytitle(sec_title);
		//Enroll enroll = enrollRepository.findBypands(student, section);
		Integer enroll_id = enroll.getId();
		//EmploymentRecord employ = employmentrecordRepository.findById(e_id).get();//findBypands(student, section);
		Integer EmployR_id = employ.getId();
		EnrollRole ER = new EnrollRole();
		ER.setRolename(Role_name);
		ER.setEmploymentRecord(employ);//employmentrecordRepository.findByeid(EmployR_id));
		ER.setEnroll(enroll);//enrollRepository.findByeid(enroll_id));
		createenrollPriviledge("view", enroll, employ);
		if(Role_name != "course coordinator") {
			createenrollPriviledge("update", enroll, employ);
			if(Role_name != "advisor") {
				createenrollPriviledge("create", enroll, employ);
				createenrollPriviledge("delete", enroll, employ);
			}
		}
		return enrollroleRepository.save(ER);
	}
	
	public SectionRole createsectionRole(String Role_name, Section section, PersonProfile person, EmploymentRecord employ) {//String sec_title, Integer person_id) {
		//PersonProfile person = personRepository.findBypid(person_id);
		//Section section = sectionRepository.findBytitle(sec_title);
		//EmploymentRecord employ = employmentrecordRepository.findById(e_id).get();//findBypands(person, section);
		Integer EmployR_id = employ.getId();
		SectionRole SR = new SectionRole();
		SR.setRolename(Role_name);
		SR.setEmploymentRecord(employ);//employmentrecordRepository.findByeid(EmployR_id));
		SR.setSection(section);//sectionRepository.findBytitle(sec_title));
		String sec_title = section.getTitle();
		createsectionPriviledge("view", section, employ);//sec_title
		if(Role_name != "course coordinator") {
			createsectionPriviledge("update", section, employ);
			if(Role_name != "advisor") {
				createsectionPriviledge("create", section, employ);
				createsectionPriviledge("delete", section, employ);
			}
		}
		return sectionroleRepository.save(SR);
	}
	//update
	public void UpdateAddress(PersonProfile person, Address new_address) {
		//addressRepository.update(new_address.getAddress(), new_address.getPersonProfile(), person, o_address);//personRepository.findBypid(person_id), o_address);
		new_address.setPersonProfile(person);
		addressRepository.save(new_address);
	}
	public void UpdatePhone(PersonProfile person, Phones new_phone) {
		//phoneRepository.update(new_phone.getPhone(), new_phone.getPersonProfile(), person, o_phone);//personRepository.findBypid(person_id), o_phone);
		new_phone.setPersonProfile(person);
		phoneRepository.save(new_phone);
	}
	public void UpdateEmail(PersonProfile person, Email new_email) {
		//emailRepository.update(new_email.getEmail(), new_email.getPersonProfile(), person, o_email);//personRepository.findBypid(person_id), o_email);
		new_email.setPersonProfile(person);
		emailRepository.save(new_email);
	}
	
	public void UpdateStudent(Student new_stu) {
			//Student stu_use = studentRepository.findBysid(stu_id);
//		studentRepository.update(new_stu.getLastName(),new_stu.getFirstName(), 
//				new_stu.getUsername(), new_stu.getPassword(), new_stu.getStatus(), 
//				new_stu.getFinacialAid(), new_stu.getWorkStudy(), new_stu.getGpa(), 
//				new_stu.getScholarship(), stu_id);
		studentRepository.save(new_stu);
	}
	public void UpdateFaculty(Faculty new_fac) {
					//Faculty fac_use = facultyRepository.findByfpid(Fac_id);
//		facultyRepository.update(new_fac.getLastName(),new_fac.getFirstName(), 
//				new_fac.getUsername(), new_fac.getPassword(), new_fac.getBenefits(), 
//				new_fac.getTenureStatus(), new_fac.getParking(), new_fac.getBankAccount(), 
//				Fac_id);
		facultyRepository.save(new_fac);
	}
	//
	public void UpdateEssayQuestion(String question, String original_question) {
		EssayQuestion o_question = essayquestionRepository.findByquestion(original_question);
		o_question.setEassayQuestion(question);
		o_question.setExam(o_question.getExam());
		essayquestionRepository.save(o_question);
	}
	public void Updatemultiplechoicequestion(String multiplechoicequestion, String original_question) {
		MultipleChoiceQuestion o_question = multiplechoicequestionRepository.findByquestion(original_question);
		o_question.setMultipleChoiceQuestion(multiplechoicequestion);
		o_question.setExam(o_question.getExam());
		multiplechoicequestionRepository.save(o_question);
	}
	public void Updatefillintheblank(String fillintheblank, String original_question) {
		FillInTheBlank o_question = fillintheblankRepository.findByquestion(original_question);
		o_question.setFillInTheBlank(fillintheblank);
		o_question.setExam(o_question.getExam());
		fillintheblankRepository.save(o_question);
	}
	public void UpdateExam(Exam new_exam) {
		//Exam e = examRepository.findByname(exam_name);
		//examRepository.update(new_exam.getRubric(), new_exam.getCourse(), new_exam.getExam_name(), exam_name);
		examRepository.save(new_exam);
	}
	
	public void Updatesimpleessayassignment(String SA, String o_assignment) {
		SimpleEssayAssignment o_question = simpleessayassignmentRepository.findByassignment(o_assignment);
		o_question.setSimpleEssayAssignment(SA);
		o_question.setEvaluation(o_question.getEvaluation());
		simpleessayassignmentRepository.save(o_question);
	}
	public void Updatesubmissionassignment(String SA, String o_assignment) {
		SubmissionAssignment o_question = submissionassignmentRepository.findByassignment(o_assignment);
		o_question.setSubmissionAssignment(SA);
		o_question.setEvaluation(o_question.getEvaluation());
		submissionassignmentRepository.save(o_question);
	}
	public void UpdateEvaluation(Evaluation new_evaluation) {
		//Evaluation e = evaluationRepository.findByname(eva_name);
		//evaluationRepository.update(new_evaluation.getRubric(), new_evaluation.getCourse(), new_evaluation.getEvaluation_name(), eva_name);
		evaluationRepository.save(new_evaluation);
	}
	
	public void Updateyoutube(String youtube, String o_youtube) {
		YoutubeVideo o_video = youtubeRepository.findByvideo(o_youtube);
		o_video.setYoutubeVideo(youtube);
		o_video.setWidget(o_video.getWidget());
		youtubeRepository.save(o_video);
	}
	public void Updateslide(String slide, String o_slide) {
		Slide o_s = slideRepository.findByslide(o_slide);
		o_s.setSlide(slide);
		o_s.setWidget(o_s.getWidget());
		slideRepository.save(o_s);
	}
	public void Updatetextdocument(String text, String o_text) {
		textDocument o_t = textdocumentRepository.findBytext(o_text);
		o_t.setTextDocument(text);
		o_t.setWidget(o_t.getWidget());
		textdocumentRepository.save(o_t);
	}
	public void Updaterawhtml(String RH, String o_RH) {
		RawHtml o_r = rawhtmlRepository.findByhtml(o_RH);
		o_r.setRawHtml(RH);
		o_r.setWidget(o_r.getWidget());
		rawhtmlRepository.save(o_r);
	}
	public void UpdateWidget(Widget new_widget) {
		//widgetRepository.update(new_widget.getRubric(), new_widget.getCourse(), new_widget.getWidget_name(), w_name);
		widgetRepository.save(new_widget);
	}
	//role
	public void UpdatecourseRole(String new_role_name, Course course, PersonProfile person, Section section){//String course_name, Integer person_id, String sec_title) {
		//Course course = courseRepository.findByname(course_name);
		Integer course_id = course.getId();
		//PersonProfile person = personRepository.findBypid(person_id);
		//Section section = sectionRepository.findBytitle(sec_title);
		EmploymentRecord e = employmentrecordRepository.findrecord(person, section);
		Integer EmployR_id = e.getId();
		CourseRole cr = courseroleRepository.findBycande(course, e);
		cr.setRolename(new_role_name);
		courseroleRepository.save(cr);
		//courseroleRepository.update(new_role_name, course, e);//courseRepository.findBycid(course_id), employmentrecordRepository.findByeid(EmployR_id));
		deletecoursePriviledge(course_id, EmployR_id);
		createcoursePriviledge("view", course, e);//course_id, EmployR_id);
		if(new_role_name != "course coordinator") {
			createcoursePriviledge("update", course, e);//course_id, EmployR_id);
			if(new_role_name != "advisor") {
				createcoursePriviledge("create", course, e);//course_id, EmployR_id);
				createcoursePriviledge("delete", course, e);//course_id, EmployR_id);
			}
		}
	}
	public void UpdateenrollRole(String new_role_name, Student person, Section section){//Integer person_id, String sec_title) {
		//Student person = studentRepository.findBysid(person_id);
		//Section section = sectionRepository.findBytitle(sec_title);
		Enroll enroll = enrollRepository.findBypands(person, section);
		Integer enroll_id = enroll.getId();
		EmploymentRecord e = employmentrecordRepository.findrecord(person, section);//personRepository.findBypid(person_id), sectionRepository.findBytitle(sec_title));
		Integer EmployR_id = e.getId();
		EnrollRole enr = enrollroleRepository.findBypands(enroll, e);
		enr.setRolename(new_role_name);
		enrollroleRepository.save(enr);
		//enrollroleRepository.update(new_role_name, enroll, e);//enrollRepository.findByeid(enroll_id), employmentrecordRepository.findByeid(EmployR_id));
		deleteenrollPriviledge(enroll_id, EmployR_id);
		createenrollPriviledge("view", enroll, e);//enroll_id, EmployR_id);
		if(new_role_name != "course coordinator") {
			createenrollPriviledge("update", enroll, e);// enroll_id, EmployR_id);
			if(new_role_name != "advisor") {
				createenrollPriviledge("create", enroll, e);// enroll_id, EmployR_id);
				createenrollPriviledge("delete", enroll, e);// enroll_id, EmployR_id);
			}
		}
	}
	public void UpdatesectionRole(String new_role_name, Section section, PersonProfile  person) {
		//PersonProfile person = personRepository.findBypid(person_id);
		//Section section = sectionRepository.findBytitle(sec_title);
		EmploymentRecord e = employmentrecordRepository.findrecord(person, section);
		Integer EmployR_id = e.getId();
		SectionRole sr = sectionroleRepository.findBysande(section, e);
		sr.setRolename(new_role_name);
		sectionroleRepository.save(sr);
		//sectionroleRepository.update(new_role_name, section, e);//sectionRepository.findBytitle(sec_title), employmentrecordRepository.findByeid(EmployR_id));
		deletesectionPriviledge(section.getTitle(), EmployR_id);
		createsectionPriviledge("view", section, e);//sec_title, EmployR_id);
		if(new_role_name != "course coordinator") {
			createsectionPriviledge("update", section, e);//sec_title, EmployR_id);
			if(new_role_name != "advisor") {
				createsectionPriviledge("create", section, e);//sec_title, EmployR_id);
				createsectionPriviledge("delete", section, e);//sec_title, EmployR_id);
			}
		}
	}
	//
	public void UpdateEmployRecord(EmploymentRecord new_record) {//Integer person_id, String sec_title) {
		//employmentrecordRepository.update(new_record.getOfficeHour(), new_record.getType(), new_record.getPersonProfile(), new_record.getSection(), personRepository.findBypid(person_id), sectionRepository.findBytitle(sec_title));
		//new_record.setPersonProfile(person);
		//new_record.setSection(section);
		employmentrecordRepository.save(new_record);
	}
	public void UpdateDepartmentAssign(Department_assignment new_assign) {//Integer person_id, String dep_name) {
		//department_assignRepository.update(new_assign.getpersonProfile(), new_assign.getdepartment(), personRepository.findBypid(person_id), departmentRepository.findByname(dep_name));
		department_assignRepository.save(new_assign);
	}
	//////////////////////////////////////////
	public void UpdateDepartment(Department new_department) {  // this table have self pointer
		//departmentRepository.update(new_department.getName(), new_department.getLocation(), new_department.getDean(), o_department_name);
		departmentRepository.save(new_department);
	}
	////////////////////////////////////////
	public void UpdateSemester(Semester new_semester)
	{
		//semesterRepository.update(new_semester.getSemester(), name);
		semesterRepository.save(new_semester);
	}
	
	public void UpdateCourse(Course new_course) {
		//courseRepository.update(new_course.getName(), new_course.getDescription(), new_course.getCalendar(), new_course.getDepartments(), name);
		courseRepository.save(new_course);
	}
	public void UpdateSemester_assign(Semester_assignment new_se) {
		//semester_assignRepository.update(new_se.getSemester(), new_se.getCourse(), semesterRepository.findByname(semester_name), courseRepository.findByname(course_name));
		semester_assignRepository.save(new_se);
	}
	public void UpdateSection(Section new_section) {
		//sectionRepository.update(new_section.getTitle(), new_section.getSeatCapacity(), new_section.getFaculty(), title);
		sectionRepository.save(new_section);
	}
	public void UpdateRegistraRecord(RegistraRecord new_record) {
		//registraRecordRepository.update(new_record.getCRN(), new_record.getCourse(), new_record.getSection(), courseRepository.findBycid(course_id), sectionRepository.findBytitle(sec_title));
		registraRecordRepository.save(new_record);
	}
	public void Updateenroll(Enroll new_enroll) {
		//enrollRepository.update(new_enroll.getFinalGrade(), new_enroll.getLetterGrade(), new_enroll.getStudentFeedback(), new_enroll.getDetailedGrade(), new_enroll.getStudent(), new_enroll.getSection(), studentRepository.findBysid(stu_id), sectionRepository.findBytitle(sec_title));
		enrollRepository.save(new_enroll);
	}
	
	//list function
	public List<EmploymentRecord> findallemploy() {
		return (List<EmploymentRecord>) employmentrecordRepository.findAll();
	}
	public List<Enroll> findEnrollByStudent(Student student) {
		return enrollRepository.findEnrollByStudent(student);
	}
	public Widget findwidgetByname(String name) {
		return widgetRepository.findByname(name);
	}
	public Evaluation findevaluationByname(String name) {
		return evaluationRepository.findByname(name);
	}
	public Exam findexamByname(String name) {
		return examRepository.findByname(name);
	}
	public Enroll findenrollBysands(Student student, Section section) {
		return enrollRepository.findBypands(student, section);
	}
	public RegistraRecord findRegistrarecordBy(Section section, Course course) {
		return registraRecordRepository.findBycands(course, section);
	}
	public Semester_assignment findsemester_assignBycands(Course course, Semester semester) {
		return semester_assignRepository.findBycands(course, semester);
	}
	public EmploymentRecord findrecordBypands(PersonProfile person, Section section) {
		return employmentrecordRepository.findBypands(person, section);
	}
	public Department_assignment finddepartment_assignBypands(PersonProfile person, Department department) {
		return department_assignRepository.findBypandd(person, department);
	}
	
	public Phones findphoneBypandp(PersonProfile person, String o_phone) {
		return phoneRepository.findBypandp(person, o_phone);
	}
	public Address findaddressBypanda(PersonProfile person, String o_address) {
		return addressRepository.findBypanda(person, o_address);
	}
	public EmploymentRecord findemplotrecordBypands(PersonProfile person, Section section) {
		return employmentrecordRepository.findBypands(person, section);
	}
	public Course findcourseByname(String name) {
		return courseRepository.findByname(name);
	}
	public Section findsectionByname(String title) {
		return sectionRepository.findBytitle(title);
	}
	public Semester findsemesterByname(String semester) {
		return semesterRepository.findByname(semester);
	}
	public PersonProfile findpersonByid(Integer person_id) {
		return personRepository.findBypid(person_id);
	}
	public Student findstudentByid(Integer stu_id) {
		return studentRepository.findBysid(stu_id);
	}
	public Faculty findfacultyByid(Integer fac_id) {
		return facultyRepository.findByfpid(fac_id);
	}
	public Department finddepartmentByname(String name) {
		return departmentRepository.findByname(name);
	}
	public List<PersonProfile> findAllPerson(){
		return (List<PersonProfile>) personRepository.findAll();
	}
	
	public List<Faculty> findAllFaculty() {
		return (List<Faculty>) facultyRepository.findAll();
	}

	public List<Student> findAllStudents() {
		return (List<Student>) studentRepository.findAll();
	}

	public List<Course> findAllCourses() {
		return (List<Course>) courseRepository.findAll();
	}
	
	public List<Section> findAllSections() {
		return (List<Section>) sectionRepository.findAll();
	}
	
	public List<Enroll> findAllEnroll(){
		return (List<Enroll>) enrollRepository.findAll();
	}
	
}
