package com.officesuite.ticketer.adapters.persistence.repository;

import com.officesuite.ticketer.adapters.persistence.entity.IssueEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpringDataJpaIssueRepository extends JpaRepository<IssueEntity,Long> {
    long countAllByProjectId(String s);
}
