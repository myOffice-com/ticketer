package com.officesuite.ticketer.application.service;

import com.officesuite.ticketer.application.port.in.CreateIssueCommand;
import com.officesuite.ticketer.application.port.in.CreateIssueUseCase;
import com.officesuite.ticketer.application.port.out.IssueRepository;
import com.officesuite.ticketer.domain.model.Issue;

public class CreateIssueService implements CreateIssueUseCase {

    private final IssueRepository issueRepository;

    public CreateIssueService(IssueRepository issueRepository) {
        this.issueRepository = issueRepository;
    }

    /**
     * Creates a new issue based on the provided command.
     *
     * @param createIssueCommand the command containing issue details
     */
    @Override
    public void createIssue(CreateIssueCommand createIssueCommand) {
        issueRepository.save(new Issue(createIssueCommand));
    }



}
