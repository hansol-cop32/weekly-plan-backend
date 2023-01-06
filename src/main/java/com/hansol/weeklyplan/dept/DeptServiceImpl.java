package com.hansol.weeklyplan.dept;

import com.hansol.weeklyplan.dept.dto.DeptRequest;
import com.hansol.weeklyplan.dept.dto.DeptResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@Transactional(readOnly = true)
public class DeptServiceImpl implements DeptService{

    @Override
    public DeptResponse findDept(Long deptId) {
        return null;
    }

    @Override
    public List<DeptResponse> findDepts(Long deptId) {
        return null;
    }

    @Override
    @Transactional
    public Long addDept(DeptRequest deptRequest) {
        return null;
    }

    @Override
    @Transactional
    public Long modifyDept(Long deptId, DeptRequest deptRequest) {
        return null;
    }

    @Override
    @Transactional
    public Long deleteDept(Long deptId) {
        return null;
    }
}
