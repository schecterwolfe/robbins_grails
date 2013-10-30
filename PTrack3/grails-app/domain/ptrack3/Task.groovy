package ptrack3

class Task {
	String name
	String description
	Date dueDate

	static belongsTo = [assignee: User, project: Project]

	static constraints = {
		name(blank: false)
		dueDate()
		description()
	}
}

