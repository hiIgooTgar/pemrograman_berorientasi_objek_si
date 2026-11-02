CREATE DATABASE 24sa11a159_pbo_penjualan;
USE 24sa11a159_pbo_penjualan;

DROP DATABASE 24sa11a159_pbo_penjualan

CREATE TABLE supplier (
	kode_supplier TINYINT(4) PRIMARY KEY AUTO_INCREMENT,
	nama_supplier VARCHAR(50) UNIQUE,
	alamat TEXT,
	telp VARCHAR(18),
	email VARCHAR(65) NULL DEFAULT '-'
);

CREATE TABLE barang (
	kode_barang CHAR(4) PRIMARY KEY,
	nama_barang VARCHAR(50),
	harga_jual INT,
	stok TINYINT(4) NULL DEFAULT 0,
	kode_supplier TINYINT(4),
	
	FOREIGN KEY (kode_supplier) REFERENCES supplier(kode_supplier)
);


CREATE TABLE penjualan (
	tgl_penjualan DATETIME, 
	nota_penjualan TINYINT(4) PRIMARY KEY,
	total_penjualan BIGINT(20)
);


CREATE TABLE detail_penjualan (
	nota_penjualan TINYINT,
	kode_barang CHAR(4) UNIQUE,
	jumlah_item TINYINT(4),
	total INT,
	
	FOREIGN KEY (nota_penjualan) REFERENCES penjualan(nota_penjualan),
	FOREIGN KEY (kode_barang) REFERENCES barang(kode_barang)
);
