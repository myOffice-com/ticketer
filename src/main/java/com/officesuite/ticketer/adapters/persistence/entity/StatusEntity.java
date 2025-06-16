package com.officesuite.ticketer.adapters.persistence.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "status_entity")
@SuppressWarnings("LombokGetterMayBeUsed,LombokSetterMayBeUsed")
public class StatusEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 2442787529559428519L;

    /**
     * Primary key - Unique identifier for the status.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * name of the status
     */
    @Column(name = "name")
    private String name;

    /**
     *it is unique work flow id
     */
    @Column(name = "work_flow_id")
    private Long workFlowId;

    /**
     *this is the initial status in the workflow.
     */
    @Column(name = "is_initial")
    private boolean isInitial;

    /**
     *this is the colour of the status.
     */
    @Column(name = "colour")
    private String colour;


    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getWorkFlowId() {
        return workFlowId;
    }

    public void setWorkFlowId(Long workFlowId) {
        this.workFlowId = workFlowId;
    }

    public boolean isInitial() {
        return isInitial;
    }

    public void setInitial(boolean initial) {
        isInitial = initial;
    }
}
