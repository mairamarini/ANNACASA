DELETE FROM user;
INSERT INTO user(id, firstName, lastName, phone, email) VALUES
  (1, 'Rui', 'Fiono', '989898989','fiono@gmail.com');

DELETE FROM house;
INSERT INTO house(id, address, budget, houseType, rooms, user_id) VALUES
  (2, 'Av Eugénio de Andrade Lote 63 1º esq Fundão', 5000, 'apartment', 'T3', 1);

DELETE FROM work;
INSERT INTO work(id, workType) VALUES
  (4, 'canalização');

DELETE FROM company;
INSERT INTO company(id, email, name, phone, work_id) VALUES
  (3, 'canalizacao@sapo.pt', 'Saúl Canalizador', '912345678', 4);

