INSERT INTO [mob].[user] (USERNAME, PASSWORD, FIRSTNAME, LASTNAME, EMAIL, ENABLED, LASTPASSWORDRESETDATE) VALUES ('admin', '$2a$08$lDnHPz7eUkSi6ao14Twuau08mzhWrL4kyZGGU5xfiGALO/Vxd5DOi', 'admin', 'admin', 'admin@admin.com', 1, GETDATE());

INSERT INTO [mob].[authority] (ID, NAME, FULLNAME) VALUES (1, 'ROLE_USER', 'Korisnik');
INSERT INTO [mob].[authority] (ID, NAME, FULLNAME) VALUES (2, 'ROLE_ADMIN', 'Administrator');

INSERT INTO [mob].[userauthority] (USERID, AUTHORITYID) VALUES (1, 1);
INSERT INTO [mob].[userauthority] (USERID, AUTHORITYID) VALUES (1, 2);