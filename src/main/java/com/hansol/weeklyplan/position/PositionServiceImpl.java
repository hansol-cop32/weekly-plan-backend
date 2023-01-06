package com.hansol.weeklyplan.position;

import com.hansol.weeklyplan.position.dto.PositionRequest;
import com.hansol.weeklyplan.position.dto.PositionResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@Transactional(readOnly = true)
public class PositionServiceImpl implements PositionService {
    @Override
    public List<PositionResponse> findPositions() {
        return null;
    }

    @Override
    public PositionResponse findPosition(Long positionId) {
        return null;
    }

    @Override
    @Transactional
    public Long addPosition(Long positionId) {
        return null;
    }

    @Override
    @Transactional
    public Long modifyPosition(Long positionId, PositionRequest positionRequest) {
        return null;
    }

    @Override
    @Transactional
    public Long deletePosition(Long positionId) {
        return null;
    }
}
