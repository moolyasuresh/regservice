CREATE TABLE tuser(
   user_id integer PRIMARY KEY,
   first_Name VARCHAR (50) UNIQUE NOT NULL,
   last_Name VARCHAR (50) NOT NULL,
   passport_Number VARCHAR (50) NOT null,
   immigration_Status VARCHAR (50) NOT null,
   created_By VARCHAR (50) NOT null,
   create_Dt TIMESTAMP NOT NULL
   );
  
  
CREATE TABLE tuser_techn (
   tech_id integer PRIMARY KEY,
   user_id integer not null,
   java integer not null,
   ui integer not null,
   database_lvl integer not null,
   created_By VARCHAR (50) NOT null,
   create_Dt TIMESTAMP NOT null,
   CONSTRAINT tuser_tech_id_fkey FOREIGN KEY (user_id)
   REFERENCES tuser (user_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
   );
   
  CREATE TABLE tuser_mgmnt(
   mgmnt_id integer PRIMARY KEY,
   user_id integer not null,
   commnctn integer not null,
   leadership integer not null,
   created_By VARCHAR (50) NOT null,
   create_Dt TIMESTAMP NOT null,
   CONSTRAINT tuser_mgmnt_id_fkey FOREIGN KEY (user_id)
   REFERENCES tuser (user_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
   );
  

CREATE TABLE tuser_status(
   status_id integer PRIMARY KEY,
   user_id integer not null,
   status VARCHAR (50) NOT null,
   created_By VARCHAR (50) NOT null,
   create_Dt TIMESTAMP NOT null,
   CONSTRAINT tuser_status_id_fkey FOREIGN KEY (user_id)
   REFERENCES tuser (user_id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION
   );
commit;
