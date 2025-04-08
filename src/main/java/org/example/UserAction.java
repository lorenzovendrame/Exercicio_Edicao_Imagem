package org.example;

public class UserAction {
    long id;
    String actionDescription;
    int actionId;

    public UserAction(long id, String actionDescription, int actionId) {
        this.actionDescription = actionDescription;
        this.actionId = actionId;
    }

    public String getActionDescription() {
        return actionDescription;
    }

    public void setActionDescription(String actionDescription) {
        this.actionDescription = actionDescription;
    }

    public int getActionId() {
        return actionId;
    }

    public void setActionId(int actionId) {
        this.actionId = actionId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  "Id: " + this.id + " \n" +
                "User Action Description: " + this.actionDescription + " \n" +
                "Action Id: " + this.actionId + "\n";
    }
}
