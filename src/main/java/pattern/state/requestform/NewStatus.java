package pattern.state.requestform;

import java.util.Arrays;
import java.util.List;

public class NewStatus implements RequestState {

    @Override
    public void getDescription() {
        System.out.println("Статус НОВЫЙ");
    }

    @Override
    public List<RequestState> getAvailableNextState() {
        return Arrays.asList(new ProcessStatus(), new ErrorStatus());
    }

    @Override
    public RequestState nextState(RequestState requestState) throws ChangeStateException {
            if (requestState instanceof ProcessStatus || requestState instanceof ErrorStatus){
                return requestState;
            }
            throw new ChangeStateException("Статус нельзя изменить");

    }
}
