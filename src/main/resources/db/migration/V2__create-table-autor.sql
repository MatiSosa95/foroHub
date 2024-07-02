create table autores(
    id bigint not null auto_increment,
    nombre varchar(100) not null,
    email varchar(500) not null,
    contrasenia varchar(100) not null,
    perfil varchar(100) not null,
    nombre varchar(100) not null,
    categoria varchar(100) not null,

    primary key(id),

     constraint fk_autor_topico_id foreign key(topico_id) references topicos(id),
    );