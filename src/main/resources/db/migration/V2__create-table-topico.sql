create table topicos(
    id bigint not null auto_increment,
    autor_id bigint not null,
    titulo varchar(100) not null,
    mensaje varchar(500) not null,
    estado varchar(100) not null,
    curso varchar(100) not null,

    primary key(id),

     constraint fk_topicos_autor_id foreign key(autor_id) references autores(id)
    );