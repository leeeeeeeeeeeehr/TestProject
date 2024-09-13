package com.edu.springboot.lombok;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Data
//@AllArgsConstructor
//@Getter
//@Setter
public class MemberDTO {
	private String id;
	private String pass;
	private String name;
	private String regidate;
}
