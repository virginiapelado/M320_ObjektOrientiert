-- Insert data into movie_overview_movie table
INSERT INTO movie_overview_movie ("movie_name", "thumbnail", "image", "release_date", "description", "length", "director", "trending_now")
VALUES
    ('Charlie and the Chocolate Factory', 'thumbnail', 'image', '2005-07-15', 'A young boy wins a tour of a magical chocolate factory.', 115, 'Tim Burton', true),
    ('Dune', 'thumbnail', 'image', '2021-09-17', 'A young hero leads a rebellion against a powerful empire.', 155, 'Denis Villeneuve', true),
    ('Princess Mononoke', 'thumbnail', 'image', '1997-07-12', 'A young warrior battles environmental and human threats.', 134, 'Hayao Miyazaki', false),
    ('Spirited Away', 'thumbnail', 'image', '2001-07-20', 'A young girl navigates a mysterious and magical world.', 125, 'Hayao Miyazaki', true),
    ('Pretty Woman', 'thumbnail', 'image', '1990-03-23', 'A businessman and a prostitute form an unlikely romance.', 119, 'Garry Marshall', false),
    ('The Hangover', 'thumbnail', 'image', '2009-06-05', 'Four friends try to piece together a wild night in Las Vegas.', 100, 'Todd Phillips', false),
    ('Mean Girls', 'thumbnail', 'image', '2004-04-30', 'A high school girl navigates the complex world of cliques.', 97, 'Mark Waters', true),
    ('Notting Hill', 'thumbnail', 'image', '1999-05-28', 'A bookstore owners life changes when he falls for a movie star.', 124, 'Roger Michell', false),
    ('The Grinch', 'thumbnail', 'image', '2000-11-17', 'A green creature tries to steal Christmas from Whoville.', 104, 'Ron Howard', false),
    ('Shrek', 'thumbnail', 'image','2002-11-23', 'An ogres life is disrupted by a talkative donkey and a princess.', 90, 'Andrew Adamson', true),
    ('Fight Club', 'thumbnail', 'image','2006-12-26', 'An insomniac and a soap salesman form an underground fight club.', 139, 'David Fincher', false),
    ('Gone Girl', 'thumbnail', 'image', '2014-10-03', 'A husband becomes the prime suspect in his wifes disappearance.', 149, 'David Fincher', false),
    ('Joker', 'thumbnail', 'image', '2019-10-04', 'A mentally troubled comedian becomes a criminal mastermind.', 122, 'Todd Phillips', false),
    ('Split', 'thumbnail', 'image', '2017-01-20', 'A man with multiple personalities kidnaps three girls.', 117, 'M. Night Shyamalan', false),
    ('Seven', 'thumbnail', 'image', '1995-09-22', 'Detectives hunt a serial killer who uses the seven deadly sins.', 127, 'David Fincher', false);

-- roles
INSERT INTO movie_overview_roles("name")
VALUES
    ('ADMIN'),
    ('USER')
ON CONFLICT DO NOTHING;

-- users
INSERT INTO movie_overview_users("name", password, "email")
VALUES
    ('admin12345@mail.com', '$2a$10$GKSix3ohTsUv4FKZX983keiT/XKzlyKkIZirktGRsXCuYdgqgmHAi', 'admin12345@mail.com'),  /* encoded password fpr 1234*/
    ('user76@mail.com', '$2a$10$GKSix3ohTsUv4FKZX983keiT/XKzlyKkIZirktGRsXCuYdgqgmHAi', 'user76@mail.com') /* encoded password fpr 1234*/
ON CONFLICT DO NOTHING;

-- authorities
INSERT INTO movie_overview_authorities("name")
VALUES
    ('GET'),
    ('POST'),
    ('PUT'),
    ('DELETE')
    ON CONFLICT DO NOTHING;

-- assign roles to users
INSERT INTO movie_overview_users_roles("user_id", "role_id")
VALUES
    (1, 1),
    (2, 2)
    ON CONFLICT DO NOTHING;

-- assign authorities to roles
INSERT INTO movie_overview_roles_authorities("role_id", "auth_id")
VALUES
    (1, 1),
    (1, 2),
    (1, 3),
    (1, 4),
    (2, 1),
    (2, 2),
    (2, 4)
    ON CONFLICT DO NOTHING;

-- Insert data into movie_overview_category table
INSERT INTO movie_overview_category ("category")
VALUES
    ('Action'),
    ('Romance'),
    ('Comedy'),
    ('Horror'),
    ('Fiction');

-- Insert data into movie_overview_category_movie table
INSERT INTO movie_overview_movie_category ("movie_id", "category_id")
VALUES
    (11, 1),
    (3, 5),
    (5, 2),
    (1, 3),
    (13, 4);

-- Insert data into movie_overview_reviews table
INSERT INTO movie_overview_reviews ("rating", "title", "description", "user_id", "movie_id")
VALUES
    (3.5, 'Films not as fun as I expected', 'Entertaining film, but I prefer the 1971 and 2023 versions...', 2, 1),
    (5, 'A Timeless Tale of Love, Nature, and Life Lessons', 'I adore this 1997 animated classic...', 2, 3);


-- Insert data into movie_overview_movie_quiz table
INSERT INTO movie_overview_movie_quiz (question, answerA, answerB, answerC, answerD, answerE)
VALUES
    ('Pick a movie genre you would most like to watch right now?', 'Action', 'Romance', 'Comedy', 'Horror', 'Fiction'),
    ('Which movie character do you most identify with?', 'Spiderman', '10 things I hate about you', 'Megamind', 'Conjuring', 'Spirited Away'),
    ('Pick an iconic movie song?', 'I Will Always Love You from the Bodyguard', 'My Heart Will Go On from Titanic', 'You`ve Got a Friend in Me from Toy Story', 'Happy from Despicable Me 2', 'Lose Yourself from 8 Mile'),
    ('What is one of your values?', 'Confidence', 'Talent', 'Creativity', 'Romance', 'Adventure');
