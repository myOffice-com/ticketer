package com.officesuite.ticketer.application.port.in;

public interface CreateIssueUseCase {

    CreateIssueResponse createIssue(CreateIssueCommand createIssueCommand);

}
