package com.officesuite.ticketer.adapters.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.security.Timestamp;

/**
 * Entity representing an issue in the persistence layer.
 * Maps to the 'issue_entity' table in the database.
 * Implements Serializable for object serialization.
 */
@Entity
@Table(name = "issue_entity")
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("LombokGetterMayBeUsed,LombokSetterMayBeUsed")
public class IssueEntity implements Serializable {

    /**
     * Serial version UID for serialization.
     */
    @Serial
    private static final long serialVersionUID = -3168405074368704005L;

    /**
     * Primary key for the issue entity (auto-generated).
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * Unique identifier for the issue (business key).
     */
    @Column(name = "issue_id", nullable = false, unique = true)
    private String issueId;

    /**
     * Identifier for the project to which this issue belongs.
     */
    @Column(name = "project_id", nullable = false)
    private String projectId;

    /**
     * Title or summary of the issue.
     */
    @Column(name = "title", nullable = false)
    private String title;

    /**
     * Detailed description of the issue.
     */
    @Column(name = "description")
    private String description;

    /**
     * Type of the issue (e.g., bug, feature, task).
     */
    @Column(name = "type", nullable = false)
    private String type;

    /**
     * Status identifier referencing the current status of the issue.
     */
    @Column(name = "status_id", nullable = false)
    private long statusId;

    /**
     * Priority level of the issue (e.g., high, medium, low).
     */
    @Column(name = "priority")
    private String priority;

    /**
     * Identifier of the user assigned to resolve the issue.
     */
    @Column(name = "assignee_id")
    private String assigneeId;

    /**
     * Identifier of the user who reported the issue.
     */
    @Column(name = "reporter_id")
    private String reporterId;

    /**
     * Identifier of the sprint to which this issue is assigned.
     */
    @Column(name = "sprint_id")
    private String sprintId;

    /**
     * JSON or serialized string representing custom fields for the issue.
     */
    @Column(name = "custom_fields")
    private String customFields;

    /**
     * Timestamp when the issue was created.
     */
    @Column(name = "created_at", nullable = false)
    private Timestamp createdAt;

    /**
     * Identifier for the institution or organization owning the issue.
     */
    @Column(name = "institution_id", nullable = false)
    private String institutionId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getStatusId() {
        return statusId;
    }

    public void setStatusId(long statusId) {
        this.statusId = statusId;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getAssigneeId() {
        return assigneeId;
    }

    public void setAssigneeId(String assigneeId) {
        this.assigneeId = assigneeId;
    }

    public String getReporterId() {
        return reporterId;
    }

    public void setReporterId(String reporterId) {
        this.reporterId = reporterId;
    }

    public String getSprintId() {
        return sprintId;
    }

    public void setSprintId(String sprintId) {
        this.sprintId = sprintId;
    }

    public String getCustomFields() {
        return customFields;
    }

    public void setCustomFields(String customFields) {
        this.customFields = customFields;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public String getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(String institutionId) {
        this.institutionId = institutionId;
    }
}