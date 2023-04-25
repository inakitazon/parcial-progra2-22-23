import java.util.ArrayList;

public class ManagementSystem {
	
	List<Appointment> appointments;
	List<Person> personas;
	List<Pet> mascotas,
	
	public veterinaryClinic() {
		
		this.appointments = new ArrayList<>();
		this.personas = new Arraylist<>();
		this.mascotas = new Arraylist<>();
	}
	
	public void addAppointment(Appointment appointment) {
		appointments.add(appointment);
	}
	
	pulic void listAppointments() {
		for (Appointment appointment : appointments) {
			//Date - Pet - Reason
			System.out.println(appointment.getDate()+ " - " + appointment.getPet() + " - " + appointment.getReason());
			}
	}
	
	
	public String muestraFechas() {
		
		ArrayList<Date> auxiliar = new ArrayList<>();
		
		
	}
	
	public Pet buscaMascota(Person p) {
		for(Pet mascota: mascotas) {
			if(mascota.getBueno().equals(p)) {
				return mascota
			}
			return null;
		}
	}
	}
	public boolean añade Mascota()