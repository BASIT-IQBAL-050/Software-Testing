/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Src;

/**
 *
 * @author BASIT
 */
import java.util.ArrayList;
import java.util.List;

public class AssignmentManager implements IAssignmentManager {
    private List<Assignment> assignments;

    public AssignmentManager() {
        this.assignments = new ArrayList<>();
    }

    @Override
    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
    }

    @Override
    public void deleteAssignment(String assignmentId) {
        Assignment assignmentToRemove = null;
        for (Assignment assignment : assignments) {
            if (assignment.getId().equals(assignmentId)) {
                assignmentToRemove = assignment;
                break;
            }
        }
        if (assignmentToRemove != null) {
            assignments.remove(assignmentToRemove);
        } else {
            System.out.println("Assignment with ID " + assignmentId + " not found.");
        }
    }
}

