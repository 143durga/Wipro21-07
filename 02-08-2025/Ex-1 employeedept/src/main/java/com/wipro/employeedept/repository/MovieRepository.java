package com.wipro.employeedept.repository;

import com.wipro.employeedept.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
