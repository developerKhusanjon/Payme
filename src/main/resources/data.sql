use temdb;

INSERT INTO category (name) VALUES ('clothe');
INSERT INTO category (name) VALUES ('food');
INSERT INTO category (name) VALUES ('book');
INSERT INTO category (name) VALUES ('item');
INSERT INTO category (name) VALUES ('course');

INSERT INTO `customer` (`name`,`country`,`address`,`phone`) VALUES ('Husajon Tuychiboev','UZB','7599 Amir Temur Ave','(693) 575-8084');
INSERT INTO `customer` (`name`,`country`,`address`,`phone`) VALUES ('Alimov Aziz','UZB','7570 Wolfgen Ave','(693) 575-8084');
INSERT INTO `customer` (`name`,`country`,`address`,`phone`) VALUES ('Shokirov Holmat','UZB','79 Humo Street','(693) 575-8084');
INSERT INTO `customer` (`name`,`country`,`address`,`phone`) VALUES ('Zoe Smith','UK','7599 Lectus Ave','(693) 575-8084');
INSERT INTO `customer` (`name`,`country`,`address`,`phone`) VALUES ('Alex Bass','USA','7 Thomson street','(693) 575-8084');

INSERT INTO `ordr` VALUES (1,'2015-04-15', 1),(2,'2015-05-15', 2),(3,'2015-06-15', 3),
                          (4,'2016-04-15', 4),(5,'2015-04-10', 5);

INSERT INTO `product` VALUES (1,'Bestseller book','Spring in Action','1234567',40.99,1,3),
                             (2,'High Demand Course','Spring Boot AmigosCode','1234568',50.00,2,5),
                             (3,'Good item in Big Sale','Adidas Running Shoes','1234569',35.55,3,1),
                             (4,'Best budget phone in 2020','Samsung A51','1234560',270.99,4,4),
                             (5,'It will be best food You ate ever','Andijoncha osh','1234567',1.99,5,2);

INSERT INTO `detail` (`id`,`ord_id`,`pr_id`,`quantity`) VALUES (1,1,1,22),(2,2,2,21),(3,3,3,91),(4,4,4,11),(5,5,5,41);

INSERT INTO `invoice` VALUES (1,150,'2016-08-24','2015-08-24',1),(2,118,'2017-02-04','2015-11-29',2),(3,138,'2016-06-12','2015-12-27',3),(4,70,'2016-09-22','2015-12-11',4),(5,73,'2016-10-04','2015-10-22',5);

# INSERT INTO `invoice` (`amount`,`due`,`issued`) VALUES (10,'2015-11-09','2017-06-07'),(79,'2015-11-12','2016-03-21'),(117,'2015-08-04','2017-07-09'),(39,'2016-08-05','2016-03-04'),(20,'2015-03-26','2016-03-21'),(120,'2017-02-28','2017-06-08'),(103,'2017-01-30','2016-02-26'),(2,'2016-07-22','2016-11-06'),(79,'2015-06-17','2017-02-22'),(140,'2017-01-14','2017-10-01');

INSERT INTO `payment` (`amount`,`time`) VALUES (26,'2016-08-30 09:15:44'),(66,'2016-08-29 01:15:46'),(56,'2015-08-22 09:05:24'),(2,'2015-08-13 19:10:12'),(113,'2016-06-30 15:18:13');

INSERT INTO `payment` (`amount`,`time`) VALUES (149,'2016-04-06 21:15:46'),(115,'2016-05-03 11:15:46'),(135,'2015-09-17 12:45:06'),(27,'2016-06-23 01:15:46'),(116,'2016-06-04 01:15:46'),(138,'2016-12-17 01:15:46');
