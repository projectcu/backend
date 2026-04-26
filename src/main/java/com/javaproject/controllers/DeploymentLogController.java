package com.javaproject.controllers;

import com.javaproject.entity.DeploymentLog;
import com.javaproject.repository.DeploymentLogRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/deployments")
public class DeploymentLogController {

    private final DeploymentLogRepository repository;

    public DeploymentLogController(DeploymentLogRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public DeploymentLog createDeploymentLog(@RequestBody DeploymentLog deploymentLog) {
        return repository.save(deploymentLog);
    }

    @GetMapping
    public List<DeploymentLog> getDeploymentLogs() {
        return repository.findAll();
    }
}
