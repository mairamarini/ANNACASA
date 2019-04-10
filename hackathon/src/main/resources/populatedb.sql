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
  (4, 'plumbing'),
  (5, 'electrical'),
  (6, 'cleaning'),
  (7, 'locksmith');


DELETE FROM company;
INSERT INTO company(id, email, name, phone, work_id) VALUES
  (1, 'madeiras&carpintaria@gmail.com', 'Madeiras && Carpintaria', '321654987', 1),
  (2, 'carpintariaaaaa@gmail.com', 'Carpintaria AAAA', '987654321', 1),
  (3, 'de_coracao@gmail.com', 'DeCoração', '789456123', 2),
  (4, 'de_coradora@gmail.com', 'De Decoradora', '896745231', 2),
  (5, 'constru@gmail.com', 'Contruções Constru', '907856342', 3),
  (6, 'riquito_construcoes@gmail.com', 'Riquito Construções', '292929345', 3),
  (7, 'solar_sol@gmail.com', 'Solar Sol', '963909090', 4),
  (8, 'install_mm@gmail.com', 'Instalações MM', '919028787', 4),
  (9, 'instalacoes.eletricasss@gmail.com', 'Instalações Eletricas SS', '912345678', 5),
  (10, 'energias.fundao@gmail.com', 'Energias Fundão', '981234756', 5),
  (11, 'limpeza.as@gmail.com', 'Limpeza AS', '789612345', 6),
  (12, 'serralheria_rm@gmail.com', 'Serralheria RM', '890567234', 7),
  (13, 'serralheria.hs', 'Serralheria HS', '777888123', 7);


DELETE FROM work_house;
INSERT INTO work_house(work_id, houses_id) VALUES
(4, 2);