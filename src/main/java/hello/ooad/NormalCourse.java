package hello.ooad;

import javax.persistence.Entity;

@Entity
public class NormalCourse extends Course{
    private String classRoom;

	/**
	 * @return the classRoom
	 */
	public String getClassRoom() {
		return classRoom;
	}

	/**
	 * @param classRoom the classRoom to set
	 */
	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}


}