package com.springms.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springms.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
