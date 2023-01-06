package com.hansol.weeklyplan.position;

import com.hansol.weeklyplan.position.dto.PositionRequest;
import com.hansol.weeklyplan.position.dto.PositionResponse;

import java.util.List;

public interface PositionService {

    List<PositionResponse> findPositions();

    PositionResponse findPosition(Long positionId);

    Long addPosition(Long positionId);

    Long modifyPosition(Long positionId, PositionRequest positionRequest);

    Long deletePosition(Long positionId);


}
