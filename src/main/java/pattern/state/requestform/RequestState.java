package pattern.state.requestform;

import java.util.List;

public interface RequestState {

    void getDescription();
    List<RequestState> getAvailableNextState();
    void nextState(RequestState requestState) throws ChangeStateException;
}
