package com.officesuite.ticketer.domain.model;

import com.officesuite.ticketer.application.port.in.CreateIssueCommand;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;

public record Issue(
        String issueId,
        String projectId,
        String title,
        String description,
        String type,
        long statusId,
        String priority,
        String assigneeId,
        String reporterId,
        String sprintId,
        String customFields,
        Instant createdAt,
        String institutionId
) implements Serializable {
    @Serial
    private static final long serialVersionUID = -2084633954005762027L;


    public Issue(CreateIssueCommand command) {
        this(
                command.getProjectId() + "0",
                command.getProjectId(),
                command.getTitle(),
                command.getDescription(),
                command.getType(),
                command.getStatusId(),
                command.getPriority(),
                command.getAssigneeId(),
                command.getReporterId(),
                command.getSprintId(),
                command.getCustomFields(),
                command.getCreatedAt(),
                command.getInstitutionId()
        );
    }
}