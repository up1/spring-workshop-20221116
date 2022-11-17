package com.somkiat.day2_tx.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepository extends JpaRepository<Employee, Integer> {
}
