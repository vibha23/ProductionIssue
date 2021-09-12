package com.productionissuemang.issue.service;

import com.productionissuemang.issue.VO.Project;
import com.productionissuemang.issue.VO.ResponseTemplateVO;
import com.productionissuemang.issue.entity.ProductionIssue;
import com.productionissuemang.issue.repository.ProductionIssueRepository;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class ProductionIssueService {

    @Autowired
    private ProductionIssueRepository productionIssueRepository;
    
    @Autowired
    private RestTemplate restTemplate;

    public ProductionIssue saveIssue(ProductionIssue productionIssue) {
        log.info("Inside saveIssue of ProductionIssueService");
        return productionIssueRepository.save(productionIssue);
    }
    
    public List<ProductionIssue> findAllProductionIssue() {
        log.info("Inside findAllProductionIssue of ProductionIssueService");
        return productionIssueRepository.findAll();
    }
    
    public ResponseTemplateVO getIssueWithProject(Long productionIssueId) {
    log.info("Inside getIssueWithProject of ProductionIssueService");
    ResponseTemplateVO vo = new ResponseTemplateVO();
    ProductionIssue productionIssue = productionIssueRepository.findByProductionIssueId(productionIssueId);

//    Project project =
//            restTemplate.getForObject("http://PROJECT-SERVICE/project/" + productionIssue.getProjectId()
//                    ,Project.class);
    
    Project project =
            restTemplate.getForObject("http://localhost:9002/project/" + productionIssue.getProjectId()
                    ,Project.class);

    vo.setProject(project);
    vo.setProductionIssue(productionIssue);

    return  vo;
    }

    public ProductionIssue findByProductionIssueId(Long productionIssueId) {
        log.info("Inside findByProductionIssueId of ProductionIssueService");
        return productionIssueRepository.findByProductionIssueId(productionIssueId);
    }
}
