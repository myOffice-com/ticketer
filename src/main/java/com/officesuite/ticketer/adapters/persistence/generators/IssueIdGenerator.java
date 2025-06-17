package com.officesuite.ticketer.adapters.persistence.generators;

import com.officesuite.ticketer.adapters.persistence.repository.SpringDataJpaIssueRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class IssueIdGenerator {

    private final SpringDataJpaIssueRepository springDataJpaIssueRepository;

    public String generateIssueId(String projectId) {
        long count = springDataJpaIssueRepository.countAllByProjectId(projectId);
        return projectId + (count + 1);
    }

}
