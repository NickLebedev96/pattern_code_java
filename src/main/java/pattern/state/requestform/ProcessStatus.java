package pattern.state.requestform;

import java.util.Arrays;
import java.util.List;

public class ProcessStatus implements RequestState{
    @Override
    public void getDescription() {
        System.out.println("Заявка находится в процессе");
    }

    @Override
    public List<RequestState> getAvailableNextState() {
        return Arrays.asList(new FinalStatus(), new ErrorStatus());
    }

    @Override
    public RequestState nextState(RequestState requestState) throws ChangeStateException {
        if (requestState instanceof FinalStatus || requestState instanceof ErrorStatus){
            return requestState;
        } else {
            throw new ChangeStateException("Статус нельзя изменить");
        }
    }
}
