-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: nofly
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `destinations`
--

DROP TABLE IF EXISTS `destinations`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `destinations` (
                                `DestinationID` int NOT NULL,
                                `type` text,
                                `location` text NOT NULL,
                                `nearest_Amtrak` int DEFAULT NULL,
                                `nearest_Grayhound` int DEFAULT NULL,
                                `nearest_port` int DEFAULT NULL,
                                `rental_car` tinyint(1) DEFAULT NULL,
                                `activity` text,
                                `overnight` text,
                                PRIMARY KEY (`DestinationID`),
                                UNIQUE KEY `destinations_DestinationID_uindex` (`DestinationID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `destinations`
--

LOCK TABLES `destinations` WRITE;
/*!40000 ALTER TABLE `destinations` DISABLE KEYS */;
INSERT INTO `destinations` VALUES (54880,'Park','Wisconsin',137,14,0,15,'Scenic','Camp'),(80809,'Mountain','Colorado',100,30,0,29,'Scenic','Multiple');
/*!40000 ALTER TABLE `destinations` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reviews`
--

DROP TABLE IF EXISTS `reviews`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `reviews` (
                           `userid` int NOT NULL,
                           `DestinationID` int NOT NULL,
                           `image` text,
                           `review_text` text,
                           KEY `reviews_destinations_DestinationID_fk` (`DestinationID`),
                           KEY `reviews_users_id_fk` (`userid`),
                           CONSTRAINT `reviews_destinations_DestinationID_fk` FOREIGN KEY (`DestinationID`) REFERENCES `destinations` (`DestinationID`),
                           CONSTRAINT `reviews_users_id_fk` FOREIGN KEY (`userid`) REFERENCES `users` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reviews`
--

LOCK TABLES `reviews` WRITE;
/*!40000 ALTER TABLE `reviews` DISABLE KEYS */;
INSERT INTO `reviews` VALUES (7,54880,'images/LittleM.jpg','TextReviews/Pattison1.txt'),(12,54880,'images/seasonal.JPG','TextReviews/Pattison2.txt');
/*!40000 ALTER TABLE `reviews` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
                         `id` int NOT NULL AUTO_INCREMENT,
                         `first_name` varchar(25) DEFAULT NULL,
                         `last_name` varchar(30) DEFAULT NULL,
                         `user_name` varchar(15) DEFAULT NULL,
                         `password` varchar(30) DEFAULT NULL,
                         `screen_name` varchar(30) DEFAULT NULL,
                         PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'Joe','Coyne','jcoyne','enyoC','CoolKid'),(2,'Tina','Miller','tmiller','relliM','fishhateme'),(3,'Jayme','Stolt','jystolt','tlotS','whystayhome'),(4,'Jim','Stolt','jstolt','tlotS','phisherpun'),(5,'Laura','Johnson','ljohnson','nosnhoH','Treehugger'),(6,'Marcy','Smith','msmith','htimS','climbOn'),(7,'Kari','Metford','kmetford','drofteM','Huntress'),(8,'Phillip','Walters','pwalters','sretlaW','Snowman'),(9,'John','Wheeler','jwheeler','releehW','Wheelee'),(10,'Jeanne','Wood','jwood','dooW','lostNotFound'),(11,'Tom','Cotten','tcotten','nettoC','offscreen'),(12,'Susan','Jones','sjones','senoJ','add_venture'),(13,'Brian','Miles','bmiles','seliM','WhyNot'),(14,'Mike','Jackson','mjackson','noskcaK','Eaglemann'),(15,'Sara','Cooper','scooper','repooC','skinnyski'),(16,'Lisa','Jordan','ljorden','nadroJ','Creek'),(17,'Jason','Shardt','jshardt','tdrahS','prairewalker'),(18,'Amder','Brenner','abrenner','rennerB','RVRoadee');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-11-01 19:25:54
