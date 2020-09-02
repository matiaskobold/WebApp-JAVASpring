package user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
		
		private Long id;
		private String firstName, lastName, username, mailAddress;
		
		public User() {
		}
		
		public User(Long id, String firstName, String lastName, String username, String mailAddress) {
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.username = username;
			this.mailAddress = mailAddress;
		}

		@Id
		@Column(name = "idUsers")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		
		@Column(name="first_name")
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
		@Column(name="last_name")
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		@Column(name="username")
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		
		
		@Column(name="mail_address")
		public String getMailAddress() {
			return mailAddress;
		}
		public void setMailAddress(String mailAddress) {
			this.mailAddress = mailAddress;
		}
		
}
