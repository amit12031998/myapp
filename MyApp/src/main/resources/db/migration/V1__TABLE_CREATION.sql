create table course (course_id int4 not null, course_name varchar(255) not null, course_price int4 not null, primary key (course_id));
create table role (role_id  serial not null, name varchar(255) not null, primary key (role_id));
create table student (id int4 not null, email varchar(255) not null, name varchar(255) not null, phone_no varchar(255) not null, primary key (id));
create table users (user_id  bigserial not null, password varchar(30) not null, username varchar(255) not null, primary key (user_id));
create table users_roles (user_id int8 not null, role_id int4 not null, primary key (user_id, role_id));
