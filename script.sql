USE [zoomanagement]
GO
/****** Object:  Table [dbo].[Animal]    Script Date: 10/30/2023 1:08:37 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Animal](
	[Animal_ID] [varchar](50) NOT NULL,
	[Name] [nvarchar](max) NOT NULL,
	[DayIn] [nvarchar](max) NOT NULL,
	[Photo] [nvarchar](max) NOT NULL,
	[AnimalCage_ID] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Animal] PRIMARY KEY CLUSTERED 
(
	[Animal_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[AnimalCage]    Script Date: 10/30/2023 1:08:37 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[AnimalCage](
	[AnimalCage_ID] [varchar](50) NOT NULL,
	[Name] [nvarchar](max) NOT NULL,
	[Area_ID] [varchar](50) NOT NULL,
	[Employee_ID] [varchar](50) NOT NULL,
	[Photo] [nvarchar](max) NOT NULL,
 CONSTRAINT [PK_AnimalCage] PRIMARY KEY CLUSTERED 
(
	[AnimalCage_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[AnimalReport]    Script Date: 10/30/2023 1:08:37 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[AnimalReport](
	[Report_ID] [varchar](50) NOT NULL,
	[Date] [nvarchar](max) NOT NULL,
	[Note] [nvarchar](max) NOT NULL,
	[Animal_ID] [varchar](50) NOT NULL,
 CONSTRAINT [PK_AnimalReport] PRIMARY KEY CLUSTERED 
(
	[Report_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Area]    Script Date: 10/30/2023 1:08:37 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Area](
	[Area_ID] [varchar](50) NOT NULL,
	[AreaLocation] [nvarchar](max) NOT NULL,
	[Genre] [nvarchar](max) NOT NULL,
	[Photo] [nvarchar](max) NOT NULL,
 CONSTRAINT [PK_Area] PRIMARY KEY CLUSTERED 
(
	[Area_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Discount]    Script Date: 10/30/2023 1:08:37 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Discount](
	[ID] [varchar](50) NOT NULL,
	[Discount] [nvarchar](max) NULL,
 CONSTRAINT [PK_Discount] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Employee]    Script Date: 10/30/2023 1:08:37 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Employee](
	[Employee_ID] [varchar](50) NOT NULL,
	[Password] [nvarchar](max) NOT NULL,
	[Fullname] [nvarchar](max) NOT NULL,
	[Phone] [nvarchar](max) NOT NULL,
	[Email] [nvarchar](max) NOT NULL,
	[Gender] [nvarchar](max) NOT NULL,
	[Photo] [nvarchar](max) NOT NULL,
	[RoleID] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Employee] PRIMARY KEY CLUSTERED 
(
	[Employee_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Feedback]    Script Date: 10/30/2023 1:08:37 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Feedback](
	[Feedback_ID] [varchar](50) NOT NULL,
	[Title] [nvarchar](max) NOT NULL,
	[Purpose] [nvarchar](max) NOT NULL,
	[Date] [nvarchar](max) NOT NULL,
	[ProcessNote] [nvarchar](max) NOT NULL,
	[Employee_ID] [varchar](50) NOT NULL,
	[Status] [nvarchar](max) NOT NULL,
 CONSTRAINT [PK_Feedback] PRIMARY KEY CLUSTERED 
(
	[Feedback_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Food]    Script Date: 10/30/2023 1:08:37 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Food](
	[Food_ID] [varchar](50) NOT NULL,
	[FoodName] [nvarchar](max) NOT NULL,
 CONSTRAINT [PK_Food] PRIMARY KEY CLUSTERED 
(
	[Food_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[FoodSchedule]    Script Date: 10/30/2023 1:08:37 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[FoodSchedule](
	[Schedule_ID] [varchar](50) NOT NULL,
	[Time] [varchar](max) NOT NULL,
	[AnimalCage_ID] [varchar](50) NOT NULL,
	[Food_ID] [varchar](50) NOT NULL,
	[Date] [varchar](max) NOT NULL,
 CONSTRAINT [PK_FoodSchedule] PRIMARY KEY CLUSTERED 
(
	[Schedule_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[News]    Script Date: 10/30/2023 1:08:37 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[News](
	[News_ID] [varchar](50) NOT NULL,
	[Title] [nvarchar](max) NOT NULL,
	[Content] [nvarchar](max) NOT NULL,
	[Day] [nvarchar](max) NOT NULL,
	[Photo] [nvarchar](max) NOT NULL,
 CONSTRAINT [PK_News] PRIMARY KEY CLUSTERED 
(
	[News_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[OrderDetail]    Script Date: 10/30/2023 1:08:37 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[OrderDetail](
	[OrderDetail_ID] [varchar](50) NOT NULL,
	[EntryDay] [nvarchar](max) NOT NULL,
	[Ticket_ID] [varchar](50) NOT NULL,
	[Order_ID] [varchar](50) NOT NULL,
	[Promotion] [nvarchar](max) NULL,
	[Quantity] [int] NOT NULL,
 CONSTRAINT [PK_OrderDetail] PRIMARY KEY CLUSTERED 
(
	[OrderDetail_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Orders]    Script Date: 10/30/2023 1:08:37 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Orders](
	[Order_ID] [varchar](50) NOT NULL,
	[Email] [nvarchar](max) NOT NULL,
	[FullName] [nvarchar](max) NOT NULL,
	[PhoneNumber] [nvarchar](max) NOT NULL,
	[Date] [nvarchar](max) NOT NULL,
	[TotalPrice] [real] NOT NULL,
 CONSTRAINT [PK_Orders] PRIMARY KEY CLUSTERED 
(
	[Order_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[RoleSystem]    Script Date: 10/30/2023 1:08:37 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[RoleSystem](
	[RoleID] [varchar](50) NOT NULL,
	[Name] [nvarchar](max) NOT NULL,
 CONSTRAINT [PK_RoleSystem_1] PRIMARY KEY CLUSTERED 
(
	[RoleID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Ticket]    Script Date: 10/30/2023 1:08:37 AM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Ticket](
	[Ticket_ID] [varchar](50) NOT NULL,
	[Type] [nvarchar](max) NOT NULL,
	[Discount] [int] NOT NULL,
	[Price_Main] [real] NOT NULL,
	[Price] [real] NOT NULL,
 CONSTRAINT [PK_Ticket] PRIMARY KEY CLUSTERED 
(
	[Ticket_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
INSERT [dbo].[Employee] ([Employee_ID], [Password], [Fullname], [Phone], [Email], [Gender], [Photo], [RoleID]) VALUES (N'ad', N'son123', N'SON', N'0814384327', N'nguyenhungson7272@gmail.com', N'Male', N'[zoomanagement]', N'ADMIN')
INSERT [dbo].[Employee] ([Employee_ID], [Password], [Fullname], [Phone], [Email], [Gender], [Photo], [RoleID]) VALUES (N'tn', N'123', N'DUNG', N'1234567890', N'xyz@gmail.com', N'Male', N'[xyz]', N'TRAINER')
GO
INSERT [dbo].[OrderDetail] ([OrderDetail_ID], [EntryDay], [Ticket_ID], [Order_ID], [Promotion], [Quantity]) VALUES (N'OD01', N'2023-10-31', N'T01', N'Order01', N'abcd', 2)
INSERT [dbo].[OrderDetail] ([OrderDetail_ID], [EntryDay], [Ticket_ID], [Order_ID], [Promotion], [Quantity]) VALUES (N'OD02', N'2023-10-31', N'T02', N'Order01', N'abcd', 1)
GO
INSERT [dbo].[Orders] ([Order_ID], [Email], [FullName], [PhoneNumber], [Date], [TotalPrice]) VALUES (N'Order01', N'nguyenhungson7272@gmail.com', N'SON', N'0123456789', N'2023-10-28', 220000)
GO
INSERT [dbo].[RoleSystem] ([RoleID], [Name]) VALUES (N'ADMIN', N'ADMIN')
INSERT [dbo].[RoleSystem] ([RoleID], [Name]) VALUES (N'MANAGER', N'MANAGER')
INSERT [dbo].[RoleSystem] ([RoleID], [Name]) VALUES (N'TRAINER', N'TRAINER')
GO
INSERT [dbo].[Ticket] ([Ticket_ID], [Type], [Discount], [Price_Main], [Price]) VALUES (N'T01', N'Vé Người Lớn', 10, 10000, 90000)
INSERT [dbo].[Ticket] ([Ticket_ID], [Type], [Discount], [Price_Main], [Price]) VALUES (N'T02', N'Vé Trẻ Em', 20, 50000, 40000)
GO
ALTER TABLE [dbo].[Animal]  WITH CHECK ADD  CONSTRAINT [FK_Animal_AnimalCage] FOREIGN KEY([AnimalCage_ID])
REFERENCES [dbo].[AnimalCage] ([AnimalCage_ID])
GO
ALTER TABLE [dbo].[Animal] CHECK CONSTRAINT [FK_Animal_AnimalCage]
GO
ALTER TABLE [dbo].[AnimalCage]  WITH CHECK ADD  CONSTRAINT [FK_AnimalCage_Area] FOREIGN KEY([Area_ID])
REFERENCES [dbo].[Area] ([Area_ID])
GO
ALTER TABLE [dbo].[AnimalCage] CHECK CONSTRAINT [FK_AnimalCage_Area]
GO
ALTER TABLE [dbo].[AnimalReport]  WITH CHECK ADD  CONSTRAINT [FK_AnimalReport_Animal] FOREIGN KEY([Animal_ID])
REFERENCES [dbo].[Animal] ([Animal_ID])
GO
ALTER TABLE [dbo].[AnimalReport] CHECK CONSTRAINT [FK_AnimalReport_Animal]
GO
ALTER TABLE [dbo].[Employee]  WITH CHECK ADD  CONSTRAINT [FK_Employee_RoleSystem] FOREIGN KEY([RoleID])
REFERENCES [dbo].[RoleSystem] ([RoleID])
GO
ALTER TABLE [dbo].[Employee] CHECK CONSTRAINT [FK_Employee_RoleSystem]
GO
ALTER TABLE [dbo].[Feedback]  WITH CHECK ADD  CONSTRAINT [FK_Feedback_Employee] FOREIGN KEY([Employee_ID])
REFERENCES [dbo].[Employee] ([Employee_ID])
GO
ALTER TABLE [dbo].[Feedback] CHECK CONSTRAINT [FK_Feedback_Employee]
GO
ALTER TABLE [dbo].[FoodSchedule]  WITH CHECK ADD  CONSTRAINT [FK_FoodSchedule_AnimalCage] FOREIGN KEY([AnimalCage_ID])
REFERENCES [dbo].[AnimalCage] ([AnimalCage_ID])
GO
ALTER TABLE [dbo].[FoodSchedule] CHECK CONSTRAINT [FK_FoodSchedule_AnimalCage]
GO
ALTER TABLE [dbo].[FoodSchedule]  WITH CHECK ADD  CONSTRAINT [FK_FoodSchedule_Food] FOREIGN KEY([Food_ID])
REFERENCES [dbo].[Food] ([Food_ID])
GO
ALTER TABLE [dbo].[FoodSchedule] CHECK CONSTRAINT [FK_FoodSchedule_Food]
GO
ALTER TABLE [dbo].[OrderDetail]  WITH CHECK ADD  CONSTRAINT [FK_OrderDetail_Orders] FOREIGN KEY([Order_ID])
REFERENCES [dbo].[Orders] ([Order_ID])
GO
ALTER TABLE [dbo].[OrderDetail] CHECK CONSTRAINT [FK_OrderDetail_Orders]
GO
ALTER TABLE [dbo].[OrderDetail]  WITH CHECK ADD  CONSTRAINT [FK_OrderDetail_Ticket] FOREIGN KEY([Ticket_ID])
REFERENCES [dbo].[Ticket] ([Ticket_ID])
GO
ALTER TABLE [dbo].[OrderDetail] CHECK CONSTRAINT [FK_OrderDetail_Ticket]
GO
