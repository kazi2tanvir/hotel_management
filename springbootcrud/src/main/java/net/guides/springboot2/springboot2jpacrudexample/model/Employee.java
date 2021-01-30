package net.guides.springboot2.springboot2jpacrudexample.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class Employee {

	private long id;
	private String fullName;
	private String emailId;
	private String address;
	private Number phone;
	private String roomNo;
	private Number guests;
	private String checkIn;
	private String checkOut;
	private Float salary;
	private Float advance;
	
	public Employee() {
		
	}
	
	public Employee(String fullName, String emailId, String address, Float Salary, Float Advance,
			Number phone, String roomNo, Number guests, String CheckIn, String CheckOut) {
		this.fullName = fullName;
		this.emailId = emailId;
		this.address = address;
		this.phone =phone;
		this.roomNo =roomNo;
		this.guests =guests;
		this.checkIn =CheckIn;
		this.checkOut =CheckOut;
		this.salary =Salary;
		this.advance =Advance;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "full_name", nullable = false)
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	
	@Column(name = "email_address", nullable = false)
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	@Column(name = "address", nullable = false)
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Column(name = "phone", nullable = false)
	public Number getPhone() {
		return phone;
	}
	public void setPhone(Number phone) {
		this.phone = phone;
	}
	
	@Column(name = "roomNo", nullable = false)
	public String getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}
	@Column(name = "guests", nullable = false)
	public Number getGuests() {
		return guests;
	}
	public void setGuests(Number guests) {
		this.guests = guests;
	}
	@Column(name = "checkIn", nullable = false)
	public String getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(String checkIn) {
		this.checkIn = checkIn;
	}
	@Column(name = "checkOut", nullable = false)
	public String getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(String checkOut) {
		this.checkOut = checkOut;
	}
	@Column(name = "salary", nullable = false)
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	
	@Column(name = "advance", nullable = false)
	public Float getAdvance() {
		return advance;
	}
	public void setAdvance(Float advance) {
		this.advance = advance;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fullName=" + fullName + ", "
		+ "emailId=" + emailId
		+ ", address=" + address + ", phone=" + phone + ", roomNO= " + roomNo +","
		+ "guests= " + guests +", checkIn=" + checkIn +", checkOut= " + checkOut + ""
		+ ", salary= " + salary +", advance= " + advance + "]";
	}
	
}
