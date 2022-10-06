package com.login_02.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Staff {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String staffName;
	private String password;
	private String role;

}
