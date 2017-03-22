Login Screen for Student Grade Calculator.

Simple login screen following these videos - https://www.youtube.com/watch?v=T7Z4GVFaT4A&list=PLe60o7ed8E-TztoF2K3y4VdDgT6APZ0ka&index=4

Need to host MYSQL Database with phpmyadmin installed so app can communicate with Databse and store the login details.

There are Two .php files within this project under root /LoginRegister folder which need to be placed within the public_html folder of your webhost.

SQL Statements:

CREATE TABLE `User` ( 
`user_id` INT NULL AUTO_INCREMENT , 
`name` VARCHAR(32) NOT NULL , 
`age` INT(4) NOT NULL , 
`username` VARCHAR(32) NOT NULL , 
`password` VARCHAR(32) NOT NULL , 
PRIMARY KEY (`user_id`)
) ENGINE = InnoDB;

ALTER TABLE `User` ADD UNIQUE(`username`);

Volley fix version comes with this application, will need to upgrade sdk to andriod 25.0.0 to get it to work.




