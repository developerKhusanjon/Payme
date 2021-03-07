use temdb;

INSERT INTO category (id,name) VALUES (1,'clothe');
INSERT INTO category (id,name) VALUES (2,'food');
INSERT INTO category (id,name) VALUES (3,'book');
INSERT INTO category (id,name) VALUES (4,'item');
INSERT INTO category (id,name) VALUES (5,'course');

INSERT INTO `customer` (`id`,`name`,`country`,`address`,`phone`) VALUES (1,'Husanjon Tuychiboev','UZB','7599 Amir Temur Ave','(693) 575-8084');
INSERT INTO `customer` (`id`,`name`,`country`,`address`,`phone`) VALUES (2,'Alimov Aziz','UZB','7570 Wolfgen Ave','(693) 575-8084');
INSERT INTO `customer` (`id`,`name`,`country`,`address`,`phone`) VALUES (3,'Shokirov Holmat','UZB','79 Humo Street','(693) 575-8084');
INSERT INTO `customer` (`id`,`name`,`country`,`address`,`phone`) VALUES (4,'Zoe Smith','UK','7599 Lectus Ave','(693) 575-8084');
INSERT INTO `customer` (`id`,`name`,`country`,`address`,`phone`) VALUES (5,'Alex Bass','USA','7 Thomson street','(693) 575-8084');
INSERT INTO `customer` (`id`,`name`,`country`,`address`,`phone`) VALUES (6,'Ahmadjon Tuychiboev','UZB','75 Amir Temur Ave','(693) 505-8080');
INSERT INTO `customer` (`id`,`name`,`country`,`address`,`phone`) VALUES (7,'Alimov Eldor','RUS','770 Wolfgen Ave','(63) 575-7100');
INSERT INTO `customer` (`id`,`name`,`country`,`address`,`phone`) VALUES (8,'Holdorov Holmat','UZB','79 Humo Street','(693) 575-1211');
INSERT INTO `customer` (`id`,`name`,`country`,`address`,`phone`) VALUES (9,'Jhon Smith','UK','199 Lectus Ave','(3) 115-8055');
INSERT INTO `customer` (`id`,`name`,`country`,`address`,`phone`) VALUES (10,'Alex Fury','USA','71 Thomson street','(1) 555-1090');
INSERT INTO `customer` (`id`,`name`,`country`,`address`,`phone`) VALUES (11,'Dilmrod Ochilov','UZB','9 Amir Temur Ave','(998) 575-1014');
INSERT INTO `customer` (`id`,`name`,`country`,`address`,`phone`) VALUES (12,'Soliyev Ali','KG','750 Wolfgen Ave','(193) 575-8199');
INSERT INTO `customer` (`id`,`name`,`country`,`address`,`phone`) VALUES (13,'Jim Kerry','AUS','79 Sydney Street','(693) 575-8444');
INSERT INTO `customer` (`id`,`name`,`country`,`address`,`phone`) VALUES (14,'Zoe Watson','UK','7599 Lectus Ave','(693) 412-1066');
INSERT INTO `customer` (`id`,`name`,`country`,`address`,`phone`) VALUES (15,'Max Bass','USA','27 Thomson street','(693) 575-8004');

INSERT INTO `ordr` VALUES (1,'2015/10/11',12),(2,'2015/11/02',14),(3,'2015/09/24',13),(4,'2016/12/22',10),(5,'2015/06/07',8),
                          (6,'2016/10/30',3),(7,'2016/01/07',12),(8,'2016/12/12',10),(9,'2015/09/07',2),(10,'2016/03/26',8),
                          (11,'2017/02/21',7),(12,'2016/08/13',8),(13,'2016/12/25',7),(14,'2015/06/21',1),(15,'2016/12/17',10),
                          (16,'2016/04/17',1),(17,'2016/01/16',14),(18,'2016/04/23',2),(19,'2016/04/24',12),(20,'2016/10/28',6),
                          (21,'2016/12/14',2),(22,'2015/11/12',2),(23,'2017/01/11',1),(24,'2016/07/21',9),(25,'2016/10/31',7),
                          (26,'2015/06/05',1),(27,'2015/03/27',15),(28,'2015/12/22',13),(29,'2015/10/20',7),(30,'2015/05/14',1),
                          (31,'2015/11/25',11),(32,'2016/09/14',3),(33,'2017/01/17',11),(34,'2015/11/22',2),(35,'2015/04/16',7),
                          (36,'2016/08/13',14),(37,'2017/02/05',1),(38,'2016/08/23',4),(39,'2017/01/04',3),(40,'2016/04/13',14),
                          (41,'2016/01/23',7),(42,'2017/01/12',5),(43,'2015/08/24',9),(44,'2016/11/06',11),(45,'2016/04/01',3);;

INSERT INTO `product` VALUES (1,'Bestseller book','Spring in Action','1234567',40.99,1,3),
                             (2,'High Demand Course','Spring Boot AmigosCode','1234568',50.00,2,5),
                             (3,'Good item in Big Sale','Adidas Running Shoes','1234569',35.55,3,1),
                             (4,'Best budget phone in 2020','Samsung A51','1234560',270.99,4,4),
                             (5,'It will be best food You ate ever','Andijoncha osh','1234567',1.99,5,2),
                             (6,'Bestseller book','Spring in Action','1234567',40.99,1,3),
                             (7,'High Demand Course','Spring Boot AmigosCode','1234568',50.00,2,5),
                             (8,'Good item in Big Sale','Adidas Running Shoes','1234569',35.55,3,1),
                             (9,'Best budget phone in 2020','Samsung A51','1234560',270.99,4,4),
                             (10,'It will be best food You ate ever','Andijoncha osh','1234567',1.99,5,2),
                             (11,'Bestseller book','Spring in Action','1234567',40.99,1,3),
                             (12,'High Demand Course','Spring Boot AmigosCode','1234568',50.00,2,5),
                             (13,'Good item in Big Sale','Adidas Running Shoes','1234569',35.55,3,1),
                             (14,'Best budget phone in 2020','Samsung A51','1234560',270.99,4,4),
                             (15,'It will be best food You ate ever','Andijoncha osh','1234567',1.99,5,2);
#
INSERT INTO `detail` (`id`,`ord_id`,`pr_id`,`quantity`) VALUES (1,1,1,22),(2,2,2,1),(3,null,3,3),(4,null,4,11),(5,5,5,41),
                                                               (6,6,1,5),(7,7,1,21),(8,8,1,7),(9,9,1,1),(10,10,1,41),
                                                               (11,11,1,6),(12,12,1,7),(13,13,1,91),(14,null,1,1),(15,15,1,6),
                                                               (16,16,1,4),(17,17,1,21),(18,null,1,91),(19,19,1,11),(20,20,5,8);

INSERT INTO `invoice` VALUES (1,150,'2016-08-24','2017-08-24',1),(2,118,'2017-02-04','2015-11-29',2),(3,138,'2016-06-12','2015-12-27',null),(4,70,'2016-09-22','2018-12-11',4),(5,43,'2016-10-04','2015-10-22',5),
                             (6,111,'2016-02-22','2017-08-20',null),(7,108,'2015-02-04','2015-10-29',6),(8,17,'2016-06-02','2015-12-07',8),(9,71,'2016-09-26','2018-12-11',null),(10,73,'2016-11-04','2015-11-22',10),
                             (11,15,'2016-04-24','2016-08-14',11),(12,18,'2018-02-04','2018-11-29',null),(13,128,'2016-06-11','2015-12-17',13),(14,74,'2016-09-12','2018-02-11',14),(15,13,'2016-10-04','2015-11-22',null);

# # INSERT INTO `invoice` (`amount`,`due`,`issued`) VALUES (10,'2015-11-09','2017-06-07'),(79,'2015-11-12','2016-03-21'),(117,'2015-08-04','2017-07-09'),(39,'2016-08-05','2016-03-04'),(20,'2015-03-26','2016-03-21'),(120,'2017-02-28','2017-06-08'),(103,'2017-01-30','2016-02-26'),(2,'2016-07-22','2016-11-06'),(79,'2015-06-17','2017-02-22'),(140,'2017-01-14','2017-10-01');
#
INSERT INTO `payment` (`id`,`amount`,`time`,`inv_id`) VALUES (1,26,'2016-08-30 09:15:44',1),(2,66,'2016-08-29 01:15:46',2),(3,56,'2015-08-22 09:05:24',4),(4,2,'2015-08-13 19:10:12',4),(5,113,'2016-06-30 15:18:13',5),
                                                             (6,6,'2016-08-30 09:15:44',1),(7,71,'2016-08-29 01:15:46',5),(8,56,'2015-08-22 09:05:24',2),(9,2,'2015-08-13 19:10:12',5),(10,103,'2016-06-30 15:18:13',10),
                                                             (11,4,'2016-08-30 09:15:44',11),(12,6,'2016-08-29 01:15:46',13),(13,16,'2015-08-22 09:05:24',13),(14,2,'2015-08-13 19:10:12',14),(15,3,'2016-06-30 15:18:13',1);

#INSERT INTO `payment` (`amount`,`time`) VALUES (149,'2016-04-06 21:15:46'),(115,'2016-05-03 11:15:46'),(135,'2015-09-17 12:45:06'),(27,'2016-06-23 01:15:46'),(116,'2016-06-04 01:15:46'),(138,'2016-12-17 01:15:46');
