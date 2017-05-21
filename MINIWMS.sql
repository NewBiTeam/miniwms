-- MySQL dump 10.13  Distrib 5.7.11, for Win64 (x86_64)
--
-- Host: localhost    Database: miniwms
-- ------------------------------------------------------
-- Server version	5.7.11-log
use wms;
/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `brand_details`
--

DROP TABLE IF EXISTS `brand_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `brand_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created` timestamp(6) NULL DEFAULT NULL,
  `modified` timestamp(6) NULL DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `company_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `brand_details`
--

LOCK TABLES `brand_details` WRITE;
/*!40000 ALTER TABLE `brand_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `brand_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `category_details`
--

DROP TABLE IF EXISTS `category_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `category_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category_details`
--

LOCK TABLES `category_details` WRITE;
/*!40000 ALTER TABLE `category_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `category_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `company_details`
--

DROP TABLE IF EXISTS `company_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `company_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created` timestamp(6) NULL DEFAULT NULL,
  `modified` timestamp(6) NULL DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `anothername` varchar(45) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `issystem` tinyint(1) DEFAULT NULL,
  `contact_name` varchar(45) DEFAULT NULL,
  `contact_tel` varchar(45) DEFAULT NULL,
  `contact_fax` varchar(45) DEFAULT NULL,
  `contact_email` varchar(45) DEFAULT NULL,
  `contact_qq` varchar(45) DEFAULT NULL,
  `contact_msn` varchar(45) DEFAULT NULL,
  `contact_desc` varchar(255) DEFAULT NULL,
  `sku_prev` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `company_details`
--

LOCK TABLES `company_details` WRITE;
/*!40000 ALTER TABLE `company_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `company_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `company_role`
--

DROP TABLE IF EXISTS `company_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `company_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created` timestamp(6) NULL DEFAULT NULL,
  `modified` timestamp(6) NULL DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `company_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `company_role`
--

LOCK TABLES `company_role` WRITE;
/*!40000 ALTER TABLE `company_role` DISABLE KEYS */;
/*!40000 ALTER TABLE `company_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `company_user`
--

DROP TABLE IF EXISTS `company_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `company_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created` timestamp(6) NULL DEFAULT NULL,
  `modified` timestamp(6) NULL DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `tel` varchar(45) DEFAULT NULL,
  `cname` varchar(45) DEFAULT NULL,
  `company_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `company_user`
--

LOCK TABLES `company_user` WRITE;
/*!40000 ALTER TABLE `company_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `company_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `company_user_has_role`
--

DROP TABLE IF EXISTS `company_user_has_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `company_user_has_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `company_user_has_role`
--

LOCK TABLES `company_user_has_role` WRITE;
/*!40000 ALTER TABLE `company_user_has_role` DISABLE KEYS */;
/*!40000 ALTER TABLE `company_user_has_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `consignee_details`
--

DROP TABLE IF EXISTS `consignee_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `consignee_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created` timestamp(6) NULL DEFAULT NULL,
  `modified` timestamp(6) NULL DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `contact_name` varchar(45) DEFAULT NULL,
  `contact_tel` varchar(45) DEFAULT NULL,
  `contact_fax` varchar(45) DEFAULT NULL,
  `contact_email` varchar(45) DEFAULT NULL,
  `contact_qq` varchar(45) DEFAULT NULL,
  `contact_msn` varchar(45) DEFAULT NULL,
  `contact_desc` varchar(255) DEFAULT NULL,
  `company_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `consignee_details`
--

LOCK TABLES `consignee_details` WRITE;
/*!40000 ALTER TABLE `consignee_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `consignee_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customize_report`
--

DROP TABLE IF EXISTS `customize_report`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customize_report` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created` timestamp(6) NULL DEFAULT NULL,
  `modified` timestamp(6) NULL DEFAULT NULL,
  `creator_id` int(11) DEFAULT NULL,
  `modifier_id` int(11) DEFAULT NULL,
  `title` varchar(45) DEFAULT NULL,
  `sql_content` text,
  `usage_count` int(11) DEFAULT NULL,
  `company_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customize_report`
--

LOCK TABLES `customize_report` WRITE;
/*!40000 ALTER TABLE `customize_report` DISABLE KEYS */;
/*!40000 ALTER TABLE `customize_report` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `location_details`
--

DROP TABLE IF EXISTS `location_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `location_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created` timestamp(6) NULL DEFAULT NULL,
  `modified` timestamp(6) NULL DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `usage` tinyint(1) DEFAULT NULL,
  `XCoord` varchar(45) DEFAULT NULL,
  `YCoord` varchar(45) DEFAULT NULL,
  `ZCoord` varchar(45) DEFAULT NULL,
  `warehouse_id` int(11) DEFAULT NULL,
  `company_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `location_details`
--

LOCK TABLES `location_details` WRITE;
/*!40000 ALTER TABLE `location_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `location_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `new_table`
--

DROP TABLE IF EXISTS `new_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `new_table` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created` timestamp(6) NULL DEFAULT NULL,
  `modified` timestamp(6) NULL DEFAULT NULL,
  `supplier_id` int(11) DEFAULT NULL,
  `date` timestamp(6) NULL DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `company_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `billnumber` varchar(45) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `customer_billnumber` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `new_table`
--

LOCK TABLES `new_table` WRITE;
/*!40000 ALTER TABLE `new_table` DISABLE KEYS */;
/*!40000 ALTER TABLE `new_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role_has_menu`
--

DROP TABLE IF EXISTS `role_has_menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role_has_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) DEFAULT NULL,
  `menu_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_has_menu`
--

LOCK TABLES `role_has_menu` WRITE;
/*!40000 ALTER TABLE `role_has_menu` DISABLE KEYS */;
/*!40000 ALTER TABLE `role_has_menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sotck_in_entries`
--

DROP TABLE IF EXISTS `sotck_in_entries`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sotck_in_entries` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `in_id` int(11) DEFAULT NULL,
  `item_id` int(11) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `location_id` int(11) DEFAULT NULL,
  `UDF1` varchar(255) DEFAULT NULL,
  `UDF2` varchar(255) DEFAULT NULL,
  `UDF3` varchar(255) DEFAULT NULL,
  `UDF4` varchar(255) DEFAULT NULL,
  `UDF5` varchar(255) DEFAULT NULL,
  `UDF6` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sotck_in_entries`
--

LOCK TABLES `sotck_in_entries` WRITE;
/*!40000 ALTER TABLE `sotck_in_entries` DISABLE KEYS */;
/*!40000 ALTER TABLE `sotck_in_entries` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stock_check`
--

DROP TABLE IF EXISTS `stock_check`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stock_check` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `start_at` timestamp(6) NULL DEFAULT NULL,
  `end_at` timestamp(6) NULL DEFAULT NULL,
  `company_id` int(11) DEFAULT NULL,
  `operator_id` int(11) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stock_check`
--

LOCK TABLES `stock_check` WRITE;
/*!40000 ALTER TABLE `stock_check` DISABLE KEYS */;
/*!40000 ALTER TABLE `stock_check` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stock_check_entries`
--

DROP TABLE IF EXISTS `stock_check_entries`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stock_check_entries` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `check_id` int(11) DEFAULT NULL,
  `inventory_id` int(11) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `check_quantity` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stock_check_entries`
--

LOCK TABLES `stock_check_entries` WRITE;
/*!40000 ALTER TABLE `stock_check_entries` DISABLE KEYS */;
/*!40000 ALTER TABLE `stock_check_entries` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stock_entries`
--

DROP TABLE IF EXISTS `stock_entries`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stock_entries` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `inventory_id` int(11) DEFAULT NULL,
  `item_id` int(11) DEFAULT NULL,
  `date` timestamp(6) NULL DEFAULT NULL,
  `type` varchar(10) DEFAULT NULL,
  `in_id` int(11) DEFAULT NULL,
  `out_id` int(11) DEFAULT NULL,
  `check_id` int(11) DEFAULT NULL,
  `opening_stock` int(11) DEFAULT NULL,
  `closing_stock` int(11) DEFAULT NULL,
  `company_id` int(11) DEFAULT NULL,
  `operator_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stock_entries`
--

LOCK TABLES `stock_entries` WRITE;
/*!40000 ALTER TABLE `stock_entries` DISABLE KEYS */;
/*!40000 ALTER TABLE `stock_entries` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stock_inventory`
--

DROP TABLE IF EXISTS `stock_inventory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stock_inventory` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created` timestamp(6) NULL DEFAULT NULL,
  `modified` timestamp(6) NULL DEFAULT NULL,
  `locked` tinyint(1) DEFAULT NULL,
  `item_id` int(11) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `last_operator_id` int(11) DEFAULT NULL,
  `company_id` int(11) DEFAULT NULL,
  `location_id` int(11) DEFAULT NULL,
  `in_id` int(11) DEFAULT NULL,
  `UDF1` varchar(255) DEFAULT NULL,
  `UDF2` varchar(255) DEFAULT NULL,
  `UDF3` varchar(255) DEFAULT NULL,
  `UDF4` varchar(255) DEFAULT NULL,
  `UDF5` varchar(255) DEFAULT NULL,
  `UDF6` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stock_inventory`
--

LOCK TABLES `stock_inventory` WRITE;
/*!40000 ALTER TABLE `stock_inventory` DISABLE KEYS */;
/*!40000 ALTER TABLE `stock_inventory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stock_item`
--

DROP TABLE IF EXISTS `stock_item`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stock_item` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `SKU` varchar(45) DEFAULT NULL,
  `created` timestamp(6) NULL DEFAULT NULL,
  `modified` timestamp(6) NULL DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `barcode` varchar(45) DEFAULT NULL,
  `weight` varchar(45) DEFAULT NULL,
  `volume` varchar(45) DEFAULT NULL,
  `brand_id` int(11) DEFAULT NULL,
  `category_id` int(11) DEFAULT NULL,
  `UOM` varchar(10) DEFAULT NULL,
  `hazard_flag` tinyint(1) DEFAULT NULL,
  `company_id` int(11) DEFAULT NULL,
  `location_id` int(11) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stock_item`
--

LOCK TABLES `stock_item` WRITE;
/*!40000 ALTER TABLE `stock_item` DISABLE KEYS */;
/*!40000 ALTER TABLE `stock_item` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stock_item_photo`
--

DROP TABLE IF EXISTS `stock_item_photo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stock_item_photo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `item_id` int(11) DEFAULT NULL,
  `path` varchar(255) DEFAULT NULL,
  `upload_date` timestamp(6) NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stock_item_photo`
--

LOCK TABLES `stock_item_photo` WRITE;
/*!40000 ALTER TABLE `stock_item_photo` DISABLE KEYS */;
/*!40000 ALTER TABLE `stock_item_photo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stock_out`
--

DROP TABLE IF EXISTS `stock_out`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stock_out` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created` timestamp(6) NULL DEFAULT NULL,
  `modified` timestamp(6) NULL DEFAULT NULL,
  `consignee_id` int(11) DEFAULT NULL,
  `date` timestamp(6) NULL DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `company_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `billnumber` varchar(45) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `customer_billnumber` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stock_out`
--

LOCK TABLES `stock_out` WRITE;
/*!40000 ALTER TABLE `stock_out` DISABLE KEYS */;
/*!40000 ALTER TABLE `stock_out` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stock_out_entries`
--

DROP TABLE IF EXISTS `stock_out_entries`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stock_out_entries` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `out_id` int(11) DEFAULT NULL,
  `item_id` int(11) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `inventory_id` int(11) DEFAULT NULL,
  `UDF1` varchar(255) DEFAULT NULL,
  `UDF2` varchar(255) DEFAULT NULL,
  `UDF3` varchar(255) DEFAULT NULL,
  `UDF4` varchar(255) DEFAULT NULL,
  `UDF5` varchar(255) DEFAULT NULL,
  `UDF6` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stock_out_entries`
--

LOCK TABLES `stock_out_entries` WRITE;
/*!40000 ALTER TABLE `stock_out_entries` DISABLE KEYS */;
/*!40000 ALTER TABLE `stock_out_entries` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `supplier_details`
--

DROP TABLE IF EXISTS `supplier_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `supplier_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created` timestamp(6) NULL DEFAULT NULL,
  `modified` timestamp(6) NULL DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `contact_name` varchar(45) DEFAULT NULL,
  `contact_tel` varchar(45) DEFAULT NULL,
  `contact_fax` varchar(45) DEFAULT NULL,
  `contact_email` varchar(45) DEFAULT NULL,
  `contact_qq` varchar(45) DEFAULT NULL,
  `contact_msn` varchar(45) DEFAULT NULL,
  `contact_desc` varchar(255) DEFAULT NULL,
  `company_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supplier_details`
--

LOCK TABLES `supplier_details` WRITE;
/*!40000 ALTER TABLE `supplier_details` DISABLE KEYS */;
/*!40000 ALTER TABLE `supplier_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_menu`
--

DROP TABLE IF EXISTS `sys_menu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `url` varchar(255) DEFAULT NULL,
  `level` int(11) DEFAULT NULL,
  `pid` int(11) DEFAULT NULL,
  `index` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_menu`
--

LOCK TABLES `sys_menu` WRITE;
/*!40000 ALTER TABLE `sys_menu` DISABLE KEYS */;
/*!40000 ALTER TABLE `sys_menu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `warehouse`
--

DROP TABLE IF EXISTS `warehouse`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `warehouse` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created` timestamp(6) NULL DEFAULT NULL,
  `modified` timestamp(6) NULL DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `contact_name` varchar(45) DEFAULT NULL,
  `contact_tel` varchar(45) DEFAULT NULL,
  `contact_fax` varchar(45) DEFAULT NULL,
  `contact_email` varchar(45) DEFAULT NULL,
  `contact_qq` varchar(45) DEFAULT NULL,
  `contact_msn` varchar(45) DEFAULT NULL,
  `contact_desc` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `warehouse`
--

LOCK TABLES `warehouse` WRITE;
/*!40000 ALTER TABLE `warehouse` DISABLE KEYS */;
/*!40000 ALTER TABLE `warehouse` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-11-15 15:57:30
