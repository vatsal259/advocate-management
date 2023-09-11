CREATE DATABASE managementdb;
#CUSTOMER
use managementdb;
create table customer(
	cust_id int Primary key auto_increment,
    first_name varchar(20) not null,
    last_name varchar(20) not null,
    phone_number varchar(10) not null,
    gender varchar(6),
    address varchar(80),
    city varchar(18),
    state varchar(15),
    pincode varchar(6)
);

#ADVOCATE
use managementdb;
create table advocate(
	advt_id int Primary key auto_increment,
    first_name varchar(20) not null,
    last_name varchar(20) not null,
    phone_number varchar(10) not null,
    gender varchar(6),
    cabin_number varchar(10) not null,
    check_in time not null,
    check_out time not null,
    fees decimal(8,2) not null
);

#APPOINTMENT
create table appointment(
	appt_id int Primary Key Auto_increment,
    advt_id int,
    cust_id int,
    case_type varchar(20),
    Foreign Key (advt_id) references advocate(advt_id)
    on update cascade 
    on delete cascade,
    Foreign Key (cust_id) references customer(cust_id)
    on update cascade 
    on delete cascade
);