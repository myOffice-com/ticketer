package com.officesuite.ticketer.adapters.persistence.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "work_flow_transactions_entity")
@SuppressWarnings("LombokGetterMayBeUsed,LombokSetterMayBeUsed")
public class WorkFlowTransactionsEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 5617898850439982532L;

    /**
     * Primary key - Unique identifier for the status.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * ID of the status from which the transition starts.
     */
    @Column(name = "from_status_id")
    private Long fromStatusId;

    /**
     * ID of the status to which the transition ends.
     */
    @Column(name = "to_status_id")
    private Long toStatusId;

    /**
     * Name or label of the transition (e.g., "Approve", "Reject").
     */
    @Column(name = "transaction_name")
    private String transactionName;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getToStatusId() {
        return toStatusId;
    }

    public void setToStatusId(Long toStatusId) {
        this.toStatusId = toStatusId;
    }

    public Long getFromStatusId() {
        return fromStatusId;
    }

    public void setFromStatusId(Long fromStatusId) {
        this.fromStatusId = fromStatusId;
    }

    public String getTransactionName() {
        return transactionName;
    }

    public void setTransactionName(String transactionName) {
        this.transactionName = transactionName;
    }
}
