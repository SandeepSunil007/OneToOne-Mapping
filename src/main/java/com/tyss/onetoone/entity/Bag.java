package com.tyss.onetoone.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "BAG_TABLE")
public class Bag {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bagId;
	private String bagName;
	private String bagolor;

	// Uni_Directional, if the same code write to other entity class . it is called
	// By-Directional
//	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
//	@JoinColumn(name = "stuId")
//	private Student student;
}
