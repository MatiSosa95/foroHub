create table autores(
    id bigint not null auto_increment,
    nombre varchar(100) not null,
    email varchar(500) not null,
    contrasenia varchar(100) not null,
    perfil varchar(100) not null,

    primary key(id)
    );

