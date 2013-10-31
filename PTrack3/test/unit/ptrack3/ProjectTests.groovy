package ptrack3



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Project)
@Mock(User)
class ProjectTests {
	
/*	User u
	//@Before
	void setUp()  {
		u = new User(userName: 'John', fullName: 'John Doe', password: 'abc123').save() 
	}
	
	void tearDown() {
	}
	
	*/

    void testforValid() {
       def u = new User(userName: 'John', fullName: 'John Doe', password: 'abc123').save() 
	   def p = new Project(name: 'End of semester project',
		                   dueDate:  new Date() + 10,
						   description: "Main course project",
						   owner: u)
	   assert p.validate(): "The project validations should be correct for a valid object"
    }
}
