package com.officesuite.ticketer.adapters.rest.controller;

import com.officesuite.ticketer.adapters.rest.dto.CreateIssueRequest;
import com.officesuite.ticketer.application.port.in.CreateIssueCommand;
import com.officesuite.ticketer.application.port.in.CreateIssueResponse;
import com.officesuite.ticketer.application.port.in.CreateIssueUseCase;
import com.officesuite.ticketer.shared.responsebodies.CommonResponseBody;
import org.springframework.http.HttpStatus;
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
        CreateIssueResponse response = createIssueUseCase.createIssue(new CreateIssueCommand(createIssueRequest));
        return new ResponseEntity<>(new CommonResponseBody("Issue created successfully", response), HttpStatus.CREATED);
    }

}
