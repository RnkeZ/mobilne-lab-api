CREATE TABLE [tvz].[measurements](
	[ID] [int] NOT NULL,
	[Data] [nvarchar](max) NOT NULL,
	[DateOfCreation] [datetime] NOT NULL,
	[UserID] [int] NOT NULL,
	[Username] [varchar](50) NOT NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO

ALTER TABLE [tvz].[measurements]  WITH CHECK ADD  CONSTRAINT [fk_user_id_measurements] FOREIGN KEY([UserID])
REFERENCES [tvz].[user] ([id])
GO

ALTER TABLE [tvz].[measurements] CHECK CONSTRAINT [fk_user_id_measurements]
GO