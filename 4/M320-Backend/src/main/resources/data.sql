INSERT INTO movie_overview_movie ("movie_name","thumbnail", "image", "release_date", "description", length, "director", rating, "genre")
VALUES
('Charlie and the Chocolate Factory', 'thumbnail', 'image', 2005-07-15, 'A young boy wins a tour of a magical chocolate factory.', 115, 'Tim Burton', 4, 'Family, Fantasy'),
('Dune', 'thumbnail', 'image', 2021-09-17, 'A young hero leads a rebellion against a powerful empire.', 155, 'Denis Villeneuve', 4.5, 'Sci-Fi, Adventure'),
('Princess Mononoke', 'thumbnail', 'image', 1997-07-12, 'A young warrior battles environmental and human threats.', 134, 'Hayao Miyazaki', 4.7, 'Animation, Fantasy'),
('Spirited Away', 'thumbnail', 'image', 2001-07-20, 'A young girl navigates a mysterious and magical world.', 125, 'Hayao Miyazak', 4.8, 'Animation, Adventure'),
('Pretty Woman', 'thumbnail', 'image', 1990-03-23, 'A businessman and a prostitute form an unlikely romance.', 119, 'Garry Marshall', 4.2, 'Romance, Comedy'),
('The Hangover', 'thumbnail', 'image', 2009-06-05, 'Four friends try to piece together a wild night in Las Vegas.', 100, 'Todd Phillips', 4, 'Comedy'),
('Mean Girls', 'thumbnail', 'image', 2004-04-30, 'A high school girl navigates the complex world of cliques.', 97, 'Mark Waters', 4.5, 'Comedy'),
('Notting Hill', 'thumbnail', 'image', 1999-05-28, 'A bookstore owners life changes when he falls for a movie star.', 124, 'Roger Michell', 4.3, 'Romance, Comedy'),
('The Grinch', 'thumbnail', 'image', 2000-11-17, 'A green creature tries to steal Christmas from Whoville.', 104, 'Ron Howard', 4.1, 'Animation, Comedy'),
('Shrek', 'thumbnail', 'image', 'An ogres life is disrupted by a talkative donkey and a princess.', 90, 'Andrew Adamson', 4.6, 'Animation, Comedy'),
('Fight Club', 'thumbnail', 'image', 'An insomniac and a soap salesman form an underground fight club.', 139, 'David Fincher', 4.9, 'Drama'),
('Gone Girl', 'thumbnail', 'image', 2014-10-03, 'A husband becomes the prime suspect in his wifes disappearance.', 149, 'David Fincher', 4.4, 'Mystery, Thriller'),
('Joker', 'thumbnail', 'image', 2019-10-04, 'A mentally troubled comedian becomes a criminal mastermind.', 122, 'Todd Phillips', 4.7, 'Crime, Drama, Thriller'),
('Split', 'thumbnail', 'image', 2017-01-20, 'A man with multiple personalities kidnaps three girls.', 117, 'M. Night Shyamalan', 4.2, 'Horror, Thriller'),
('Seven', 'thumbnail', 'image', 1995-09-22, 'Detectives hunt a serial killer who uses the seven deadly sins.', 127, 'David Fincher', 4.8, 'Crime, Drama, Mystery');

-- users
INSERT INTO movie_overview_users(user_id, username, password)
VALUES (1, 'admin_user', '0987'),
       (2, 'user', '1234')
ON CONFLICT DO NOTHING;

-- roles
INSERT INTO movie_overview_roles(role_id, name)
VALUES (1, 'ADMIN'),
       (2, 'USER')
ON CONFLICT DO NOTHING;

-- authorities
INSERT INTO movie_overview_authorities(auth_id, name)
VALUES (1, 'GET'),
       (2, 'POST'),
       (3, 'PUT'),
       (4, 'DELETE')
ON CONFLICT DO NOTHING;

-- assign roles to users
INSERT INTO movie_overview_roles(user_id, role_id)
VALUES (1, 1),
       (2, 2)
ON CONFLICT DO NOTHING;

-- assign authorities to roles
INSERT INTO restfood_roles_authorities(id_role, id_auth)
VALUES (1, 1),
       (1, 2),
       (1, 3),
       (1, 4),

       (2, 1),
       (2, 2),
       (2, 4)
ON CONFLICT DO NOTHING;