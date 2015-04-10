package collab.todo

class Todo {

    User owner;
    Category category;
    String name;
    String note;
    Date createdDate;
    Date dueDate;
    Date completedDate;
    String priority;
    String status;


    static belongsTo = [User, Category];
    static constraints = {
        name(blank:false)
        createdDate()
        priority()
        status()
        note(maxSize: 1000, nullable: true);
        completedDate(nullable: true);
        dueDate(nullable: true);
    }
}