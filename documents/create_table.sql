CREATE TABLE articles (
  id   serial PRIMARY KEY
, name text   NOT NULL
, url  text   NOT NULL
);

CREATE TABLE category (
  id   serial PRIMARY KEY
, name text   NOT NULL
);

CREATE TABLE selected_category (
  id          serial  PRIMARY KEY
, article_id  INTEGER NOT NULL
, category_id INTEGER NOT NULL
);