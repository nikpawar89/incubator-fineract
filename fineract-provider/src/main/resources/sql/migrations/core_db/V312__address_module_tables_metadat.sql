--
-- Licensed to the Apache Software Foundation (ASF) under one
-- or more contributor license agreements. See the NOTICE file
-- distributed with this work for additional information
-- regarding copyright ownership. The ASF licenses this file
-- to you under the Apache License, Version 2.0 (the
-- "License"); you may not use this file except in compliance
-- with the License. You may obtain a copy of the License at
--
-- http://www.apache.org/licenses/LICENSE-2.0
--
-- Unless required by applicable law or agreed to in writing,
-- software distributed under the License is distributed on an
-- "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
-- KIND, either express or implied. See the License for the
-- specific language governing permissions and limitations
-- under the License.



-- code inserts
INSERT INTO `m_code` (`code_name`, `is_system_defined`) VALUES ('STATE',1);
INSERT INTO `m_code` (`code_name`, `is_system_defined`) VALUES ('COUNTRY',1);
INSERT INTO `m_code` (`code_name`, `is_system_defined`) VALUES ('ADDRESS_TYPE',1);

-- inserts for STATE
INSERT INTO `m_code_value` (`code_id`, `code_value`,`order_position`, `is_active`) 
VALUES(
 (select id from m_code where code_name = 'STATE'), 'Andhra Pradesh', 0,1);
 INSERT INTO `m_code_value` (`code_id`, `code_value`,`order_position`, `is_active`) 
VALUES(
 (select id from m_code where code_name = 'STATE'), 'Arunachal Pradesh', 0,1);
 INSERT INTO `m_code_value` (`code_id`, `code_value`,`order_position`, `is_active`) 
VALUES(
 (select id from m_code where code_name = 'STATE'), 'Assam', 0,1);
 INSERT INTO `m_code_value` (`code_id`, `code_value`,`order_position`, `is_active`) 
VALUES(
 (select id from m_code where code_name = 'STATE'), 'Bihar', 0,1);
 INSERT INTO `m_code_value` (`code_id`, `code_value`,`order_position`, `is_active`) 
VALUES(
 (select id from m_code where code_name = 'STATE'), 'Chhattisgarh', 0,1);
 INSERT INTO `m_code_value` (`code_id`, `code_value`,`order_position`, `is_active`) 
VALUES(
 (select id from m_code where code_name = 'STATE'), 'Goa', 0,1);
 INSERT INTO `m_code_value` (`code_id`, `code_value`,`order_position`, `is_active`) 
VALUES(
 (select id from m_code where code_name = 'STATE'), 'GUJRAT', 0,1);
 INSERT INTO `m_code_value` (`code_id`, `code_value`,`order_position`, `is_active`) 
VALUES(
 (select id from m_code where code_name = 'STATE'), 'Haryana', 0,1);
  INSERT INTO `m_code_value` (`code_id`, `code_value`,`order_position`, `is_active`) 
VALUES(
 (select id from m_code where code_name = 'STATE'), 'Himachal Pradesh', 0,1);
  INSERT INTO `m_code_value` (`code_id`, `code_value`,`order_position`, `is_active`) 
VALUES(
 (select id from m_code where code_name = 'STATE'), 'Jammu and Kashmir', 0,1);
  INSERT INTO `m_code_value` (`code_id`, `code_value`,`order_position`, `is_active`) 
VALUES(
 (select id from m_code where code_name = 'STATE'), 'Jharkhand', 0,1);
  INSERT INTO `m_code_value` (`code_id`, `code_value`,`order_position`, `is_active`) 
VALUES(
 (select id from m_code where code_name = 'STATE'), 'Karnataka', 0,1);
  INSERT INTO `m_code_value` (`code_id`, `code_value`,`order_position`, `is_active`) 
VALUES(
 (select id from m_code where code_name = 'STATE'), 'Kerala', 0,1);
  INSERT INTO `m_code_value` (`code_id`, `code_value`,`order_position`, `is_active`) 
VALUES(
 (select id from m_code where code_name = 'STATE'), 'Madhya Pradesh', 0,1);
  INSERT INTO `m_code_value` (`code_id`, `code_value`,`order_position`, `is_active`) 
VALUES(
 (select id from m_code where code_name = 'STATE'), 'Maharashtra', 0,1);
  INSERT INTO `m_code_value` (`code_id`, `code_value`,`order_position`, `is_active`) 
VALUES(
 (select id from m_code where code_name = 'STATE'), 'Manipur', 0,1);
  INSERT INTO `m_code_value` (`code_id`, `code_value`,`order_position`, `is_active`) 
VALUES(
 (select id from m_code where code_name = 'STATE'), 'Meghalaya', 0,1);
  INSERT INTO `m_code_value` (`code_id`, `code_value`,`order_position`, `is_active`) 
VALUES(
 (select id from m_code where code_name = 'STATE'), 'Mizoram', 0,1);
  INSERT INTO `m_code_value` (`code_id`, `code_value`,`order_position`, `is_active`) 
VALUES(
 (select id from m_code where code_name = 'STATE'), 'Nagaland', 0,1);
  INSERT INTO `m_code_value` (`code_id`, `code_value`,`order_position`, `is_active`) 
VALUES(
 (select id from m_code where code_name = 'STATE'), 'Odisha', 0,1);
  INSERT INTO `m_code_value` (`code_id`, `code_value`,`order_position`, `is_active`) 
VALUES(
 (select id from m_code where code_name = 'STATE'), 'Punjab', 0,1);
  INSERT INTO `m_code_value` (`code_id`, `code_value`,`order_position`, `is_active`) 
VALUES(
 (select id from m_code where code_name = 'STATE'), 'Rajasthan', 0,1);
  INSERT INTO `m_code_value` (`code_id`, `code_value`,`order_position`, `is_active`) 
VALUES(
 (select id from m_code where code_name = 'STATE'), 'Sikkim', 0,1);
  INSERT INTO `m_code_value` (`code_id`, `code_value`,`order_position`, `is_active`) 
VALUES(
 (select id from m_code where code_name = 'STATE'), 'Tamil Nadu', 0,1);
  INSERT INTO `m_code_value` (`code_id`, `code_value`,`order_position`, `is_active`) 
VALUES(
 (select id from m_code where code_name = 'STATE'), 'Telangana', 0,1);
  INSERT INTO `m_code_value` (`code_id`, `code_value`,`order_position`, `is_active`) 
VALUES(
 (select id from m_code where code_name = 'STATE'), 'Tripura', 0,1);
  INSERT INTO `m_code_value` (`code_id`, `code_value`,`order_position`, `is_active`) 
VALUES(
 (select id from m_code where code_name = 'STATE'), 'Uttar Pradesh', 0,1);
  INSERT INTO `m_code_value` (`code_id`, `code_value`,`order_position`, `is_active`) 
VALUES(
 (select id from m_code where code_name = 'STATE'), 'Uttarakhand', 0,1);
  INSERT INTO `m_code_value` (`code_id`, `code_value`,`order_position`, `is_active`) 
VALUES(
 (select id from m_code where code_name = 'STATE'), 'West Bengal', 0,1);
 
 -- inserts for COUNTRY
 
   INSERT INTO `m_code_value` (`code_id`, `code_value`,`order_position`, `is_active`) 
VALUES(
 (select id from m_code where code_name = 'COUNTRY'), 'India', 0,1);
INSERT INTO `m_code_value` (`code_id`, `code_value`,`order_position`, `is_active`) 
VALUES(
 (select id from m_code where code_name = 'COUNTRY'), 'Srilanka', 0,1);
 INSERT INTO `m_code_value` (`code_id`, `code_value`,`order_position`, `is_active`) 
VALUES(
 (select id from m_code where code_name = 'COUNTRY'), 'Nigeria', 0,1);

-- inserts for address type
  INSERT INTO `m_code_value` (`code_id`, `code_value`,`order_position`, `is_active`) 
VALUES(
 (select id from m_code where code_name = 'ADDRESS_TYPE'), 'PERMANENT ADDRESS', 0,1);
  INSERT INTO `m_code_value` (`code_id`, `code_value`,`order_position`, `is_active`) 
VALUES(
 (select id from m_code where code_name = 'ADDRESS_TYPE'), 'OFFICE ADDRESS', 0,1);
  INSERT INTO `m_code_value` (`code_id`, `code_value`,`order_position`, `is_active`) 
VALUES(
 (select id from m_code where code_name = 'ADDRESS_TYPE'), 'CURRENT ADDRESS', 0,1);




-- configuration
INSERT INTO `c_configuration` (`name`, `value`, `date_value`, `enabled`, `is_trap_door`, `description`) VALUES ('Enable-Address', NULL, NULL, 1, 0, NULL);

-- add address table
CREATE TABLE `m_address` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`street` VARCHAR(100) NULL DEFAULT NULL,
	`address_line_1` VARCHAR(100) NULL DEFAULT NULL,
	`address_line_2` VARCHAR(100) NULL DEFAULT NULL,
	`address_line_3` VARCHAR(100) NULL DEFAULT NULL,
	`town_village` VARCHAR(100) NULL DEFAULT NULL,
	`city` VARCHAR(100) NULL DEFAULT NULL,
	`county_district` VARCHAR(100) NULL DEFAULT NULL,
	`state_province_id` INT(11) NULL DEFAULT NULL,
	`country_id` INT(11) NULL DEFAULT NULL,
	`postal_code` VARCHAR(10) NULL DEFAULT NULL,
	`latitude` DECIMAL(10,8) UNSIGNED NULL DEFAULT '0.00000000',
	`longitude` DECIMAL(10,8) UNSIGNED NULL DEFAULT '0.00000000',
	`created_by` VARCHAR(100) NULL DEFAULT NULL,
	`created_on` DATE NULL DEFAULT NULL,
	`updated_by` VARCHAR(100) NULL DEFAULT NULL,
	`updated_on` DATE NULL DEFAULT NULL,
	PRIMARY KEY (`id`),
	INDEX `address_fields_codefk1` (`state_province_id`),
	INDEX `address_fields_codefk2` (`country_id`),
	CONSTRAINT `address_fields_codefk1` FOREIGN KEY (`state_province_id`) REFERENCES `m_code_value` (`id`),
	CONSTRAINT `address_fields_codefk2` FOREIGN KEY (`country_id`) REFERENCES `m_code_value` (`id`)
)
ENGINE=InnoDB
AUTO_INCREMENT=1
;


-- entity address table
CREATE TABLE `m_client_address` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`client_id` BIGINT(20) NOT NULL DEFAULT '0',
	`address_id` BIGINT(20) NOT NULL DEFAULT '0',
	`address_type_id` INT(11) NOT NULL DEFAULT '0',
	`is_active` TINYINT(4) NOT NULL DEFAULT '0',
	PRIMARY KEY (`id`),
	INDEX `addressIdFk` (`address_id`),
	INDEX `address_codefk` (`address_type_id`),
	INDEX `clientaddressfk` (`client_id`),
	CONSTRAINT `address_codefk` FOREIGN KEY (`address_type_id`) REFERENCES `m_code_value` (`id`),
	CONSTRAINT `clientaddressfk` FOREIGN KEY (`client_id`) REFERENCES `m_client` (`id`)
)
ENGINE=InnoDB
AUTO_INCREMENT=1
;


-- field configuration
CREATE TABLE `m_field_configuration` (
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`entity` VARCHAR(100) NOT NULL,
	`subentity` VARCHAR(100) NOT NULL,
	`field` VARCHAR(100) NOT NULL,
	`is_enabled` TINYINT(4) NOT NULL,
	`is_mandatory` TINYINT(4) NOT NULL,
	`validation_regex` VARCHAR(50) NULL DEFAULT NULL,
	PRIMARY KEY (`id`)
)
ENGINE=InnoDB
AUTO_INCREMENT=1
;


INSERT INTO `m_field_configuration` ( `entity`, `subentity`, `field`, `is_enabled`, `is_mandatory`, `validation_regex`) VALUES
	('ADDRESS', 'CLIENT', 'addressType', 1, 0, ''),
	('ADDRESS', 'CLIENT', 'street', 1, 1, ''),
	('ADDRESS', 'CLIENT', 'address_line_1', 1, 0, ''),
	('ADDRESS', 'CLIENT', 'address_line_2', 1, 0, ''),
	('ADDRESS', 'CLIENT', 'address_line_3', 1, 0, ''),
	('ADDRESS', 'CLIENT', 'town_village', 0, 0, ''),
	('ADDRESS', 'CLIENT', 'city', 1, 0, ''),
	('ADDRESS', 'CLIENT', 'county_district', 0, 0, ''),
	('ADDRESS', 'CLIENT', 'state_province_id', 1, 0, ''),
	('ADDRESS', 'CLIENT', 'country_id', 1, 0, ''),
	('ADDRESS', 'CLIENT', 'postal_code', 1, 0, ''),
	('ADDRESS', 'CLIENT', 'latitude', 0, 0, ''),
	('ADDRESS', 'CLIENT', 'longitude', 0, 0, ''),
	('ADDRESS', 'CLIENT', 'created_by', 1, 0, ''),
	('ADDRESS', 'CLIENT', 'created_on', 1, 0, ''),
	('ADDRESS', 'CLIENT', 'updated_by', 1, 0, ''),
	('ADDRESS', 'CLIENT', 'updated_on', 1, 0, ''),
	('ADDRESS', 'CLIENT', 'is_active', 1, 0, '');