package ptrack3

class Project {
	String name
	String description
	Date dueDate

	static belongsTo = [owner: User]
	static hasMany = [tasks: Task]

	static constraints = {
		name(blank: false, unique:true)
		dueDate()
		description()
	}
}
