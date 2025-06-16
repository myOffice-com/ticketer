package com.officesuite.ticketer.adapters.persistence.repository;

import com.officesuite.ticketer.adapters.persistence.entity.IssueEntity;
import com.officesuite.ticketer.adapters.persistence.mapper.IssueEntityMapper;
import com.officesuite.ticketer.application.port.out.IssueRepository;
import com.officesuite.ticketer.domain.model.Issue;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class JpaIssueRepository implements IssueRepository {

    private final SpringDataJpaIssueRepository springDataJpaIssueRepository;
    private final IssueEntityMapper issueEntityMapper;

    @Override
    public void save(Issue issue) {
        IssueEntity issueEntity = issueEntityMapper.toEntity(issue);
        springDataJpaIssueRepository.save(issueEntity);
    }

    @Override
    public Issue findById(String id) {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }

}
