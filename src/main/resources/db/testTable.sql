--liquibase formatted sql

--changeset A.Ilinykh:5

create table test_table
(
    id         bigint                   not null primary key,
    created_at timestamp with time zone not null default now()
);