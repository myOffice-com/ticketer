package com.officesuite.ticketer.application.port.in;

import com.officesuite.ticketer.domain.model.Issue;

import java.time.Instant;

@SuppressWarnings("LombokGetterMayBeUsed")
public class CreateIssueResponse {

    private final String issueId;
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
    private final Instant createdAt;
    private final String institutionId;

    // Constructor that initializes fields from an Issue object
    public CreateIssueResponse(Issue issue) {
        this.issueId = issue.issueId();
        this.projectId = issue.projectId();
        this.title = issue.title();
        this.description = issue.description();
        this.type = issue.type();
        this.statusId = issue.statusId();
        this.priority = issue.priority();
        this.assigneeId = issue.assigneeId();
        this.reporterId = issue.reporterId();
        this.sprintId = issue.sprintId();
        this.customFields = issue.customFields();
        this.createdAt = issue.createdAt();
        this.institutionId = issue.institutionId();
    }

    public String getIssueId() {
        return issueId;
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

    public Instant getCreatedAt() {
        return createdAt;
    }

    public String getInstitutionId() {
        return institutionId;
    }
}