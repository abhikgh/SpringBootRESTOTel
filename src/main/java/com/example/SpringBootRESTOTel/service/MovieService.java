package com.example.SpringBootRESTOTel.service;

import io.jaegertracing.internal.JaegerTracer;
import com.example.SpringBootRESTOTel.entity.Movie;
import com.example.SpringBootRESTOTel.repository.MovieRepository;
import io.opentracing.Span;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;

	public List<Movie> getMoviesOfDirector(String director) {
		log.info("Inside getMoviesOfDirector service... ");
		List<Movie> movies =  movieRepository.findByDirector(director);
		return movies;
	}

}
