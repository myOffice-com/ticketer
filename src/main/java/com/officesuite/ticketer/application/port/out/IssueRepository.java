package com.officesuite.ticketer.application.port.out;

import com.officesuite.ticketer.domain.model.Issue;

public interface IssueRepository {

    Issue save(Issue issue);

    Issue findById(String id);

    void deleteById(String id);

}
