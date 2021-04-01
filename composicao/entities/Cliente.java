package entities;


import java.util.Date;
import java.text.SimpleDateFormat;


public class Cliente {
		
		private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");		
		
		private String name;
		private String email;
		private Date dateAniversario;		
		
		public Cliente () {
			
		}
		
		public Cliente(String name, String email, Date dataAniversario) {
			this.name = name;
			this.email = email;
			this.dateAniversario = dateAniversario;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Date getDataAniversario() {
			return dateAniversario;
		}

		public void setDataAniversario(Date dataAniversario) {
			this.dateAniversario = dataAniversario;
		}

		public String toString() {
			return name + " (" + sdf.format(dateAniversario) + ") - " + email;
	 	}			
		
	

}


