CREATE TABLE drivers (
	id serial PRIMARY KEY,
	name VARCHAR ( 50 ) NOT NULL,
	type VARCHAR ( 50 ),
	delivery_type VARCHAR ( 50 )
);
