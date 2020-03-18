package pattern.state.requestform;

import java.util.List;

public class RequestForm {

    private Long id;
    private String question;
    private String answer;
    private RequestState status;

    public RequestForm(Long id, String question) {
        this.id = id;
        this.question = question;
        this.status = new NewStatus();
    }

    public void setStatus(RequestState status) throws ChangeStateException {
        this.status = this.status.nextState(status);
        if (this.status instanceof FinalStatus) {
            this.answer = "Да, работает";
        }else  if (this.status instanceof ErrorStatus){
            this.answer = "Что-то пошло не так...";
        }
    }

    public Long getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public RequestState getStatus() {
            return status;
    }

    public List<RequestState> getNextAvailableStatus(){
        return status.getAvailableNextState();
    }
}
