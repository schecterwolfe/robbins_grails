package ptrack3



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(User)
class UserTests {

    void testValid() {
       def u = new User(userName: 'John', fullName: 'John Doe', password: 'abc123').save()   
	   assert u != null : "It should be able to save a valid user object"  
	   assert u.userName == 'John' : "It should have the correct user name"     
	   assert u.validate() : "The validations should be correct"
    }
}
