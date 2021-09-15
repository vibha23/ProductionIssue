package com.productionissuemang.issue.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "productionIssue")
@AllArgsConstructor
@NoArgsConstructor
public class ProductionIssue {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long productionIssueId;
    @Column(nullable = false,length = 100)
    private String issuetitle;
    @Column(nullable = false,length = 150)
    private String rootCause;
    @Column(nullable = false,length = 200)
    private String issueDescription;
    @Column(nullable = false,length = 100)
    private String comment;
   
	
}
