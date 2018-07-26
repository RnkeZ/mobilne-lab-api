IF OBJECT_ID('[tvz].[user_authority]', 'U') IS NOT NULL 
DROP TABLE [tvz].[user_authority]; 

IF OBJECT_ID('[tvz].[user]', 'U') IS NOT NULL 
DROP TABLE [tvz].[user]; 

IF OBJECT_ID('[tvz].[authority]', 'U') IS NOT NULL 
DROP TABLE [tvz].[authority]; 

CREATE TABLE [tvz].[user]
(
id integer NOT NULL,
username VARCHAR(50) NOT NULL,
password VARCHAR(100) NOT NULL,
firstname VARCHAR(50) NOT NULL,
lastname VARCHAR(50) NOT NULL,
email VARCHAR(50) NOT NULL,
enabled bit,
lastpasswordresetdate datetime NOT NULL,
CONSTRAINT user_pkey PRIMARY KEY (id)
);

CREATE TABLE [tvz].[authority]
(
id integer NOT NULL,
name VARCHAR(50) NOT NULL,
CONSTRAINT authority_pkey PRIMARY KEY (id)
);

CREATE TABLE [tvz].[user_authority]
(
user_id integer NOT NULL,
authority_id integer NOT NULL,
CONSTRAINT fk_authority_id_user_authority FOREIGN KEY (authority_id)
REFERENCES [tvz].[authority] (id) 
);