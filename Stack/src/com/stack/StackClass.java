package com.stack;

import java.time.LocalDate;

public class StackClass {

	//registrationId, name, email, password, dateOfBirth, aadharId, phone number,  graduationDate, degree(enum)

			private String registrantionId;
			private String name;
			private String email;
			private String password;
			private LocalDate graduationDate;
			private String aadharId;
			private String phone;
			private Degree degree;
			private LocalDate dateOfBirth;
			
			public StackClass() {
				super();
			}

			public StackClass(String registrantionId, String name, String email, String password, LocalDate graduationDate,
					String aadharId, String phone, Degree degree, LocalDate dateOfBirth) {
				super();
				this.registrantionId = registrantionId;
				this.name = name;
				this.email = email;
				this.password = password;
				this.graduationDate = graduationDate;
				this.aadharId = aadharId;
				this.phone = phone;
				this.degree = degree;
				this.dateOfBirth = dateOfBirth;
			}

			public String getRegistrantionId() {
				return registrantionId;
			}

			public void setRegistrantionId(String registrantionId) {
				this.registrantionId = registrantionId;
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

			public String getPassword() {
				return password;
			}

			public void setPassword(String password) {
				this.password = password;
			}

			public LocalDate getGraduationDate() {
				return graduationDate;
			}

			public void setGraduationDate(LocalDate graduationDate) {
				this.graduationDate = graduationDate;
			}

			public String getAadharId() {
				return aadharId;
			}

			public void setAadharId(String aadharId) {
				this.aadharId = aadharId;
			}

			public String getPhone() {
				return phone;
			}

			public void setPhone(String phone) {
				this.phone = phone;
			}

			public Degree getDegree() {
				return degree;
			}

			public void setDegree(Degree degree) {
				this.degree = degree;
			}

			public LocalDate getDateOfBirth() {
				return dateOfBirth;
			}

			public void setDateOfBirth(LocalDate dateOfBirth) {
				this.dateOfBirth = dateOfBirth;
			}

			@Override
			public String toString() {
				return "JobSeeker [registrantionId=" + registrantionId + ", name=" + name + ", email=" + email + ", password="
						+ password + ", graduationDate=" + graduationDate + ", aadharId=" + aadharId + ", phone=" + phone
						+ ", degree=" + degree + ", dateOfBirth=" + dateOfBirth + "]";

			}
			
}
