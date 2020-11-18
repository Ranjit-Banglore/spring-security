# spring-security
authentication and authorization with spring-security 

#user table :
create table "user" (
id integer,
active boolean,
password text,
roles text,
name text,
primary key(id)
);

# docker ps -a
# docker start <container-id>

#insert into "user" values (1, true, 'pass','ROLE_USER','user');

#AuthenticationManager authenticate()--> AuthenticationProvider authenticate(),supports()
--> UserDetailsService [loadUserByUsername()]

#Database user entries:
INSERT INTO public."user"
(id, active, "password", roles, "name")
VALUES(1, true, 'pass', 'ROLE_USER', 'user');
INSERT INTO public."user"
(id, active, "password", roles, "name")
VALUES(2, true, 'secret', 'ROLE_ADMIN,ROLE_USER,ROLE_FINANCE', 'admin');
INSERT INTO public."user"
(id, active, "password", roles, "name")
VALUES(3, true, 'finance', 'ROLE_FINANCE,ROLE_USER', 'finance');


#Access summery:
ADMIN can access all pages
FINANCE can access all pages except admin
USER can access only user page