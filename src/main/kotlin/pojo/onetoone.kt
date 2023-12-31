package pojo

object onetoone {

/**
    A one-to-one association is similar to many-to-one association with a difference that the column will be set as unique. For example, an address object can be associated with a single employee object.

    create table EMPLOYEE (
    id INT NOT NULL auto_increment,
    first_name VARCHAR(20) default NULL,
    last_name  VARCHAR(20) default NULL,
    salary     INT  default NULL,
    address    INT NOT NULL,
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




}