package pattern.state.requestform;

import java.util.List;

public interface RequestState {

    void getDescription();
    List<RequestState> getAvailableNextState();
    RequestState nextState(RequestState requestState) throws ChangeStateException;
}
