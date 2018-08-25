package com.classifiedadapp.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
@Table(name = "advertisements")
public class Advertisement extends AuditModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	
	@NotBlank
    @Size(min = 3, max = 100)
	private String title;
	
	
	private float price;
	
	
	private float version;
	
	@Lob
	private Byte[] image;
	
	@Column(columnDefinition = "text")
	private String description;

	
	public  Advertisement() {
		// TODO Auto-generated constructor stub
	}


	public Advertisement(@NotBlank @Size(min = 3, max = 100) String title, float price, String description) {
		this.title = title;
		this.price = price;
		this.description = description;
	}


	public float getPrice() {
		return price;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public void setPrice(float price) {
		this.price = price;
	}


	public float getVersion() {
		return version;
	}


	public void setVersion(float version) {
		this.version = version;
	}


	public Byte[] getImage() {
		return image;
	}


	public void setImage(Byte[] image) {
		this.image = image;
	}


	












	/*@Column(columnDefinition = "text")
	private String description;*/

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


}
