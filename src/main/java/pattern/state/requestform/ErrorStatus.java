package pattern.state.requestform;

import java.util.Collections;
import java.util.List;

public class ErrorStatus implements RequestState {
    @Override
    public void getDescription() {
        System.out.println("Произошла ошибка во время обработки Вашего запроса....");
    }

    @Override
    public List<RequestState> getAvailableNextState() {
        return Collections.emptyList();
    }

    @Override
    public RequestState nextState(RequestState requestState) throws ChangeStateException {
        throw new ChangeStateException("Статус нельзя изменить");
    }
}
