package com.officesuite.ticketer.adapters.persistence.mapper;

import com.officesuite.ticketer.adapters.persistence.entity.IssueEntity;
import com.officesuite.ticketer.domain.model.Issue;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IssueEntityMapper {

    IssueEntity toEntity(Issue issue);

    Issue toDomain(com.officesuite.ticketer.adapters.persistence.entity.IssueEntity issueEntity);
}
