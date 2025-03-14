package ch12;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

//DTO
@Data
@AllArgsConstructor
@NoArgsConstructor 
@Builder
public class Member {
	private  String id;
	
	private String name;
	private int age;
	
}
