package com.example.ems.converter;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.ems.dto.AdminDTO;
import com.example.ems.entities.Admin;



@Component
public class AdminConverter {
	@Autowired 
	private ModelMapper modelmapper;
	
	 public AdminDTO toDto(Admin admin) {
	        AdminDTO dto = this.modelmapper.map(admin, AdminDTO.class);
//        dto.setId(admin.getId());
//        dto.setName(admin.getName());
//        dto.setUsername(admin.getUsername());
//        dto.setEmail(admin.getEmail());
//        dto.setRole(admin.getRole());
        return dto;
    }
	 public List<AdminDTO> toDto(List<Admin> admin)
		{
			return admin.stream().map(x-> toDto(x)).collect(Collectors.toList());
		}
	    
	  public Admin toEntity(AdminDTO dto) {
	        Admin admin = this.modelmapper.map(dto,Admin.class);
//        admin.setId(dto.getId());
//        admin.setName(dto.getName());
//        admin.setUsername(dto.getUsername());
//        admin.setEmail(dto.getEmail());
//        admin.setRole(dto.getRole());
        return admin;
    }
	  public List<Admin> toEntity(List<AdminDTO> dto)
		{
			return dto.stream().map(x->toEntity(x)).collect(Collectors.toList());
		}
}
