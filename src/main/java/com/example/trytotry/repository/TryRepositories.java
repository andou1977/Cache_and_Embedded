package com.example.trytotry.repository;

import com.example.trytotry.entity.TryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TryRepositories extends JpaRepository<TryEntity,Integer> {
}
