package main.ex1;

public class Main1 {
	public static void main(String[] args) {
		veterinaryClinic clinic = new VeterinaryClinic();
		
		Pet pet = new Dog("Fido", "black", 2);
		Person owner = new Person("John", "Doe", "555-555-555");
		Appointment appointment = nwe Appointment(owner, pet, "11/10/2020", "10:00", "Radiology");
		clinic.addAppointment(appointment);
		
		Pet pet2 = new Cat("Garfield","orange", 4);
		Person owner2 = new Person("John", "Doe", "555-555-555");
		Appointment appointment2 = new Appointment(owner2, pet2, "10/10/2020", "09:00", "rabies shot");
		
		
		
		clinic.listAppointments();
	}

}
