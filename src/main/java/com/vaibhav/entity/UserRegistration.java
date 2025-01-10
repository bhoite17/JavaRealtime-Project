//User-Registration

package com.vaibhav.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="User-Details")
public class UserRegistration {
	@Id
	private Integer userId;
	private String userName;
	private String emailId;
	private Long userContactNum;
	private String gender;
	private LocalDateTime userDOB;
	private Long adharNum;
	private String userPwd;
	private String active_Sw;
	
	private LocalDateTime creationDate;
	private LocalDateTime updationDate;
	private String createdBy;
	private String updatedBy;
	

}
