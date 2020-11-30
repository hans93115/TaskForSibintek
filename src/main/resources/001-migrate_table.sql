create table migrate_table
(
	json_column jsonb,
	id integer
);

alter table migrate_table owner to postgres;

