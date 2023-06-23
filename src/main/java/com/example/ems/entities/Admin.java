package com.example.ems.entities;





import javax.persistence.Entity;



import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;


    @NotBlank(message = "Username is required.")
    @Size(max = 100, message = "Username cannot exceed 100 characters.")
    private String username;
    @NotBlank(message = "Email is required.")
    @Email(message = "Invalid email format.")
    private String email;
    private String password;
   

//    @NotBlank(message = "Password is required.")
//    private String password;

//    // Additional admin attributes
//    private String role;
   
//    
//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "employee_id")
//    private Employee employee;
//    
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "project_id")
//    private Project project;

}