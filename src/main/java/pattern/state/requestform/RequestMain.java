package pattern.state.requestform;

import java.util.List;

public class RequestMain {
    public static void main(String[] args) throws ChangeStateException {
        final RequestForm requestForm = new RequestForm(1L, "Смена статусов работает??");
        System.out.println(requestForm.getQuestion());
//        List<RequestState> nextAvailableStatus = requestForm.getNextAvailableStatus();
//        nextAvailableStatus.forEach(RequestState::getDescription);
        requestForm.getStatus().getDescription();

        requestForm.setStatus(new ProcessStatus());
        requestForm.getStatus().getDescription();

//        nextAvailableStatus = requestForm.getNextAvailableStatus();
//        nextAvailableStatus.forEach(RequestState::getDescription);


        requestForm.setStatus(new FinalStatus());
        requestForm.getStatus().getDescription();


        System.out.println(requestForm.getAnswer());
//        nextAvailableStatus = requestForm.getNextAvailableStatus();
//        nextAvailableStatus.forEach(RequestState::getDescription);

    }
}
