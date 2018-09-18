CREATE TABLE [mob].[MeasurementReportData](
	[ID] [int] IDENTITY(1,1) PRIMARY KEY NOT NULL,
	[MeasurementID] [int] NOT NULL,
	[ParameterName] [nvarchar](MAX) NOT NULL,
	[ParameterValueMin] [decimal](20,2) NULL,
	[ParameterValueAverage] [decimal](20,2) NULL,
	[ParameterValueMax] [decimal](20,2) NULL,
	[ParameterUnits] [nvarchar](MAX) NOT NULL,
	[UseForReport] [Bit] NOT NULL
)

ALTER TABLE [mob].[MeasurementReportData]  WITH CHECK ADD  CONSTRAINT [fk_measurement_id_measurements] FOREIGN KEY([MeasurementID])
REFERENCES [mob].[Measurements] ([ID])
GO

ALTER TABLE [mob].[MeasurementReportData] CHECK CONSTRAINT [fk_measurement_id_measurements]
GO
