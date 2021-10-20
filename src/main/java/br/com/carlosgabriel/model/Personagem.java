package br.com.carlosgabriel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "personagens")

public class Personagem {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
 private int id;
 private String name;
 @Column(columnDefinition = "text not null")
 private String personality;
 @Column(columnDefinition = "text not null")
 private String appearance;

 
 
 public Personagem(int id, String name, String personality, String appearance) {
	this.id = id;
	this.name = name;
	this.personality = personality;
	this.appearance = appearance;
}
 public Personagem() {}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPersonality() {
	return personality;
}
public void setPersonality(String personality) {
	this.personality = personality;
}
public String getAppearance() {
	return appearance;
}
public void setAppearance(String appearance) {
	this.appearance = appearance;
}
 
 
 
}
