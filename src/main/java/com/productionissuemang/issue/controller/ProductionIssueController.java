package com.productionissuemang.issue.controller;

import com.productionissuemang.issue.VO.ResponseTemplateVO;
import com.productionissuemang.issue.entity.ProductionIssue;
import com.productionissuemang.issue.service.ProductionIssueService;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/productionissue")
@Slf4j
public class ProductionIssueController {

    @Autowired
    private ProductionIssueService productionIssueService;

    @PostMapping("/")
    public ProductionIssue saveProductionIssue(@RequestBody ProductionIssue productionIssue) {
        log.info("Inside saveProductionIssue method of ProductionIssueController");
        return  productionIssueService.saveIssue(productionIssue);
    }


    @GetMapping("/{id}")
    public ResponseTemplateVO getIssueWithProduct(@PathVariable("id") Long issueId) {
        log.info("Inside ProductionIssueController of ProductionIssueController");
        return productionIssueService.getIssueWithProject(issueId);
    }
    
    @GetMapping(path="/allissue")
    public  List<ProductionIssue> getIssue() {
        log.info("Inside getIssue of ProductionIssueController");
        return productionIssueService.findAllProductionIssue();
    }

}
