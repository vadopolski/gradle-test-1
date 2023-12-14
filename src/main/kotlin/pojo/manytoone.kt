package pojo

object manytoone {

/**
 *
 * A many-to-one association is the most common kind of association where an Object can be associated with multiple objects.
 * For example, the same address object can be associated with multiple employee objects.
 *
    create table EMPLOYEE (
    id                  INT NOT NULL auto_increment,
    first_name          VARCHAR(20) default NULL,
    last_name           VARCHAR(20) default NULL,
    salary              INT  default NULL,
    address_id          INT NOT NULL, -- foreign key
    PRIMARY KEY (id)
    );

    create table ADDRESS (
    id INT NOT NULL auto_increment,
    street_name VARCHAR(40) default NULL,
    city_name VARCHAR(40) default NULL,
    state_name VARCHAR(40) default NULL,
    zipcode VARCHAR(10) default NULL,
    PRIMARY KEY (id)
    );

*/


    data class Employee(
        var id: Int = 0,
        var firstName: String,
        var lastName: String,
        var salary: Int,
        var address: Address
    )

    data class Address(
        var id: Int = 0,
        var street: String,
        var city: String,
        var state: String,
        var zipcode: String
    )

    @JvmStatic
    fun main(args: Array<String>) {
        val adr1 = Address(0, "street1", "city1", "state1", "zipcode1")
        val adr2 = Address(0, "street2", "city2", "state2", "zipcode2")

        val empFather = Employee(0, "Jack", "Smith", 7777, adr1)
        val empMother = Employee(0, "Jane", "Smith", 7777, adr1)
        val empSon = Employee(0, "John", "Smith", 7777, adr2)

        val employees = listOf(empFather, empMother, empSon)




    }


}