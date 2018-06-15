package hello.ooad;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;

@Entity
public class Teacher extends DomainObject{
	private String name;
	private Date birthday;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	private Address address = new Address();

	@OneToMany(mappedBy="teacher")
	private Collection<Course> courses = new ArrayList<Course>();

	public Teacher(){}
	public Teacher(String name) {
        this.name = name;
	}

	public Collection<Course> getCourse(){
		return courses;
	}

	public void addCourse(Course course){
		courses.add(course);
		course.setTeacher(this);
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return the gender
	 */
	public Gender getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}

	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
}