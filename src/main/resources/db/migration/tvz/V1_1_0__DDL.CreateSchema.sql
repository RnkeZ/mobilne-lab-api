--IF EXISTS (SELECT name FROM sys.schemas WHERE name = 'mob')
--BEGIN
--      PRINT 'Dropping the mob schema'
--      DROP SCHEMA [mob]
--END
--GO
--PRINT 'Creating the mob schema'
--GO
--CREATE SCHEMA [mob] AUTHORIZATION [dbo]
--