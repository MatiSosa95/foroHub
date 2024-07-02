create table topicos(
    id bigint not null auto_increment,
    titulo varchar(100) not null,
    mensaje varchar(500) not null,
    fechaCreacion dateTime not null,
    estado varchar(100) not null,
    nombre varchar(100) not null,
    categoria varchar(100) not null,

    primary key(id),

     constraint fk_topicos_autor_id foreign key(autor_id) references autores(id),
    );