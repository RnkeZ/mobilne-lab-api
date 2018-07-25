INSERT INTO [tvz].[user] (ID, USERNAME, PASSWORD, FIRSTNAME, LASTNAME, EMAIL, ENABLED, LASTPASSWORDRESETDATE) VALUES (1, 'admin', '$2a$08$lDnHPz7eUkSi6ao14Twuau08mzhWrL4kyZGGU5xfiGALO/Vxd5DOi', 'admin', 'admin', 'admin@admin.com', 1, DEFAULT);
INSERT INTO [tvz].[user] (ID, USERNAME, PASSWORD, FIRSTNAME, LASTNAME, EMAIL, ENABLED, LASTPASSWORDRESETDATE) VALUES (2, 'user', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 'user', 'user', 'enabled@user.com', 1, DEFAULT);
INSERT INTO [tvz].[user] (ID, USERNAME, PASSWORD, FIRSTNAME, LASTNAME, EMAIL, ENABLED, LASTPASSWORDRESETDATE) VALUES (3, 'disabled', '$2a$08$UkVvwpULis18S19S5pZFn.YHPZt3oaqHZnDwqbCW9pft6uFtkXKDC', 'user', 'user', 'disabled@user.com', 0, DEFAULT);

INSERT INTO [tvz].[authority] (ID, NAME) VALUES (1, 'ROLE_USER');
INSERT INTO [tvz].[authority] (ID, NAME) VALUES (2, 'ROLE_ADMIN');

INSERT INTO [tvz].[user_authority] (USER_ID, AUTHORITY_ID) VALUES (1, 1);
INSERT INTO [tvz].[user_authority] (USER_ID, AUTHORITY_ID) VALUES (1, 2);
INSERT INTO [tvz].[user_authority] (USER_ID, AUTHORITY_ID) VALUES (2, 1);
INSERT INTO [tvz].[user_authority] (USER_ID, AUTHORITY_ID) VALUES (3, 1);