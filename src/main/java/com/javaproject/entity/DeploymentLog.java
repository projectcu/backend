package com.javaproject.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "deployment_logs")
public class DeploymentLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deployment_id")
    private Long deploymentId;

    @Column(name = "service_name")
    private String serviceName;

    @Column(name = "environment")
    private String environment;

    @Column(name = "image_tag")
    private String imageTag;

    @Column(name = "deployment_status")
    private String deploymentStatus;

    @Column(name = "deployment_message")
    private String deploymentMessage;

    @Column(name = "deployed_at")
    private LocalDateTime deployedAt = LocalDateTime.now();

    // getters & setters
}
