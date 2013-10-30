package ptrack3

class User {
	String userName
	String password
	String fullName

	static hasMany = [projects : Project, tasks : Task]

	static constraints = {
		userName(blank:false, unique:true)
		fullName()
		password(blank:false)
	}
}
