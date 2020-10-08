CREATE TABLE users
(
    id       BIGSERIAL PRIMARY KEY,
    username VARCHAR NOT NULL UNIQUE,
    password VARCHAR NOT NULL,
    role     VARCHAR NOT NULL
);

CREATE TABLE clothes
(
    id          BIGSERIAL PRIMARY KEY,
    name        VARCHAR NOT NULL UNIQUE,
    temperature VARCHAR NOT NULL
);

INSERT INTO users (username, password, role)
VALUES ('admin', '$2a$10$kBXIhlFoy6hwSYFj8uZj9OzLjxlV/qn9eKJCdwR8mjDP8HC89hMmu', 'ADMIN');

INSERT INTO clothes (name, temperature) VALUES
('Cap', 'COLDLY'),('Warm shoes', 'COLDLY'),('Warm jacket', 'COLDLY'),
('Gloves', 'COLDLY'),('Jeans', 'COMFORT'),('Shoes', 'COMFORT'),
('Shirt', 'COMFORT'),('Сloak', 'COMFORT'),('Shorts', 'HOT'),
('Flip-flops', 'HOT'),('Sunglasses', 'HOT'),('T-shirt', 'HOT');