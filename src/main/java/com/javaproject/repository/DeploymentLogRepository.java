package com.javaproject.repository;

import com.javaproject.entity.DeploymentLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeploymentLogRepository extends JpaRepository<DeploymentLog, Long> {
}
