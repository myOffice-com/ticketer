package com.officesuite.ticketer.config;

import com.officesuite.ticketer.application.port.in.CreateIssueUseCase;
import com.officesuite.ticketer.application.port.out.IssueRepository;
import com.officesuite.ticketer.application.service.CreateIssueService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IssueBeanConfig {

    @Bean
    public CreateIssueUseCase createIssueUseCase(IssueRepository issueRepository) {
        return new CreateIssueService(issueRepository);
    }

}
