CREATE TABLE [mob].[Measurements](
	[ID] [int] NOT NULL,
	[Data] [nvarchar](max) NOT NULL,
	[DateOfCreation] [datetime] NOT NULL,
	[UserID] [int] NOT NULL,
	[Username] [varchar](50) NOT NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO

ALTER TABLE [mob].[Measurements]  WITH CHECK ADD  CONSTRAINT [fk_user_id_measurements] FOREIGN KEY([UserID])
REFERENCES [mob].[user] ([ID])
GO

ALTER TABLE [mob].[Measurements] CHECK CONSTRAINT [fk_user_id_measurements]
GO