IF OBJECT_ID('[mob].[UserAuthority]', 'U') IS NOT NULL 
DROP TABLE [mob].[UserAuthority]; 

IF OBJECT_ID('[mob].[User]', 'U') IS NOT NULL 
DROP TABLE [mob].[User]; 

IF OBJECT_ID('[mob].[Authority]', 'U') IS NOT NULL 
DROP TABLE [mob].[Authority]; 

CREATE TABLE [mob].[User]
(
ID int IDENTITY(1,1) PRIMARY KEY,
Username VARCHAR(50) NOT NULL,
Password VARCHAR(100) NOT NULL,
Firstname VARCHAR(50) NOT NULL,
Lastname VARCHAR(50) NOT NULL,
Email VARCHAR(50) NOT NULL,
Enabled bit,
LastPasswordResetDate datetime NOT NULL
);

CREATE TABLE [mob].[Authority]
(
ID integer NOT NULL,
Name VARCHAR(50) NOT NULL,
FullName VARCHAR(50) NOT NULL,
CONSTRAINT authority_pkey PRIMARY KEY (ID)
);

CREATE TABLE [mob].[UserAuthority]
(
UserID integer NOT NULL,
AuthorityID integer NOT NULL,
CONSTRAINT fk_authority_id_user_authority FOREIGN KEY (AuthorityID)
REFERENCES [mob].[Authority] (ID) 
);