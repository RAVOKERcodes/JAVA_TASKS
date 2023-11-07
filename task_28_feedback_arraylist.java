package TASK;

import java.util.ArrayList;
import java.util.List;

class Feedback {
    private int feedbackId;
    private String courseName;
    private int facultyId;
    private int feedbackRating;

    public Feedback(int feedbackId, String courseName, int facultyId, int feedbackRating) {
        this.feedbackId = feedbackId;
        this.courseName = courseName;
        this.facultyId = facultyId;
        this.feedbackRating = feedbackRating;
    }

    // Getter and Setter methods
    public int getFeedbackId() {
        return feedbackId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getFacultyId() {
        return facultyId;
    }

    public int getFeedbackRating() {
        return feedbackRating;
    }
}

class College {
    private List<Feedback> feedbackList = new ArrayList<Feedback>();

    // Getter and Setter for feedbackList
    public List<Feedback> getFeedbackList() {
        return feedbackList;
    }

    public void setFeedbackList(List<Feedback> feedbackList) {
        this.feedbackList = feedbackList;
    }

    // Method to add feedback
    public void addFeedback(Feedback feedbackObj) {
        feedbackList.add(feedbackObj);
    }

    // Method to view all feedbacks
    public List<Feedback> viewAllFeedbacks() {
        return feedbackList;
    }

    // Method to view feedback by course
    public List<Feedback> viewFeedbackByCourse(String courseName) {
        List<Feedback> feedbacksForCourse = new ArrayList<Feedback>();
        for (Feedback feedback : feedbackList) {
            if (feedback.getCourseName().equals(courseName)) {
                feedbacksForCourse.add(feedback);
            }
        }
        if (feedbacksForCourse.isEmpty()) {
            System.out.println("Invalid");
        }
        return feedbacksForCourse;
    }
}

public class task_28_feedback_arraylist {
    public static void main(String[] args) {
        // Create a College instance
        College college = new College();

        // Add feedback
        college.addFeedback(new Feedback(1, "Maths 101", 101, 4));
        college.addFeedback(new Feedback(2, "Physics 101", 102, 5));
        college.addFeedback(new Feedback(3, "Maths 101", 103, 3));

        // View all feedbacks
        List<Feedback> allFeedbacks = college.viewAllFeedbacks();
        System.out.println("All Feedbacks:");
        for (Feedback feedback : allFeedbacks) {
            System.out.println("Feedback ID: " + feedback.getFeedbackId() +
                               ", Course: " + feedback.getCourseName() +
                               ", Faculty ID: " + feedback.getFacultyId() +
                               ", Rating: " + feedback.getFeedbackRating());
        }

        // View feedback by course
        String courseToView = "Maths 101";
        List<Feedback> feedbacksForCourse = college.viewFeedbackByCourse(courseToView);
        System.out.println("\nFeedbacks for Course " + courseToView + ":");
        for (Feedback feedback : feedbacksForCourse) {
            System.out.println("Feedback ID: " + feedback.getFeedbackId() +
                               ", Faculty ID: " + feedback.getFacultyId() +
                               ", Rating: " + feedback.getFeedbackRating());
        }
    }
}