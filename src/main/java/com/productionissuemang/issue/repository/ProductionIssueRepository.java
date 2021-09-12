package com.productionissuemang.issue.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.productionissuemang.issue.entity.ProductionIssue;

@Repository
public interface ProductionIssueRepository extends JpaRepository<ProductionIssue, Long> {

    ProductionIssue findByProductionIssueId(Long issueId);
    
    }
