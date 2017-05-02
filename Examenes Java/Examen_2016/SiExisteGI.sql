USE [GI]
GO
/****** Object:  Table [dbo].[GEN]    Script Date: 24/11/2016 10:35:21 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[GEN](
	[Codigo] [int] NOT NULL,
	[Nombre] [nvarchar](100) NOT NULL,
 CONSTRAINT [PK_gen] PRIMARY KEY CLUSTERED 
(
	[Codigo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[PROTEINA]    Script Date: 24/11/2016 10:35:21 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PROTEINA](
	[Codigo] [nvarchar](16) NOT NULL,
	[CodigoGen] [int] NOT NULL,
	[Nombre] [nvarchar](50) NOT NULL,
	[LongitudSecuencia] [int] NOT NULL,
	[Secuencia] [nvarchar](255) NOT NULL,
	[Estado] [nvarchar](50) NOT NULL,
	[Funcion] [nvarchar](50) NOT NULL,
 CONSTRAINT [PK_PROTEINA] PRIMARY KEY CLUSTERED 
(
	[Codigo] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
ALTER TABLE [dbo].[PROTEINA]  WITH CHECK ADD  CONSTRAINT [FK_PROTEINA_GEN] FOREIGN KEY([CodigoGen])
REFERENCES [dbo].[GEN] ([Codigo])
GO
ALTER TABLE [dbo].[PROTEINA] CHECK CONSTRAINT [FK_PROTEINA_GEN]
GO
