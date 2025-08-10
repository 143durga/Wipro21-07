package com.wipro.employeedept.repository;

import com.wipro.employeedept.entity.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Long> {
}
