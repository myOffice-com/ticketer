package com.officesuite.ticketer.adapters.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "workflow_entity")
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("LombokGetterMayBeUsed,LombokSetterMayBeUsed")
public class WorkflowEntity implements Serializable {

    /**
     * Serial version UID for serialization.
     */
    @Serial
    private static final long serialVersionUID = 5686368155884725373L;

    /**
     * Primary key for the workflow entity (auto-generated).
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * Unique identifier for the project associated with this workflow.
     */
    @Column(name = "project_id", nullable = false, unique = true)
    private String projectId;

    /**
     * Identifier for the institution to which this workflow belongs.
     */
    @Column(name = "name", nullable = false)
    private String institutionId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getInstitutionId() {
        return institutionId;
    }

    public void setInstitutionId(String institutionId) {
        this.institutionId = institutionId;
    }
}
