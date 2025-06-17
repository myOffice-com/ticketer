package com.officesuite.ticketer.adapters.rest.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;

@Data
public class CreateIssueRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = 4379449320673135541L;

    private String projectId;
    private String title;
    private String description;
    private String type;
    private long statusId;
    private String priority;
    private String assigneeId;
    private String reporterId;
    private String sprintId;
    private String customFields;
    private Instant createdAt;
    private String institutionId;

}
