package realProject;

public class Question {
    private int id;
    private String question;
    private String options;
    private String options1;
    private String options2;
    private String options3;
    private String answer;

    public Question(int id, String question, String options, String options1, String options2, String options3, String answer) {
        this.id = id;
        this.question = question;
        this.options = options;
        this.options1 = options1;
        this.options2 = options2;
        this.options3 = options3;
        this.answer = answer;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public void setOptions1(String options1) {
        this.options1 = options1;
    }

    public void setOptions2(String options2) {
        this.options2 = options2;
    }

    public void setOptions3(String options3) {
        this.options3 = options3;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String getOptions() {
        return options;
    }

    public String getOptions1() {
        return options1;
    }

    public String getOptions2() {
        return options2;
    }

    public String getOptions3() {
        return options3;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", options='" + options + '\'' +
                ", options1='" + options1 + '\'' +
                ", options2='" + options2 + '\'' +
                ", options3='" + options3 + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
