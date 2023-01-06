package com.hansol.weeklyplan.dept;

import com.hansol.weeklyplan.dept.dto.DeptRequest;
import com.hansol.weeklyplan.dept.dto.DeptResponse;

import java.util.List;

public interface DeptService {

    DeptResponse findDept(Long deptId);

    List<DeptResponse> findDepts(Long deptId);

    Long addDept(DeptRequest deptRequest);

    Long modifyDept(Long deptId, DeptRequest deptRequest);

    Long deleteDept(Long deptId);

}
