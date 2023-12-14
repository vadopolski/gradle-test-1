package pojo

object onetomany {

    /**
    A One-to-Many mapping can be implemented using a Set java collection that does not contain any duplicate element.
    We already have seen how to map Set collection in hibernate, so if you already learned Set mapping then you are all set to
    go with one-to-many mapping.

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
    employee_id INT default NULL,
    PRIMARY KEY (id)
    );
     */


    data class Employee(
        var id: Int = 0,
        var firstName: String = "",
        var lastName: String = "",
        var salary: Int = 0,
        var certificates: List<Certificate>?
    )


    data class  Certificate(
        val id: Int,
        val name: String
    )

    val emp1 = Employee(0, "Iv", "P", 99, null)












}