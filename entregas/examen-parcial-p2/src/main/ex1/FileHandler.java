
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class FileHandler {
	
	Person owner;
	Pet pet;
	//String time;
	String reason;
	
	public Appointment(Person owner, Pet pet, String date, String reason) throws ParseException {
		this.owner = owner;
		this.pet = pet;
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy, ", Locale.ENGLISH);
		
		//String dateInString = "7-Jun-2013";
		Date dat = formatter.parse(date);
		this.date =dat;
		//	this.time = time;
			this.reason = reason;
	}
	
	
	public Date getDate() {
			return this.getDate();
	}
	
	public Pet getPet() {
		return this.pet;
	}
	
	public String getReason() {
		return this.reason;
	}
}