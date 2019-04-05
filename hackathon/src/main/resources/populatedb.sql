DELETE FROM user;
INSERT INTO user(id, name, phone, email, password) VALUES
  (1, 'Rui Fiono', '989898989','fiono@gmail.com', 'password123');

DELETE FROM house;
INSERT INTO house(id, address, budget, houseType, rooms, user_id) VALUES
  (2, 'Av Eugénio de Andrade Lote 63 1º esq Fundão', 5000, 'apartment', 'T3', 1);

DELETE FROM work;
INSERT INTO work(id, workType) VALUES
  (1, 'carpentry'),
  (2, 'decoration'),
  (3, 'rebuild'),
  (4, 'pumbling'),
  (5, 'electrical'),
  (6, 'cleaning'),
  (7, 'locksmith');


DELETE FROM company;
INSERT INTO company(id, email, name, phone, work_id) VALUES
  (1, 'macambi@macambi.com', 'Macambi - Madeiras, Carpintaria E Imóveis da Beira Interior', '275776010', 1),
  (2, 'geral@carpintariamateus.com', 'Carpintaria Mateus, Ltda', '275961185', 1),
  (3, '', 'D CORAÇÃO', '275771110', 2),
  (4, '', 'Requinte Decoradora', '275771843', 2),
  (5, '', 'Contruções José Ramos Gil Ltda', '275772254', 3),
  (6, '', 'Henrique Candeias-contruções de Edifícios Lda', '215772844', 3),
  (7, '', 'Solcelsius Ltda', '961641672', 4),
  (8, '', 'Marques Instalações Ltda', '933825905', 4),
  (9, '', 'Jogri-Instalações Eléctricas Unipessoal Lda', '9275107139', 5),
  (10, '', 'Energias Primo Lda', '275773200', 5),
  (11, '', 'Limpezas Silvestre Lda', '275662222', 6),
  (12, '', 'Fundalum-serralheria De Alumínios Lda', '275752880', 7),
  (13, '', 'Inoxcasa-construções Decorativa em Inox Lda', '275773687', 7);


DELETE FROM work_house;
INSERT INTO work_house(work_id, houses_id) VALUES
(4, 2);