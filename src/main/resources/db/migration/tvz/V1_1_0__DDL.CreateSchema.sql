
/****** Object:  Table [mob].[Authority]    Script Date: 02.10.2018. 20:26:34 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [mob].[Authority](
	[ID] [int] NOT NULL,
	[Name] [varchar](50) NOT NULL,
	[FullName] [varchar](50) NOT NULL,
 CONSTRAINT [authority_pkey] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [mob].[Device]    Script Date: 02.10.2018. 20:26:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [mob].[Device](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Name] [varchar](50) NOT NULL,
	[Description] [varchar](1000) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [mob].[MeasurementReportData]    Script Date: 02.10.2018. 20:26:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [mob].[MeasurementReportData](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[MeasurementID] [int] NOT NULL,
	[ParameterName] [nvarchar](max) NOT NULL,
	[ParameterValueMin] [decimal](20, 2) NULL,
	[ParameterValueAverage] [decimal](20, 2) NULL,
	[ParameterValueMax] [decimal](20, 2) NULL,
	[ParameterUnits] [nvarchar](max) NOT NULL,
	[UseForReport] [bit] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [mob].[MeasurementReportImages]    Script Date: 02.10.2018. 20:26:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [mob].[MeasurementReportImages](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[MeasurementID] [int] NOT NULL,
	[ImageName] [varchar](max) NULL,
	[Image] [nvarchar](max) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [mob].[Measurements]    Script Date: 02.10.2018. 20:26:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [mob].[Measurements](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Name] [varchar](50) NOT NULL,
	[Data] [nvarchar](max) NOT NULL,
	[DateOfCreation] [datetime] NOT NULL,
	[UserID] [int] NOT NULL,
	[Username] [varchar](50) NOT NULL,
	[TypeID] [int] NOT NULL,
	[DeviceID] [int] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [mob].[Type]    Script Date: 02.10.2018. 20:26:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [mob].[Type](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Name] [varchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [mob].[User]    Script Date: 02.10.2018. 20:26:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [mob].[User](
	[ID] [int] IDENTITY(1,1) NOT NULL,
	[Username] [varchar](50) NOT NULL,
	[Password] [varchar](100) NOT NULL,
	[Firstname] [varchar](50) NOT NULL,
	[Lastname] [varchar](50) NOT NULL,
	[Email] [varchar](50) NOT NULL,
	[Enabled] [bit] NULL,
	[LastPasswordResetDate] [datetime] NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [mob].[UserAuthority]    Script Date: 02.10.2018. 20:26:35 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [mob].[UserAuthority](
	[UserID] [int] NOT NULL,
	[AuthorityID] [int] NOT NULL
) ON [PRIMARY]
GO
ALTER TABLE [mob].[MeasurementReportData]  WITH CHECK ADD  CONSTRAINT [FK_MeasurementReportData_Measurements] FOREIGN KEY([MeasurementID])
REFERENCES [mob].[Measurements] ([ID])
GO
ALTER TABLE [mob].[MeasurementReportData] CHECK CONSTRAINT [FK_MeasurementReportData_Measurements]
GO
ALTER TABLE [mob].[MeasurementReportImages]  WITH CHECK ADD  CONSTRAINT [FK_MeasurementReportImages_Measurements] FOREIGN KEY([MeasurementID])
REFERENCES [mob].[Measurements] ([ID])
GO
ALTER TABLE [mob].[MeasurementReportImages] CHECK CONSTRAINT [FK_MeasurementReportImages_Measurements]
GO
ALTER TABLE [mob].[Measurements]  WITH CHECK ADD  CONSTRAINT [FK_Measurements_Device] FOREIGN KEY([DeviceID])
REFERENCES [mob].[Device] ([ID])
GO
ALTER TABLE [mob].[Measurements] CHECK CONSTRAINT [FK_Measurements_Device]
GO
ALTER TABLE [mob].[Measurements]  WITH CHECK ADD  CONSTRAINT [FK_Measurements_Type] FOREIGN KEY([TypeID])
REFERENCES [mob].[Type] ([ID])
GO
ALTER TABLE [mob].[Measurements] CHECK CONSTRAINT [FK_Measurements_Type]
GO
ALTER TABLE [mob].[Measurements]  WITH CHECK ADD  CONSTRAINT [FK_Measurements_User] FOREIGN KEY([UserID])
REFERENCES [mob].[User] ([ID])
GO
ALTER TABLE [mob].[Measurements] CHECK CONSTRAINT [FK_Measurements_User]
GO
ALTER TABLE [mob].[UserAuthority]  WITH CHECK ADD  CONSTRAINT [FK_UserAuthority_Authority] FOREIGN KEY([AuthorityID])
REFERENCES [mob].[Authority] ([ID])
GO
ALTER TABLE [mob].[UserAuthority] CHECK CONSTRAINT [FK_UserAuthority_Authority]
GO
ALTER TABLE [mob].[UserAuthority]  WITH CHECK ADD  CONSTRAINT [FK_UserAuthority_User] FOREIGN KEY([UserID])
REFERENCES [mob].[User] ([ID])
GO
ALTER TABLE [mob].[UserAuthority] CHECK CONSTRAINT [FK_UserAuthority_User]
GO
