package com.crud.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserForm {

	@Size(max = 25)
	@NotEmpty(message = "사용자 아이디를 입력해주세요.")
	private String username;
	
	@NotEmpty(message = "비밀번호를 입력해주세요.")
	private String password;
	
	@NotEmpty(message = "비밀번호를 한번 더 입력해주세요.")
	private String passwordAgain;
	
	@NotEmpty(message = "이메일을 입력해주세요.")
	@Email
	private String email;
}
