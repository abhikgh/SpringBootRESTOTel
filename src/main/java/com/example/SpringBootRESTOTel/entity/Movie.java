package com.example.SpringBootRESTOTel.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MOVIE_MASTER")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "movie_Id")
	private Integer movieId;
	
	@Column(name = "movie_Name")
	private String movieName;
	
	@Column(name = "director")
	private String director;
	
	@Column(name = "genre")
	private String genre;
	
	@Column(name = "hero")
	private String hero;
	
	@Column(name = "year")
	private String year;
	
	@Column(name = "national_Award")
	private Boolean nationalAward;
}
