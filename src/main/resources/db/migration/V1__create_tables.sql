create table if not exists workspaces
(
    id         bigserial,
    name       varchar(20) not null,
    created_at timestamp   not null default current_timestamp,
    created_by bigint      not null,
    updated_at timestamp   not null default current_timestamp,
    updated_by bigint      not null,
    deleted_at timestamp   null,
    primary key (id)
);

create unique index on workspaces (name) where deleted_at is null;

comment on table workspaces is '워크스페이스';

comment on column workspaces.id is 'ID';
comment on column workspaces.name is '워크스페이스명';
comment on column workspaces.created_at is '생성일시';
comment on column workspaces.created_by is '생성자 ID';
comment on column workspaces.updated_at is '수정일시';
comment on column workspaces.updated_by is '수정자 ID';
comment on column workspaces.deleted_at is '삭제일시(softDelete)';
