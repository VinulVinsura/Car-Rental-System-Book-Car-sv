package com.example.carrentalsystembookcarsv.repository;

import com.example.carrentalsystembookcarsv.entity.BookCarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookCarRepo extends JpaRepository<BookCarEntity,Integer> {
}
