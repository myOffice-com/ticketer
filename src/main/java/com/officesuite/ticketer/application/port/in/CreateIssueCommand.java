package com.officesuite.ticketer.application.port.in;

import com.officesuite.ticketer.adapters.rest.dto.CreateIssueRequest;

import java.security.Timestamp;

/**
 * Command object for creating an issue.
 * This class encapsulates the data required to create a new issue in the system.
 */
@SuppressWarnings("LombokGetterMayBeUsed")
public class CreateIssueCommand {

    private final String projectId;
    private final String title;
    private final String description;
    private final String type;
    private final long statusId;
    private final String priority;
    private final String assigneeId;
    private final String reporterId;
    private final String sprintId;
    private final String customFields;
    private final Timestamp createdAt;
    private final String institutionId;

    // Constructor using CreateIssueRequest
    public CreateIssueCommand(CreateIssueRequest request) {
        this.projectId = request.getProjectId();
        this.title = request.getTitle();
        this.description = request.getDescription();
        this.type = request.getType();
        this.statusId = request.getStatusId();
        this.priority = request.getPriority();
        this.assigneeId = request.getAssigneeId();
        this.reporterId = request.getReporterId();
        this.sprintId = request.getSprintId();
        this.customFields = request.getCustomFields();
        this.createdAt = request.getCreatedAt();
        this.institutionId = request.getInstitutionId();
    }

    public String getProjectId() {
        return projectId;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public long getStatusId() {
        return statusId;
    }

    public String getPriority() {
        return priority;
    }

    public String getAssigneeId() {
        return assigneeId;
    }

    public String getReporterId() {
        return reporterId;
    }

    public String getSprintId() {
        return sprintId;
    }

    public String getCustomFields() {
        return customFields;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public String getInstitutionId() {
        return institutionId;
    }
}