package pattern.state.requestform;

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
}
