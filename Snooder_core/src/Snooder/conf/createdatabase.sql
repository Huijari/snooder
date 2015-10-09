/*
Created: 29/09/2015
Modified: 29/09/2015
Project: DER_TCC
Model: TCC
Company: OP Group
Author: Fábio Henrique, Lucas César, Matheus Barbosa e Pedro Henrique
Version: 1.0
Database: PostgreSQL 9.2
*/


-- Create tables section -------------------------------------------------

-- Table Usuario

CREATE TABLE "Usuario"(
 "cod_usuario" BigSerial NOT NULL,
 "nom_usuario" Character(60) NOT NULL,
 "num_telefone" Integer,
 "des_email" Character(50) NOT NULL,
 "cod_senha" Character(64) NOT NULL
)
;

-- Add keys for table Usuario

ALTER TABLE "Usuario" ADD CONSTRAINT "PK_Usuario" PRIMARY KEY ("cod_usuario")
;

-- Table Funcionario

CREATE TABLE "Funcionario"(
 "cod_usuario" Bigint NOT NULL,
 "cod_cargo" Bigint NOT NULL
)
;

-- Create indexes for table Funcionario

CREATE INDEX "IX_Relationship5" ON "Funcionario" ("cod_cargo")
;

-- Add keys for table Funcionario

ALTER TABLE "Funcionario" ADD CONSTRAINT "Key2" PRIMARY KEY ("cod_usuario")
;

-- Table Objeto

CREATE TABLE "Objeto"(
 "cod_usuario" Bigint NOT NULL,
 "cod_objeto" BigSerial NOT NULL,
 "cod_cat_objeto" Bigint NOT NULL,
 "cod_localidade" Bigint NOT NULL,
 "cod_usuario_entregue" Bigint,
 "dat_entrada" Date NOT NULL,
 "dat_saida" Date,
 "des_objeto" Text NOT NULL,
 "idt_status" Character(1) NOT NULL
)
;

-- Create indexes for table Objeto

CREATE INDEX "IX_Relationship6" ON "Objeto" ("cod_cat_objeto")
;

CREATE INDEX "IX_Relationship8" ON "Objeto" ("cod_localidade")
;

CREATE INDEX "IX_Relationship1" ON "Objeto" ("cod_usuario_entregue")
;

-- Add keys for table Objeto

ALTER TABLE "Objeto" ADD CONSTRAINT "Key3" PRIMARY KEY ("cod_objeto","cod_usuario")
;

-- Table categoria_Objeto

CREATE TABLE "categoria_Objeto"(
 "cod_cat_objeto" BigSerial NOT NULL,
 "des_cat_objeto" Character(40) NOT NULL
)
;

-- Add keys for table categoria_Objeto

ALTER TABLE "categoria_Objeto" ADD CONSTRAINT "Key5" PRIMARY KEY ("cod_cat_objeto")
;

-- Table Localidade

CREATE TABLE "Localidade"(
 "cod_localidade" BigSerial NOT NULL,
 "des_localidade" Character(50) NOT NULL
)
;

-- Add keys for table Localidade

ALTER TABLE "Localidade" ADD CONSTRAINT "Key6" PRIMARY KEY ("cod_localidade")
;

-- Table Cargo_Funcionario

CREATE TABLE "Cargo_Funcionario"(
 "cod_cargo" BigSerial NOT NULL,
 "des_cargo" Character(40) NOT NULL
)
;

-- Add keys for table Cargo_Funcionario

ALTER TABLE "Cargo_Funcionario" ADD CONSTRAINT "Key7" PRIMARY KEY ("cod_cargo")
;

-- Table Mensagens

CREATE TABLE "Mensagens"(
 "cod_mensagem" BigSerial NOT NULL,
 "cod_usuario" Bigint NOT NULL,
 "cod_assunto" Bigint NOT NULL,
 "dat_mensagem" Timestamp(9) NOT NULL,
 "des_conteudo" Text NOT NULL
)
;

-- Create indexes for table Mensagens

CREATE INDEX "IX_Relationship2" ON "Mensagens" ("cod_usuario")
;

CREATE INDEX "IX_Relationship3" ON "Mensagens" ("cod_assunto")
;

-- Add keys for table Mensagens

ALTER TABLE "Mensagens" ADD CONSTRAINT "Key9" PRIMARY KEY ("cod_mensagem")
;

-- Table Assunto

CREATE TABLE "Assunto"(
 "cod_assunto" BigSerial NOT NULL,
 "nom_assunto" Character(20) NOT NULL
)
;

-- Add keys for table Assunto

ALTER TABLE "Assunto" ADD CONSTRAINT "Key10" PRIMARY KEY ("cod_assunto")
;

-- Create relationships section ------------------------------------------------- 

ALTER TABLE "Funcionario" ADD CONSTRAINT "Heranca" FOREIGN KEY ("cod_usuario") REFERENCES "Usuario" ("cod_usuario") ON DELETE CASCADE ON UPDATE CASCADE
;

ALTER TABLE "Funcionario" ADD CONSTRAINT "Cargo_funcionario" FOREIGN KEY ("cod_cargo") REFERENCES "Cargo_Funcionario" ("cod_cargo") ON DELETE NO ACTION ON UPDATE NO ACTION
;

ALTER TABLE "Objeto" ADD CONSTRAINT "Categoria_objeto" FOREIGN KEY ("cod_cat_objeto") REFERENCES "categoria_Objeto" ("cod_cat_objeto") ON DELETE NO ACTION ON UPDATE NO ACTION
;

ALTER TABLE "Objeto" ADD CONSTRAINT "Proprietario_objeto" FOREIGN KEY ("cod_usuario") REFERENCES "Usuario" ("cod_usuario") ON DELETE NO ACTION ON UPDATE NO ACTION
;

ALTER TABLE "Objeto" ADD CONSTRAINT "Localidade_objeto" FOREIGN KEY ("cod_localidade") REFERENCES "Localidade" ("cod_localidade") ON DELETE NO ACTION ON UPDATE NO ACTION
;

ALTER TABLE "Objeto" ADD CONSTRAINT "Relationship1" FOREIGN KEY ("cod_usuario_entregue") REFERENCES "Usuario" ("cod_usuario") ON DELETE NO ACTION ON UPDATE NO ACTION
;

ALTER TABLE "Mensagens" ADD CONSTRAINT "Relationship2" FOREIGN KEY ("cod_usuario") REFERENCES "Usuario" ("cod_usuario") ON DELETE NO ACTION ON UPDATE NO ACTION
;

ALTER TABLE "Mensagens" ADD CONSTRAINT "Relationship3" FOREIGN KEY ("cod_assunto") REFERENCES "Assunto" ("cod_assunto") ON DELETE NO ACTION ON UPDATE NO ACTION
;