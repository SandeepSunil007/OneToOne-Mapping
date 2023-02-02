package com.tyss.onetoone.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class StudentReponse{
	private String mesage;
	private Boolean isError;
	private Object data;

}
