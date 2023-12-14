package pojo

object manytomany {


    /**
    A Many-to-Many mapping can be implemented using a Set java collection that does not contain any duplicate element. We already have seen how to map Set collection in hibernate, so if you already learned Set mapping, then you are all set to go with manyto-many mapping.

    create table EMPLOYEE (
    id INT NOT NULL auto_increment,
    first_name VARCHAR(20) default NULL,
    last_name  VARCHAR(20) default NULL,
    salary     INT  default NULL,
    PRIMARY KEY (id)
    );

    create table CERTIFICATE (
    id INT NOT NULL auto_increment,
    certificate_name VARCHAR(30) default NULL,
    PRIMARY KEY (id)
    );

    create table EMP_CERT (
    employee_id INT NOT NULL,
    certificate_id INT NOT NULL,
    PRIMARY KEY (employee_id,certificate_id)
    );
     */

    data class Employee(
        var id: Int = 0,
        var firstName: String = "",
        var lastName: String = "",
        var salary: Int = 0,
        var certificates: Set<Certificate> = mutableSetOf()
    ) {
        constructor(fname: String, lname: String, salary: Int) : this(
            firstName = fname,
            lastName = lname,
            salary = salary
        )
    }

    data class Certificate(
        var id: Int = 0,
        var name: String = ""
    )


}