/*MySQL Scripts to create Login & Register tables.*/


CREATE TABLE `User` ( 
`user_id` INT NULL AUTO_INCREMENT , 
`name` VARCHAR(32) NOT NULL , 
`dob` DATE NOT NULL , 
`username` VARCHAR(32) NOT NULL , 
`password` VARCHAR(32) NOT NULL , 
PRIMARY KEY (`user_id`)
) ENGINE = InnoDB;

ALTER TABLE `User` ADD UNIQUE(`username`);
