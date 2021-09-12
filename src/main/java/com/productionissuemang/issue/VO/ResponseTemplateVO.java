package com.productionissuemang.issue.VO;


import com.productionissuemang.issue.entity.ProductionIssue;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

    private Project project;
    private ProductionIssue productionIssue;
	
}
