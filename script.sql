USE [master]
GO
/****** Object:  Database [GI]    Script Date: 10/24/2016 18:50:10 ******/
CREATE DATABASE [GI] ON  PRIMARY 
( NAME = N'GI', FILENAME = N'c:\Program Files\Microsoft SQL Server\MSSQL10_50.SQLEXPRESS\MSSQL\DATA\GI.mdf' , SIZE = 3072KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'GI_log', FILENAME = N'c:\Program Files\Microsoft SQL Server\MSSQL10_50.SQLEXPRESS\MSSQL\DATA\GI_log.ldf' , SIZE = 1024KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [GI] SET COMPATIBILITY_LEVEL = 100
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [GI].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [GI] SET ANSI_NULL_DEFAULT OFF
GO
ALTER DATABASE [GI] SET ANSI_NULLS OFF
GO
ALTER DATABASE [GI] SET ANSI_PADDING OFF
GO
ALTER DATABASE [GI] SET ANSI_WARNINGS OFF
GO
ALTER DATABASE [GI] SET ARITHABORT OFF
GO
ALTER DATABASE [GI] SET AUTO_CLOSE OFF
GO
ALTER DATABASE [GI] SET AUTO_CREATE_STATISTICS ON
GO
ALTER DATABASE [GI] SET AUTO_SHRINK OFF
GO
ALTER DATABASE [GI] SET AUTO_UPDATE_STATISTICS ON
GO
ALTER DATABASE [GI] SET CURSOR_CLOSE_ON_COMMIT OFF
GO
ALTER DATABASE [GI] SET CURSOR_DEFAULT  GLOBAL
GO
ALTER DATABASE [GI] SET CONCAT_NULL_YIELDS_NULL OFF
GO
ALTER DATABASE [GI] SET NUMERIC_ROUNDABORT OFF
GO
ALTER DATABASE [GI] SET QUOTED_IDENTIFIER OFF
GO
ALTER DATABASE [GI] SET RECURSIVE_TRIGGERS OFF
GO
ALTER DATABASE [GI] SET  DISABLE_BROKER
GO
ALTER DATABASE [GI] SET AUTO_UPDATE_STATISTICS_ASYNC OFF
GO
ALTER DATABASE [GI] SET DATE_CORRELATION_OPTIMIZATION OFF
GO
ALTER DATABASE [GI] SET TRUSTWORTHY OFF
GO
ALTER DATABASE [GI] SET ALLOW_SNAPSHOT_ISOLATION OFF
GO
ALTER DATABASE [GI] SET PARAMETERIZATION SIMPLE
GO
ALTER DATABASE [GI] SET READ_COMMITTED_SNAPSHOT OFF
GO
ALTER DATABASE [GI] SET HONOR_BROKER_PRIORITY OFF
GO
ALTER DATABASE [GI] SET  READ_WRITE
GO
ALTER DATABASE [GI] SET RECOVERY SIMPLE
GO
ALTER DATABASE [GI] SET  MULTI_USER
GO
ALTER DATABASE [GI] SET PAGE_VERIFY CHECKSUM
GO
ALTER DATABASE [GI] SET DB_CHAINING OFF
GO
USE [GI]
GO
/****** Object:  Table [dbo].[tPantalla]    Script Date: 10/24/2016 18:50:12 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tPantalla](
	[pantalla] [varchar](50) NOT NULL,
 CONSTRAINT [PK_tPantalla] PRIMARY KEY CLUSTERED 
(
	[pantalla] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tPais]    Script Date: 10/24/2016 18:50:12 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tPais](
	[Codigo] [varchar](3) NOT NULL,
	[Descripcion] [varchar](50) NULL,
 CONSTRAINT [PK_tPais] PRIMARY KEY CLUSTERED 
(
	[Codigo] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'ABW', N'ARUBA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'AFG', N'AFGANISTÁN')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'AGO', N'ANGOLA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'AIA', N'ANGUILA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'ALA', N'ÅLAND')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'ALB', N'ALBANIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'AND', N'ANDORRA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'ANT', N'ANTILLAS NEERLANDESAS')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'ARE', N'EMIRATOS ÁRABES UNIDOS')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'ARG', N'ARGENTINA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'ARM', N'ARMENIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'ASM', N'SAMOA ESTADOUNIDENSE')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'ATG', N'ANTIGUA Y BARBUDA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'AUS', N'AUSTRALIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'AUT', N'AUSTRIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'AZE', N'AZERBAIYÁN')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'BDI', N'BURUNDI')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'BEL', N'BÉLGICA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'BEN', N'BENÍN')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'BFA', N'BURKINA FASO')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'BGD', N'BANGLADÉS')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'BGR', N'BULGARIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'BHR', N'BARÉIN')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'BHS', N'BAHAMAS')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'BIH', N'BOSNIA Y HERZEGOVINA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'BLM', N'SAN BARTOLOMÉ')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'BLR', N'BIELORRUSIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'BLZ', N'BELICE')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'BMU', N'BERMUDAS')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'BOL', N'BOLIVIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'BRA', N'BRASIL')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'BRB', N'BARBADOS')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'BRN', N'BRUNÉI')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'BTN', N'BUTÁN')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'BVT', N'ISLA BOUVET')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'BWA', N'BOTSUANA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'CAF', N'REPÚBLICA CENTROAFRICANA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'CAN', N'CANADÁ')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'CCK', N'ISLAS COCOS')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'CHL', N'CHILE')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'CHN', N'CHINA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'CIV', N'COSTA DE MARFIL')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'CMR', N'CAMERÚN')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'COD', N'REP. DEM. DEL CONGO')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'COG', N'REPÚBLICA DEL CONGO')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'COK', N'ISLAS COOK')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'COL', N'COLOMBIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'COM', N'COMORAS')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'CPV', N'CABO VERDE')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'CRI', N'COSTA RICA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'CUB', N'CUBA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'CXR', N'ISLA DE NAVIDAD')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'CYM', N'ISLAS CAIMÁN')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'CYP', N'CHIPRE')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'CZE', N'REPÚBLICA CHECA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'DEU', N'ALEMANIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'DMA', N'DOMINICA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'DNK', N'DINAMARCA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'DOM', N'REPÚBLICA DOMINICANA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'DZA', N'ARGELIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'ECU', N'ECUADOR')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'EGY', N'EGIPTO')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'ERI', N'ERITREA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'ESH', N'REPÚBLICA ÁRABE SAHARAUI DEMOCRÁTICA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'ESP', N'ESPAÑA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'EST', N'ESTONIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'ETH', N'ETIOPÍA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'FIN', N'FINLANDIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'FJI', N'FIYI')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'FLK', N'ISLAS MALVINAS')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'FRA', N'FRANCIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'FRO', N'ISLAS FEROE')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'FSM', N'MICRONESIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'GAB', N'GABÓN')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'GBR', N'REINO UNIDO')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'GEO', N'GEORGIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'GGY', N'GUERNSEY')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'GHA', N'GHANA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'GIB', N'GIBRALTAR')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'GIN', N'GUINEA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'GLP', N'GUADALUPE')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'GMB', N'GAMBIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'GNB', N'GUINEA-BISSAU')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'GNQ', N'GUINEA ECUATORIAL')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'GRC', N'GRECIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'GRD', N'GRANADA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'GRL', N'GROENLANDIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'GTM', N'GUATEMALA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'GUF', N'GUAYANA FRANCESA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'GUM', N'GUAM')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'GUY', N'GUYANA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'HKG', N'HONG KONG')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'HMD', N'ISLAS HEARD Y MCDONALD')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'HND', N'HONDURAS')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'HRV', N'CROACIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'HTI', N'HAITÍ')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'HUN', N'HUNGRÍA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'IDN', N'INDONESIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'IMN', N'ISLA DE MAN')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'IND', N'INDIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'IRL', N'IRLANDA')
GO
print 'Processed 100 total records'
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'IRN', N'IRÁN')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'IRQ', N'IRAK')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'ISL', N'ISLANDIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'ISR', N'ISRAEL')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'ITA', N'ITALIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'JAM', N'JAMAICA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'JEY', N'JERSEY')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'JOR', N'JORDANIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'JPN', N'JAPÓN')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'KAZ', N'KAZAJISTÁN')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'KEN', N'KENIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'KGZ', N'KIRGUISTÁN')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'KHM', N'CAMBOYA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'KIR', N'KIRIBATI')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'KNA', N'SAN CRISTÓBAL Y NIEVES')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'KOR', N'COREA DEL SUR')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'KWT', N'KUWAIT')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'LAO', N'LAOS')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'LBN', N'LÍBANO')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'LBR', N'LIBERIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'LBY', N'LIBIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'LCA', N'SANTA LUCÍA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'LIE', N'LIECHTENSTEIN')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'LSO', N'LESOTO')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'LTU', N'LITUANIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'LUX', N'LUXEMBURGO')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'LVA', N'LETONIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'MAC', N'MACAO')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'MAF', N'SAN MARTÍN')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'MAR', N'MARRUECOS')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'MCO', N'MÓNACO')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'MDA', N'MOLDAVIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'MDG', N'MADAGASCAR')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'MDV', N'MALDIVAS')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'MEX', N'MÉXICO')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'MHL', N'ISLAS MARSHALL')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'MKD', N'REPÚBLICA DE MACEDONIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'MLI', N'MALÍ')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'MLT', N'MALTA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'MMR', N'BIRMANIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'MNE', N'MONTENEGRO')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'MNG', N'MONGOLIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'MNP', N'ISLAS MARIANAS DEL NORTE')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'MOZ', N'MOZAMBIQUE')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'MRT', N'MAURITANIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'MSR', N'MONTSERRAT')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'MTQ', N'MARTINICA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'MUS', N'MAURICIO')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'MWI', N'MALAUI')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'MYS', N'MALASIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'MYT', N'MAYOTTE')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'NAM', N'NAMIBIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'NCL', N'NUEVA CALEDONIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'NER', N'NÍGER')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'NFK', N'NORFOLK')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'NGA', N'NIGERIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'NIC', N'NICARAGUA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'NIU', N'NIUE')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'NLD', N'PAÍSES BAJOS')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'NOR', N'NORUEGA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'NPL', N'NEPAL')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'NRU', N'NAURU')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'NZL', N'NUEVA ZELANDA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'OMN', N'OMÁN')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'PAK', N'PAKISTÁN')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'PAN', N'PANAMÁ')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'PCN', N'ISLAS PITCAIRN')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'PER', N'PERÚ')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'PHL', N'FILIPINAS')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'PLW', N'PALAOS')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'PNG', N'PAPÚA NUEVA GUINEA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'POL', N'POLONIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'PRI', N'PUERTO RICO')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'PRK', N'COREA DEL NORTE')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'PRT', N'PORTUGAL')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'PRY', N'PARAGUAY')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'PSE', N'AUTORIDAD NACIONAL PALESTINA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'PYF', N'POLINESIA FRANCESA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'QAT', N'CATAR')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'REU', N'REUNIÓN')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'ROU', N'RUMANÍA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'RUS', N'RUSIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'RWA', N'RUANDA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'SAU', N'ARABIA SAUDITA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'SEN', N'SENEGAL')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'SGS', N'ISLAS GEORGIAS DEL SUR Y SANDWICH DEL SUR')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'SHN', N'SANTA HELENA, A. Y T.')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'SLB', N'ISLAS SALOMÓN')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'SLV', N'EL SALVADOR')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'SMR', N'SAN MARINO')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'SPM', N'SAN PEDRO Y MIQUELÓN')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'SRB', N'SERBIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'STP', N'SANTO TOMÉ Y PRÍNCIPE')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'SVK', N'ESLOVAQUIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'SVN', N'ESLOVENIA')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'TCD', N'CHAD')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'USA', N'ESTADOS UNIDOS')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'VCT', N'SAN VICENTE Y LAS GRANADINAS')
INSERT [dbo].[tPais] ([Codigo], [Descripcion]) VALUES (N'WSM', N'SAMOA')
/****** Object:  Table [dbo].[tRol]    Script Date: 10/24/2016 18:50:12 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tRol](
	[rolName] [varchar](50) NOT NULL,
	[rolDes] [varchar](225) NULL,
	[admin] [bit] NOT NULL,
 CONSTRAINT [PK_tRol] PRIMARY KEY CLUSTERED 
(
	[rolName] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[tRol] ([rolName], [rolDes], [admin]) VALUES (N'administrador', N'administrador', 1)
INSERT [dbo].[tRol] ([rolName], [rolDes], [admin]) VALUES (N'administrativo', N'administrativo', 0)
INSERT [dbo].[tRol] ([rolName], [rolDes], [admin]) VALUES (N'medico', N'medico', 0)
INSERT [dbo].[tRol] ([rolName], [rolDes], [admin]) VALUES (N'paciente', N'paciente', 0)
/****** Object:  Table [dbo].[tValoresGlucometria]    Script Date: 10/24/2016 18:50:12 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tValoresGlucometria](
	[Nombre] [varchar](50) NULL,
	[ValorMinimo] [real] NOT NULL,
	[ValorMaximo] [real] NOT NULL
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[tValoresGlucometria] ([Nombre], [ValorMinimo], [ValorMaximo]) VALUES (N'Normoglicemia', 60, 110)
INSERT [dbo].[tValoresGlucometria] ([Nombre], [ValorMinimo], [ValorMaximo]) VALUES (N'Hiperglicemia', 111, 500)
INSERT [dbo].[tValoresGlucometria] ([Nombre], [ValorMinimo], [ValorMaximo]) VALUES (N'Hipoglucemia', 0, 59)
/****** Object:  Table [dbo].[tUsuario]    Script Date: 10/24/2016 18:50:12 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tUsuario](
	[nombre] [varchar](50) NOT NULL,
	[password] [varchar](50) NOT NULL,
	[rolName] [varchar](50) NOT NULL,
 CONSTRAINT [PK_tUsuario] PRIMARY KEY CLUSTERED 
(
	[nombre] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[tUsuario] ([nombre], [password], [rolName]) VALUES (N'ana', N'ana', N'medico')
INSERT [dbo].[tUsuario] ([nombre], [password], [rolName]) VALUES (N'juan', N'juan', N'administrador')
INSERT [dbo].[tUsuario] ([nombre], [password], [rolName]) VALUES (N'maria', N'maria', N'paciente')
INSERT [dbo].[tUsuario] ([nombre], [password], [rolName]) VALUES (N'pedro', N'pedro', N'administrativo')
/****** Object:  Table [dbo].[tPermiso]    Script Date: 10/24/2016 18:50:12 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tPermiso](
	[rolName] [varchar](50) NOT NULL,
	[pantalla] [varchar](50) NOT NULL,
	[acceso] [bit] NOT NULL,
	[modificacion] [bit] NOT NULL,
 CONSTRAINT [PK_tPermiso] PRIMARY KEY CLUSTERED 
(
	[rolName] ASC,
	[pantalla] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tPaciente]    Script Date: 10/24/2016 18:50:12 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tPaciente](
	[NumSS] [int] NOT NULL,
	[DNI_NIE] [varchar](50) NOT NULL,
	[Nombre] [varchar](50) NOT NULL,
	[Apellidos] [varchar](50) NOT NULL,
	[Sexo] [varchar](10) NOT NULL,
	[FechaNacimiento] [date] NOT NULL,
	[Direccion] [varchar](80) NULL,
	[Poblacion] [varchar](50) NULL,
	[Provincia] [varchar](50) NULL,
	[CodigoPostal] [varchar](50) NULL,
	[Pais] [varchar](3) NULL,
	[Telefono] [varchar](50) NULL,
	[e_mail] [varchar](50) NULL,
 CONSTRAINT [PK_tPaciente] PRIMARY KEY CLUSTERED 
(
	[NumSS] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
INSERT [dbo].[tPaciente] ([NumSS], [DNI_NIE], [Nombre], [Apellidos], [Sexo], [FechaNacimiento], [Direccion], [Poblacion], [Provincia], [CodigoPostal], [Pais], [Telefono], [e_mail]) VALUES (1, N'1', N'N1', N'AP1', N'HOMBRE', CAST(0xEBFA0A00 AS Date), N'CASA 1', N'MALAGA', N'MALAGA', N'29001', N'ESP', N'111111111', N'1@MAIL.COM')
INSERT [dbo].[tPaciente] ([NumSS], [DNI_NIE], [Nombre], [Apellidos], [Sexo], [FechaNacimiento], [Direccion], [Poblacion], [Provincia], [CodigoPostal], [Pais], [Telefono], [e_mail]) VALUES (2, N'2', N'N2', N'AP2', N'HOMBRE', CAST(0xA9210B00 AS Date), N'CASA 2', N'MALAGA', N'MALAGA', N'29002', N'CRI', N'222222222', N'2@MAIL.COM')
INSERT [dbo].[tPaciente] ([NumSS], [DNI_NIE], [Nombre], [Apellidos], [Sexo], [FechaNacimiento], [Direccion], [Poblacion], [Provincia], [CodigoPostal], [Pais], [Telefono], [e_mail]) VALUES (3, N'3', N'N3', N'AP3', N'MUJER', CAST(0x8C280B00 AS Date), N'CASA 3', N'MALAGA', N'MALAGA', N'29003', N'ESP', N'3333333333', N'3@MAIL.COM')
INSERT [dbo].[tPaciente] ([NumSS], [DNI_NIE], [Nombre], [Apellidos], [Sexo], [FechaNacimiento], [Direccion], [Poblacion], [Provincia], [CodigoPostal], [Pais], [Telefono], [e_mail]) VALUES (4, N'4', N'N4', N'AP4', N'MUJER', CAST(0x1A2A0B00 AS Date), N'CASA 4', N'PARIS', N'PARIS', N'2131231', N'FRA', N'444444444', N'4@MAIL.COM')
INSERT [dbo].[tPaciente] ([NumSS], [DNI_NIE], [Nombre], [Apellidos], [Sexo], [FechaNacimiento], [Direccion], [Poblacion], [Provincia], [CodigoPostal], [Pais], [Telefono], [e_mail]) VALUES (5, N'5', N'N5', N'AP5', N'MUJER', CAST(0xA62B0B00 AS Date), N'CASA 5', N'MALAGA', N'MALAGA', N'29005', N'EST', N'555555555', N'5@MAIL.COM')
/****** Object:  Table [dbo].[tGlucometria]    Script Date: 10/24/2016 18:50:12 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tGlucometria](
	[ID] [int] NOT NULL,
	[Num_SS] [int] NOT NULL,
	[Fecha_Horal] [datetime] NOT NULL,
	[Valor] [real] NULL,
 CONSTRAINT [PK_tGlucometria] PRIMARY KEY CLUSTERED 
(
	[ID] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  UserDefinedFunction [dbo].[esAdmin]    Script Date: 10/24/2016 18:50:14 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
-- =============================================
-- Author:		<Author,,Name>
-- Create date: <Create Date, ,>
-- Description:	<Description, ,>
-- =============================================
CREATE FUNCTION [dbo].[esAdmin](@n varchar(50), @p varchar(50))
RETURNS BIT
AS
BEGIN
	-- Declare the return variable here
	DECLARE @ret bit

	-- Add the T-SQL statements to compute the return value here
	SELECT @ret = admin from tRol WHERE rolName = ( SELECT rolName from tUsuario WHERE (nombre = @n and password = @p))

	-- Return the result of the function
	IF(@ret IS NULL)
		SET @ret = 0;
	RETURN @ret

END
GO
/****** Object:  ForeignKey [FK_tUsuario_tRol]    Script Date: 10/24/2016 18:50:12 ******/
ALTER TABLE [dbo].[tUsuario]  WITH CHECK ADD  CONSTRAINT [FK_tUsuario_tRol] FOREIGN KEY([rolName])
REFERENCES [dbo].[tRol] ([rolName])
GO
ALTER TABLE [dbo].[tUsuario] CHECK CONSTRAINT [FK_tUsuario_tRol]
GO
/****** Object:  ForeignKey [FK_tPermiso_tPantalla]    Script Date: 10/24/2016 18:50:12 ******/
ALTER TABLE [dbo].[tPermiso]  WITH CHECK ADD  CONSTRAINT [FK_tPermiso_tPantalla] FOREIGN KEY([pantalla])
REFERENCES [dbo].[tPantalla] ([pantalla])
GO
ALTER TABLE [dbo].[tPermiso] CHECK CONSTRAINT [FK_tPermiso_tPantalla]
GO
/****** Object:  ForeignKey [FK_tPermiso_tRol]    Script Date: 10/24/2016 18:50:12 ******/
ALTER TABLE [dbo].[tPermiso]  WITH CHECK ADD  CONSTRAINT [FK_tPermiso_tRol] FOREIGN KEY([rolName])
REFERENCES [dbo].[tRol] ([rolName])
GO
ALTER TABLE [dbo].[tPermiso] CHECK CONSTRAINT [FK_tPermiso_tRol]
GO
/****** Object:  ForeignKey [FK_tPaciente_tPais]    Script Date: 10/24/2016 18:50:12 ******/
ALTER TABLE [dbo].[tPaciente]  WITH CHECK ADD  CONSTRAINT [FK_tPaciente_tPais] FOREIGN KEY([Pais])
REFERENCES [dbo].[tPais] ([Codigo])
GO
ALTER TABLE [dbo].[tPaciente] CHECK CONSTRAINT [FK_tPaciente_tPais]
GO
/****** Object:  ForeignKey [FK_tGlucometria_tPaciente]    Script Date: 10/24/2016 18:50:12 ******/
ALTER TABLE [dbo].[tGlucometria]  WITH CHECK ADD  CONSTRAINT [FK_tGlucometria_tPaciente] FOREIGN KEY([Num_SS])
REFERENCES [dbo].[tPaciente] ([NumSS])
GO
ALTER TABLE [dbo].[tGlucometria] CHECK CONSTRAINT [FK_tGlucometria_tPaciente]
GO
