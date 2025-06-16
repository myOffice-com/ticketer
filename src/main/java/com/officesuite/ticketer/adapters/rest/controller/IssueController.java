package com.officesuite.ticketer.adapters.rest.controller;

import com.officesuite.ticketer.adapters.rest.dto.CreateIssueRequest;
import com.officesuite.ticketer.application.port.in.CreateIssueCommand;
import com.officesuite.ticketer.application.port.in.CreateIssueUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/issues")
public class IssueController {

    private final CreateIssueUseCase createIssueUseCase;

    public IssueController(CreateIssueUseCase createIssueUseCase) {
        this.createIssueUseCase = createIssueUseCase;
    }

    @PostMapping("/create")
    public ResponseEntity<Object> createIssue(@RequestBody CreateIssueRequest createIssueRequest) {
        createIssueUseCase.createIssue(new CreateIssueCommand(createIssueRequest));
        return ResponseEntity.status(201).build();
    }

}
