package service;

public class Feedback {
    String feedback_id;
    String feedback;
    Interviewer interviewer;
    public String getFeedback_id() {
        return feedback_id;
    }

    public void setFeedback_id(String feedback_id) {
        this.feedback_id = feedback_id;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    public Feedback getFeedbackOfInterviewer()
    {
     return null;
    }

}
