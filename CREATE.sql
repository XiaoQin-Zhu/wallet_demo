CREATE DATABASE wallet_demo;
USE wallet_demo;

#账户信息表
DROP TABLE IF EXISTS `cust_info`;
CREATE TABLE `cust_info`(
	cust_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT COMMENT'账户id',
	cust_status INT NOT NULL DEFAULT 0 COMMENT'账户状态',
	cust_amount DECIMAL(10,2) UNSIGNED NOT NULL DEFAULT 0 COMMENT'账户余额',
	cust_pwd VARCHAR(128) DEFAULT NULL COMMENT '支付密码',
	user_id INT UNSIGNED NOT NULL DEFAULT 0 COMMENT'用户id',
	FOREIGN KEY(user_id) REFERENCES user_info(user_id)
);

#银行卡信息表
DROP TABLE IF EXISTS `bankcard_info`;
CREATE TABLE `bankcard_info`(
	bankcard_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT COMMENT'id',
	bankcard_no VARCHAR(128) DEFAULT NULL COMMENT'银行卡号',
	bankcard_type INT NOT NULL DEFAULT 0 COMMENT'银行卡类型',
	tel VARCHAR(11) DEFAULT NULL COMMENT'银行卡绑定的手机号',
	cardholder_name VARCHAR(30) DEFAULT NULL COMMENT'持卡人姓名',
	cardholder_no VARCHAR(18) DEFAULT NULL COMMENT'持卡人身份证'	
);

#账户和银行卡关系表
DROP TABLE IF EXISTS `cust_bankcard`;
CREATE TABLE `cust_bankcard`(
	cust_bankcard_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT COMMENT'id',
	cust_id INT UNSIGNED NOT NULL DEFAULT 0 COMMENT'账户id',
	FOREIGN KEY(cust_id) REFERENCES cust_info(cust_id),
	bankcard_id INT UNSIGNED NOT NULL DEFAULT 0 COMMENT'银行卡信息id',
	FOREIGN KEY(bankcard_id) REFERENCES bankcard_info(bankcard_id)
);


#用户账单表
DROP TABLE IF EXISTS `cust_bill`;
CREATE TABLE `cust_bill`(
	bill_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT COMMENT'id',
	bill_from VARCHAR(50) DEFAULT NULL COMMENT'账单来源',
	bill_type INT NOT NULL DEFAULT 0 COMMENT'账单类型',
	bill_amount DECIMAL(10,2) UNSIGNED NOT NULL DEFAULT 0 COMMENT'账单金额',
	add_time TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT'添加时间',
	income_expense INT NOT NULL DEFAULT 0 COMMENT'收入或支出，0支出，1收入',
	cust_id INT UNSIGNED NOT NULL DEFAULT 0 COMMENT'账户id',
	FOREIGN KEY(cust_id) REFERENCES cust_info(cust_id)
);

#因为没有用户表，建表会报1005

