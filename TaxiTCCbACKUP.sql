/*
SQLyog Community Edition- MySQL GUI v6.54
MySQL - 5.0.51a-community-nt : Database - taxi
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

CREATE DATABASE /*!32312 IF NOT EXISTS*/`taxi` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `taxi`;

/*Table structure for table `cliente` */

DROP TABLE IF EXISTS `cliente`;

CREATE TABLE `cliente` (
  `CODCLIENTE` int(11) NOT NULL auto_increment,
  `NOMECLI` varchar(100) default NULL,
  `EMAILCLI` varchar(200) default NULL,
  `TELEFONECLI` varchar(15) default NULL,
  `CELULARCLI` varchar(15) default NULL,
  `DATANASCLI` date default NULL,
  `DATACADASTROCLI` date default NULL,
  PRIMARY KEY  (`CODCLIENTE`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;

/*Data for the table `cliente` */

insert  into `cliente`(`CODCLIENTE`,`NOMECLI`,`EMAILCLI`,`TELEFONECLI`,`CELULARCLI`,`DATANASCLI`,`DATACADASTROCLI`) values (10,'ClientePadrão',NULL,NULL,NULL,NULL,'2013-02-12'),(11,'Luciano','luciano@live.com','(11)1227-7399','(16)8929-8718','1975-06-15','2013-02-17'),(12,'Fernando','fer.nando@live.com','(28)9287-1282','(18)2782-9102','1984-06-17','2013-02-22'),(13,'Ogemundo','gemundinho@live.com','(16)9288-4920','(16)3092-7749','1993-09-12','2013-04-06'),(14,'Julia','julia.amelia@live.com','(16)9839-0201','(16)3709-8267','1994-08-16','2013-05-09');

/*Table structure for table `diariafunc` */

DROP TABLE IF EXISTS `diariafunc`;

CREATE TABLE `diariafunc` (
  `CODDIARIAFUNC` int(11) NOT NULL auto_increment,
  `CODFUNC` int(11) default NULL,
  `CODVEICULO` int(11) default NULL,
  `DATATRABALHO` date default NULL,
  `HORAINICIO` time default NULL,
  `HORATERMINO` time default NULL,
  `SITUACAODIARIA` char(1) default NULL COMMENT 'Aqui sera informado se o funcionario estara em serviço ou nao,\n            para isso sera utilizado os caracteres\n            S para Terminado\n            N para Não Terminado.',
  `LOCALCORRIDA` varchar(2) default NULL COMMENT 'Aqui sera informado o local do funcionario',
  `SITUACAOCORRIDA` char(1) default NULL COMMENT 'Aqui sera informado se o funcionario esta em corrida ou nao',
  PRIMARY KEY  (`CODDIARIAFUNC`),
  KEY `FK_FUNCIONARIO_DIARIAFUNC` (`CODFUNC`),
  KEY `FK_VEICULO_DIARIAFUNC` (`CODVEICULO`),
  CONSTRAINT `FK_FUNCIONARIO_DIARIAFUNC` FOREIGN KEY (`CODFUNC`) REFERENCES `funcionario` (`CODFUNC`),
  CONSTRAINT `FK_VEICULO_DIARIAFUNC` FOREIGN KEY (`CODVEICULO`) REFERENCES `veiculo` (`CODVEICULO`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=latin1 COMMENT='Aqui sera registrado dados de quando os funcionarios entrare';

/*Data for the table `diariafunc` */

insert  into `diariafunc`(`CODDIARIAFUNC`,`CODFUNC`,`CODVEICULO`,`DATATRABALHO`,`HORAINICIO`,`HORATERMINO`,`SITUACAODIARIA`,`LOCALCORRIDA`,`SITUACAOCORRIDA`) values (10,3,1,'2013-04-29','21:41:38','17:45:38','N','R1','N'),(11,4,2,'2013-04-29','21:41:49','17:45:50','N','R2','N'),(12,6,3,'2013-04-29','21:41:58','17:45:53','N','R1','N'),(13,6,4,'2013-04-29','21:42:06','17:45:55','N','R2','N'),(14,7,5,'2013-04-27','21:42:12','17:45:57','N','R1','N'),(16,7,4,'2013-05-01','18:40:10','18:47:41','N','R1','N'),(17,4,1,'2013-05-01','18:45:23','18:46:41','N','R2','N'),(18,3,2,'2013-05-01','18:48:49','19:17:52','N','R1','N'),(19,6,6,'2013-05-01','18:49:01','20:04:18','N','R2','N'),(20,5,3,'2013-05-01','18:57:11','20:04:21','N','R2','N'),(21,5,5,'2013-05-01','19:11:06',NULL,'N','R2','N'),(22,3,1,'2013-05-01','19:32:21','20:04:24','N','R1','N'),(24,7,2,'2013-05-05','12:05:45','20:04:25','N','R2','N'),(25,4,5,'2013-05-09','22:38:12','20:04:27','N','R1','N'),(26,9,1,'2013-06-04','20:06:57',NULL,'S','R1','N'),(27,10,5,'2013-06-04','20:07:20',NULL,'S','R2','N'),(30,8,3,'2013-06-04','20:27:19',NULL,'S','R1','N');

/*Table structure for table `enderecocli` */

DROP TABLE IF EXISTS `enderecocli`;

CREATE TABLE `enderecocli` (
  `CODENDERECOCLI` int(11) NOT NULL auto_increment,
  `CODCLIENTE` int(11) default NULL,
  `CEPCLI` varchar(15) default NULL,
  `UFCLI` varchar(2) default NULL,
  `CIDADECLI` varchar(50) default NULL,
  `BAIRROCLI` varchar(50) default NULL,
  `ENDERECOCLI` varchar(100) default NULL,
  `NUMEROCASACLI` varchar(10) default NULL,
  `COMPLEMENTOCLI` varchar(100) default NULL,
  `CODIGOCLIENTE` int(11) default NULL,
  PRIMARY KEY  (`CODENDERECOCLI`),
  KEY `FK_CLIENTE_ENDERECOCLI` (`CODCLIENTE`),
  CONSTRAINT `FK_CLIENTE_ENDERECOCLI` FOREIGN KEY (`CODCLIENTE`) REFERENCES `cliente` (`CODCLIENTE`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

/*Data for the table `enderecocli` */

insert  into `enderecocli`(`CODENDERECOCLI`,`CODCLIENTE`,`CEPCLI`,`UFCLI`,`CIDADECLI`,`BAIRROCLI`,`ENDERECOCLI`,`NUMEROCASACLI`,`COMPLEMENTOCLI`,`CODIGOCLIENTE`) values (1,11,'78.902-982','SP','Franca','Leporace','rua amelhio pinto','982',NULL,11),(2,12,'19.827-829','AP','Ribeirao Preto','Avalesca','rua 10','2892',NULL,12),(3,12,'12.298-290','SP','Franca','são joaquim','rua deserta','278',NULL,12),(4,11,'71.872-891','AL','franca',NULL,NULL,NULL,NULL,NULL),(5,11,NULL,NULL,'Franca','Conceição','Rua Santo Mais de aquino','90',NULL,NULL),(6,13,'17.230-309','AP','Franca','Abril','rua amelia','1234','aviao',13),(7,11,NULL,NULL,'Restinga','Isaac','Rua Principal','1230',NULL,NULL);

/*Table structure for table `fornecedor` */

DROP TABLE IF EXISTS `fornecedor`;

CREATE TABLE `fornecedor` (
  `CODFORN` int(11) NOT NULL auto_increment,
  `NOMEFORN` varchar(100) default NULL,
  `CPFFORN` varchar(15) default NULL,
  `RGFORN` varchar(15) default NULL,
  `ORGANIZACAOFORN` varchar(50) default NULL,
  `CNPJFORN` varchar(20) default NULL,
  `TIPOFORN` char(1) default NULL COMMENT 'O tipo de fornecedor sera representado por\n            F = para Fisico\n            J = para Juridico',
  `ENDERECOFORN` varchar(100) default NULL,
  `BAIRROFORN` varchar(50) default NULL,
  `CIDADEFORN` varchar(50) default NULL,
  `UFFORN` varchar(2) default NULL,
  `CEPFORN` varchar(15) default NULL,
  `EMAILFORN` varchar(200) default NULL,
  `SITEFORN` varchar(200) default NULL,
  `TELEFONEFORN` varchar(15) default NULL,
  `CELULARFORN` varchar(15) default NULL,
  `FAXFORN` varchar(20) default NULL,
  `CONTATOFORN` varchar(100) default NULL,
  PRIMARY KEY  (`CODFORN`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `fornecedor` */

insert  into `fornecedor`(`CODFORN`,`NOMEFORN`,`CPFFORN`,`RGFORN`,`ORGANIZACAOFORN`,`CNPJFORN`,`TIPOFORN`,`ENDERECOFORN`,`BAIRROFORN`,`CIDADEFORN`,`UFFORN`,`CEPFORN`,`EMAILFORN`,`SITEFORN`,`TELEFONEFORN`,`CELULARFORN`,`FAXFORN`,`CONTATOFORN`) values (1,'José Almeida',NULL,NULL,'Francalto','12.389.917/2899-01','J','Rua maritaca','Alencar','Franca','SP','89.762-781','josezim.jj@gmail.com','www.jose.com','(16)8997-2689','(11)9868-2993',NULL,'Almeida'),(2,'Maria Pecida','102.881.900-38','189.209.818-92','Totonha',NULL,'F','av. rio preto','Alacaza','Beirinhos','AC','12.839-012','maria@live.com','maria.com','(89)2818-9200','(12)3910-2981','','Melica'),(3,'Carlos Aleco',NULL,NULL,'Amelita','12.312.312/3123-12','J','Rua abelha','comeia','Barzinho','MG','12.389-120','carlos@hotmail.com','carlos.com','(12)3398-7289','(19)2391-8283',NULL,'Carlinho'),(4,'Dito',NULL,NULL,'Pro Car','12.873.992/8289-20','J','rua Amelia','Derminio','Franca','SP','12.374-910','dito@cel.com',NULL,'(16)8898-7821','(16)9827-8391',NULL,NULL),(5,'André',NULL,NULL,'Santa Casa','12.987.289/1023-92','J','Rua Major Nicacio','Centro','Franca','SP','14.895-032','andre@live.com','www.santacasa.com','(11)9287-3802','(16)3784-9002','827810','Maria'),(6,'Emily','172.683.090-12','112.318.776-28','Hondas Auto',NULL,'F','av. Rios','Avarazinho','Urladiana','RJ','14.675-902','emily.castro@hotmail.com','www.hodaautos.com','(12)8978-9301','(09)1789-1003','187290','Castro');

/*Table structure for table `funcionario` */

DROP TABLE IF EXISTS `funcionario`;

CREATE TABLE `funcionario` (
  `CODFUNC` int(11) NOT NULL auto_increment,
  `NOMEFUNC` varchar(100) default NULL,
  `CPFFUNC` varchar(15) default NULL,
  `CNHFUNC` varchar(20) default NULL,
  `LETRACNHFUNC` varchar(3) default NULL,
  `CEPFUNC` varchar(15) default NULL,
  `UFFUNC` varchar(2) default NULL,
  `CIDADEFUNC` varchar(20) default NULL,
  `BAIRROFUNC` varchar(20) default NULL,
  `ENDERECOFUNC` varchar(100) default NULL,
  `NUMEROCASAFUNC` varchar(10) default NULL,
  `COMPLEMENTOFUNC` varchar(100) default NULL,
  `TELEFONEFUNC` varchar(15) default NULL,
  `CELULARFUNC` varchar(15) default NULL,
  `EMAILFUNC` varchar(200) default NULL,
  `DATANASFUNC` date default NULL,
  `DATAADMICAOFUNC` date default NULL,
  `CASADO` char(1) default NULL COMMENT 'Sera utilizado os seguintes caracteres para as representações\n            S = para Sim\n            N = para Nao',
  `FILHOS` char(1) default NULL COMMENT 'Sera utilizado os seguintes caracteres para as representações\n            S = para Sim\n            N = para Nao',
  `NUMEROFILHOSFUNC` varchar(10) default NULL,
  `CTPSFUNC` varchar(15) default NULL,
  `SERIECTPSFUNC` varchar(3) default NULL,
  `FOTO` char(1) default NULL,
  PRIMARY KEY  (`CODFUNC`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

/*Data for the table `funcionario` */

insert  into `funcionario`(`CODFUNC`,`NOMEFUNC`,`CPFFUNC`,`CNHFUNC`,`LETRACNHFUNC`,`CEPFUNC`,`UFFUNC`,`CIDADEFUNC`,`BAIRROFUNC`,`ENDERECOFUNC`,`NUMEROCASAFUNC`,`COMPLEMENTOFUNC`,`TELEFONEFUNC`,`CELULARFUNC`,`EMAILFUNC`,`DATANASFUNC`,`DATAADMICAOFUNC`,`CASADO`,`FILHOS`,`NUMEROFILHOSFUNC`,`CTPSFUNC`,`SERIECTPSFUNC`,`FOTO`) values (3,'Vanilda','123.431.234-12',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2013-01-12','S','N',NULL,NULL,NULL,NULL),(4,'Tiao','111.111.111-11',NULL,NULL,'11.111-111','SP',NULL,NULL,NULL,NULL,NULL,'(11)1111-1111','(11)1111-1111',NULL,'2012-12-12',NULL,'S','N',NULL,NULL,NULL,NULL),(5,'Esvair','123.432.123-41','',NULL,'14.547-892','SP','Franca','Santa','haha','1234','89772','(12)8798-7299','(12)9300-1982','nao tem','1973-06-18','2006-12-14','S','S','4','',NULL,NULL),(6,'Eduardo','189.836.290-91',NULL,NULL,'14.877-399','SP','Franca','Aeroporto 3','rua abicissa','1467','Perto do bar','(16)9097-2791','(16)3787-6789','eduardo@gmail.com','1997-09-12','2013-02-12','N','N',NULL,NULL,NULL,NULL),(7,'Victor','123.129.129-31','',NULL,'12.323-221','SP','Franca','Derminio','Rua Antonio','106','Infancia','(12)3125-6654','(12)3451-2314','victor@live.com',NULL,NULL,'N','N',NULL,NULL,NULL,NULL),(8,'Tales','187.893.087-12','',NULL,'18.728-100','SP','Franca','derminio','rua amelia','1872','sem calsada','(89)2861-7289','(71)8299-7271','tales@live.com',NULL,NULL,'N','N',NULL,NULL,NULL,NULL),(9,'Abraão Silva Castro','178.290.281-28','',NULL,'14.902-727','SP','Franca','Ibiraci','Av. São Paulo','1238','perto central','(16)9828-7299','(91)8729-9102','abraao@live.com','1987-12-21',NULL,'S','N',NULL,NULL,NULL,NULL),(10,'Juliana','198.728.900-20','',NULL,'19.999-999','SP','Ribeirão Preto','Amelianas','av. pretas','1252','Praça','(16)7892-0019','(16)8892-0903','juliana@live.com','1992-09-12',NULL,'N','N',NULL,NULL,NULL,NULL);

/*Table structure for table `pedidostaxi` */

DROP TABLE IF EXISTS `pedidostaxi`;

CREATE TABLE `pedidostaxi` (
  `CODPEDIDO` int(11) NOT NULL auto_increment,
  `CODDIARIAFUNC` int(11) default NULL,
  `CODCLIENTE` int(11) default NULL,
  `REFERENCIA` varchar(150) default NULL,
  `ENDERECOATUAL` varchar(150) default NULL,
  `CIDADEATUAL` varchar(50) default NULL,
  `BAIRROATUAL` varchar(50) default NULL,
  `CIDADEDESTINO` varchar(50) default NULL,
  `ENDERECODESTINO` varchar(150) default NULL,
  `NUMEROCASADESTINO` varchar(7) default NULL,
  `BAIRRODESTINO` varchar(50) default NULL,
  `DATAPEDIDO` date default NULL,
  `HORAFINALIZACAO` time default NULL,
  `HORAPEDIDO` time default NULL,
  `DISTANCIACORRIDA` double default NULL,
  `PRECOCORRIDA` double default NULL,
  `SITUACAO` char(1) default NULL,
  PRIMARY KEY  (`CODPEDIDO`),
  KEY `FK_CLIENTE_PEDIDOTAXI` (`CODCLIENTE`),
  KEY `FK_DIARIAFUNC_PEDIDOSTAXI` (`CODDIARIAFUNC`),
  CONSTRAINT `FK_CLIENTE_PEDIDOTAXI` FOREIGN KEY (`CODCLIENTE`) REFERENCES `cliente` (`CODCLIENTE`),
  CONSTRAINT `FK_DIARIAFUNC_PEDIDOSTAXI` FOREIGN KEY (`CODDIARIAFUNC`) REFERENCES `diariafunc` (`CODDIARIAFUNC`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=latin1;

/*Data for the table `pedidostaxi` */

insert  into `pedidostaxi`(`CODPEDIDO`,`CODDIARIAFUNC`,`CODCLIENTE`,`REFERENCIA`,`ENDERECOATUAL`,`CIDADEATUAL`,`BAIRROATUAL`,`CIDADEDESTINO`,`ENDERECODESTINO`,`NUMEROCASADESTINO`,`BAIRRODESTINO`,`DATAPEDIDO`,`HORAFINALIZACAO`,`HORAPEDIDO`,`DISTANCIACORRIDA`,`PRECOCORRIDA`,`SITUACAO`) values (3,10,11,NULL,NULL,NULL,NULL,'Franca','rua amelhio pinto','982','Leporace','2013-05-17','20:32:42','14:49:18',NULL,53,'N'),(7,11,11,'',NULL,NULL,NULL,'Franca','rua amelhio pinto','982','Leporace','2013-05-23','14:29:57','14:29:14',NULL,NULL,'N'),(8,12,12,NULL,NULL,NULL,NULL,'Ribeirao Preto','rua 10','2892','Avalesca','2013-05-29','01:54:57','21:39:01',NULL,29,'N'),(9,13,11,NULL,NULL,NULL,NULL,'Franca','Rua Santo Mais de aquino','90','Conceição','2013-03-02','19:41:42',NULL,NULL,34,'N'),(10,14,11,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2013-04-02','01:54:49',NULL,NULL,16,'N'),(11,10,12,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,'2013-03-02','01:54:46',NULL,NULL,NULL,'N'),(12,11,11,NULL,NULL,NULL,NULL,'Franca','rua amelhio pinto','982','Leporace','2013-03-26','01:54:52','22:22:20',NULL,NULL,'N'),(13,11,12,NULL,NULL,NULL,NULL,'Ribeirao Preto','rua 10','2892','Avalesca','2013-04-05',NULL,NULL,NULL,12,'N'),(14,13,13,NULL,NULL,NULL,NULL,'Franca','rua amelia','1234','Abril','2013-04-06','10:00:07','01:56:11',NULL,6,'N'),(16,14,11,'','Rua Amelia','Franca','São joaquim','Restinga','Rua Principal','1230','Issac','2013-04-18','21:39:24','22:41:19',NULL,NULL,'N'),(21,20,11,'Praça','Rua Amelia','Franca','Capim','Franca','rua amelhio pinto','982','Leporace','2013-05-05','21:39:26','12:14:28',NULL,NULL,'N'),(22,22,11,NULL,'Av. Amelia','Franca','São Joaquim','Franca','rua amelhio pinto','982','Leporace','2013-05-09','20:32:26','22:55:01',0,14,'N');

/*Table structure for table `veiculo` */

DROP TABLE IF EXISTS `veiculo`;

CREATE TABLE `veiculo` (
  `CODVEICULO` int(11) NOT NULL auto_increment,
  `CODFORN` int(11) default NULL,
  `PLACAVEI` varchar(8) default NULL,
  `MARCAVEI` varchar(20) default NULL,
  `NOMEVEI` varchar(100) default NULL,
  `TIPOVEI` char(1) default NULL COMMENT 'O tipo do veiculo sera identificado por \n            C = para Carros\n            M = para Motos',
  `CORVEI` varchar(50) default NULL,
  `DATAAQUISICAOVEI` date default NULL,
  `LICENSIAMENTO` varchar(100) default NULL,
  `DATAVENCIMENTOGARANTIA` date default NULL,
  `PRECOIPVA` double default NULL,
  PRIMARY KEY  (`CODVEICULO`),
  KEY `FK_FORNECEDOR_VEICULO` (`CODFORN`),
  CONSTRAINT `FK_FORNECEDOR_VEICULO` FOREIGN KEY (`CODFORN`) REFERENCES `fornecedor` (`CODFORN`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

/*Data for the table `veiculo` */

insert  into `veiculo`(`CODVEICULO`,`CODFORN`,`PLACAVEI`,`MARCAVEI`,`NOMEVEI`,`TIPOVEI`,`CORVEI`,`DATAAQUISICAOVEI`,`LICENSIAMENTO`,`DATAVENCIMENTOGARANTIA`,`PRECOIPVA`) values (1,3,'kbx-0921','Yamaha','CBX-300','M','Preta','2012-09-26',NULL,'2017-01-10',270),(2,1,'MND-8982','Audi','A4','C','Branco','2013-01-08',NULL,'2018-04-26',569),(3,2,'jng-8902','Volkswagen','Gol','C','Cinza','2012-09-12',NULL,'2020-09-12',129),(4,2,'BGK-8292','Mercedes','Murcielago','C','Branca','2008-09-12',NULL,'2045-09-18',1280),(5,4,'BGK-1829','Honda','CG-150','M','Preta','2013-04-06',NULL,'2019-09-12',134),(6,2,'bjd-1234','Volkswagen','Strada','C','Preta','2013-12-12','Agora','2015-12-12',1231),(7,4,'RYE-9098','Yamaha','CBX-300','M','Preta','2013-05-09','Sem','2016-12-02',123),(8,6,'UNW-1928','Hyundai','i30','C','Preto','0012-09-12','Autorizado','0014-01-12',1298);

/*Table structure for table `vistoriadiaria` */

DROP TABLE IF EXISTS `vistoriadiaria`;

CREATE TABLE `vistoriadiaria` (
  `CODVISTORIA` int(11) NOT NULL auto_increment,
  `CODDIARIAFUNC` int(11) default NULL,
  `LOCALVISTORIA` varchar(100) default NULL COMMENT 'Oleo,\n            combustivel,\n            pneu,\n            motor,\n            outros.',
  `DESCRICAO` varchar(200) default NULL,
  `EXTRAS` varchar(200) default NULL,
  `OBSERVACAO` varchar(200) default NULL,
  `Automovel` varchar(150) default NULL,
  PRIMARY KEY  (`CODVISTORIA`),
  KEY `FK_DIARIAFUNC_VISTORIADIARIA` (`CODDIARIAFUNC`),
  CONSTRAINT `FK_DIARIAFUNC_VISTORIADIARIA` FOREIGN KEY (`CODDIARIAFUNC`) REFERENCES `diariafunc` (`CODDIARIAFUNC`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

/*Data for the table `vistoriadiaria` */

insert  into `vistoriadiaria`(`CODVISTORIA`,`CODDIARIAFUNC`,`LOCALVISTORIA`,`DESCRICAO`,`EXTRAS`,`OBSERVACAO`,`Automovel`) values (1,25,'Motor','Pneu Careca',NULL,'nao tem step','5');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
