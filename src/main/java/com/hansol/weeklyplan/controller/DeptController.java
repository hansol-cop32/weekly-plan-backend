package com.hansol.weeklyplan.controller;

import com.hansol.weeklyplan.dept.DeptService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/dept")
@RequiredArgsConstructor
public class DeptController {

    private DeptService deptService;

}
