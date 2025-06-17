package com.officesuite.ticketer.adapters.persistence.repository;

import com.officesuite.ticketer.adapters.persistence.entity.IssueEntity;
import com.officesuite.ticketer.adapters.persistence.generators.IssueIdGenerator;
import com.officesuite.ticketer.adapters.persistence.mapper.IssueEntityMapper;
import com.officesuite.ticketer.application.port.out.IssueRepository;
import com.officesuite.ticketer.domain.model.Issue;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class JpaIssueRepository implements IssueRepository {

    private final SpringDataJpaIssueRepository springDataJpaIssueRepository;
    private final IssueEntityMapper issueEntityMapper;
    private final IssueIdGenerator issueIdGenerator;

    @Transactional
    @Override
    public Issue save(Issue issue) {
        IssueEntity issueEntity = issueEntityMapper.toEntity(issue);
        issueEntity.setIssueId(issueIdGenerator.generateIssueId(issueEntity.getProjectId()));
        issueEntity.setCreatedAt();
        issueEntity = springDataJpaIssueRepository.save(issueEntity);
        return issueEntityMapper.toDomain(issueEntity);
    }

    @Override
    public Issue findById(String id) {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }

}
