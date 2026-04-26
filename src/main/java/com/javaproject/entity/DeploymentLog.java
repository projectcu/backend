package com.javaproject.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "deployment_logs")
public class DeploymentLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "deployment_id")
    private Long deploymentId;

    @Column(name = "service_name", nullable = false)
    private String serviceName;

    @Column(name = "environment", nullable = false)
    private String environment;

    @Column(name = "image_tag")
    private String imageTag;

    @Column(name = "deployment_status")
    private String deploymentStatus;

    @Column(name = "deployment_message")
    private String deploymentMessage;

    @Column(name = "deployed_at")
    private LocalDateTime deployedAt = LocalDateTime.now();

    public Long getDeploymentId() { return deploymentId; }
    public void setDeploymentId(Long deploymentId) { this.deploymentId = deploymentId; }

    public String getServiceName() { return serviceName; }
    public void setServiceName(String serviceName) { this.serviceName = serviceName; }

    public String getEnvironment() { return environment; }
    public void setEnvironment(String environment) { this.environment = environment; }

    public String getImageTag() { return imageTag; }
    public void setImageTag(String imageTag) { this.imageTag = imageTag; }

    public String getDeploymentStatus() { return deploymentStatus; }
    public void setDeploymentStatus(String deploymentStatus) { this.deploymentStatus = deploymentStatus; }

    public String getDeploymentMessage() { return deploymentMessage; }
    public void setDeploymentMessage(String deploymentMessage) { this.deploymentMessage = deploymentMessage; }

    public LocalDateTime getDeployedAt() { return deployedAt; }
    public void setDeployedAt(LocalDateTime deployedAt) { this.deployedAt = deployedAt; }
}
