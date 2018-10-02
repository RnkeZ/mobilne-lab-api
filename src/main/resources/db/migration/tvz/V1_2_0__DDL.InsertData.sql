SET IDENTITY_INSERT [mob].[User] ON 
GO
INSERT [mob].[User] ([ID], [Username], [Password], [Firstname], [Lastname], [Email], [Enabled], [LastPasswordResetDate]) VALUES (1, N'admin', N'$2a$08$lDnHPz7eUkSi6ao14Twuau08mzhWrL4kyZGGU5xfiGALO/Vxd5DOi', N'admin', N'admin', N'admin@admin.com', 1, CAST(N'2018-07-30T22:17:14.720' AS DateTime))
GO
SET IDENTITY_INSERT [mob].[User] OFF
GO
INSERT [mob].[Authority] ([ID], [Name], [FullName]) VALUES (1, N'ROLE_USER', N'Korisnik')
GO
INSERT [mob].[Authority] ([ID], [Name], [FullName]) VALUES (2, N'ROLE_ADMIN', N'Administrator')
GO
INSERT [mob].[UserAuthority] ([UserID], [AuthorityID]) VALUES (1, 1)
GO
INSERT [mob].[UserAuthority] ([UserID], [AuthorityID]) VALUES (1, 2)
GO
SET IDENTITY_INSERT [mob].[Device] ON 
GO
INSERT [mob].[Device] ([ID], [Name], [Description]) VALUES (1, N'Sony Xperia XZ2', N'3G: HSPA 42,2/5,76 Mbps
4G: LTE Cat.18 (1200/200 Mbps)
OS: Android 8.0 Oreo')
GO
INSERT [mob].[Device] ([ID], [Name], [Description]) VALUES (2, N'Samsung Galaxy A7', N'3G: HSPA+ do 42 Mbps
4G: LTE Cat 4 do 150 Mbps
OS: Android 4.4 KitKat')
GO
SET IDENTITY_INSERT [mob].[Device] OFF
GO
SET IDENTITY_INSERT [mob].[Type] ON 
GO
INSERT [mob].[Type] ([ID], [Name]) VALUES (1, N'3G')
GO
INSERT [mob].[Type] ([ID], [Name]) VALUES (2, N'4G')
GO
SET IDENTITY_INSERT [mob].[Type] OFF
GO
