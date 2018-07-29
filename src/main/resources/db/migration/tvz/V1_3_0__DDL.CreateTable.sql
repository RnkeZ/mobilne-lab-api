CREATE TABLE [mob].[Measurements](
	[ID] int IDENTITY(1,1) PRIMARY KEY,
	[Name] [varchar](50) NOT NULL,
	[Data] [nvarchar](max) NOT NULL,
	[DateOfCreation] [datetime] NOT NULL,
	[UserID] [int] NOT NULL,
	[Username] [varchar](50) NOT NULL,
	[TypeID] [int] NOT NULL,
	[DeviceID] [int] NOT NULL
);
GO

CREATE TABLE [mob].[Type](
	ID int IDENTITY(1,1) PRIMARY KEY,
	[Name] [varchar](50) NOT NULL,
);
GO

CREATE TABLE [mob].[Device](
	ID int IDENTITY(1,1) PRIMARY KEY,
	[Name] [varchar](50) NOT NULL,
	[Description] [varchar](50) NOT NULL,
);
GO

ALTER TABLE [mob].[Measurements]  WITH CHECK ADD  CONSTRAINT [fk_type_id_measurements] FOREIGN KEY([TypeID])
REFERENCES [mob].[Type] ([ID])
GO

ALTER TABLE [mob].[Measurements] CHECK CONSTRAINT [fk_type_id_measurements]
GO

ALTER TABLE [mob].[Measurements]  WITH CHECK ADD  CONSTRAINT [fk_device_id_measurements] FOREIGN KEY([DeviceId])
REFERENCES [mob].[Device] ([ID])
GO

ALTER TABLE [mob].[Measurements] CHECK CONSTRAINT [fk_type_id_measurements]
GO

ALTER TABLE [mob].[Measurements]  WITH CHECK ADD  CONSTRAINT [fk_user_id_measurements] FOREIGN KEY([UserID])
REFERENCES [mob].[user] ([ID])
GO

ALTER TABLE [mob].[Measurements] CHECK CONSTRAINT [fk_user_id_measurements]
GO