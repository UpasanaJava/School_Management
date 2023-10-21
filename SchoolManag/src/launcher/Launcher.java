package launcher;

import datamodel.Enrollment;

public class Launcher {
	public static void main(String[] a) {
		Enrollment enroll = new Enrollment();
		enroll.setEnrollId(202301);
		enroll.setDate(sdf.parse("01/01/2023"));
		enroll.setDetails("Fall 2023 enrollmenr");
		
		
		Students student= new Students();
		student.setStdId("F123");
		student.setName("Tom");
		student.setAge(20);
		
	}
}
