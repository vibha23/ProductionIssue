package com.productionissuemang.issue.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Data
@AllArgsConstructor
@NoArgsConstructor
public class Project {

    
    private Long projectId;
    private String projectName;
    private String Description;
	
    
}
