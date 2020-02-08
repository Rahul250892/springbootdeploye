package com.spring.reposistory;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.domain.ProjectTask;

@Repository
public interface ProjectTaskRepository extends CrudRepository<ProjectTask, Long> {

    ProjectTask getById(Long id);
}
