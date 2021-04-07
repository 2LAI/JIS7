package homework.lectures.lecture4;

public enum Errors {

    FIRST_NAME_ERROR("Please, check your first name. The name must be no less than 3 and no more than 15 characters.\nTry again.\nEnter first name: "),
    LAST_NAME_ERROR("Please, check your last name. The name must be no less than 3 and no more than 15 characters.\nTry again.\nEnter last name: "),
    AGE_ERROR("Please, check your age. Age can be from 0 to 120.\nTry again.\nEnter age: ");

    public final String label;

    Errors(String label) {
        this.label = label;
    }
}


