-- Insert data into movie_overview_movie table
INSERT INTO movie_overview_movie ("movie_name", "thumbnail", "image", "release_date", "description", "length", "director", "trending_now")
VALUES
    ('Charlie and the Chocolate Factory', 'https://occ-0-1348-1347.1.nflxso.net/dnm/api/v6/rkETp35xJVj-6WaffQsS77awykM/AAAABXPDB6azqUHVe6OVf1yB_C8bi1SLgH1Gca2eTCGAgr172aEtPn6Xj4cFt97ugTsm38bLjO52_YTr_hTm8ErM_qJxygvk_Trf5-4.webp?r=d22', 'https://i0.wp.com/cultfollowing.co.uk/wp-content/uploads/2022/03/charlie-and-the-chocolate-factory-review.jpg?fit=1200%2C675&ssl=1', '2005-07-15', 'A young boy wins a tour of a magical chocolate factory.', 115, 'Tim Burton', true),
    ('Dune', 'https://occ-0-1348-1347.1.nflxso.net/dnm/api/v6/rkETp35xJVj-6WaffQsS77awykM/AAAABYLoxcmkQ6oD42MZrVVz-hAOZn98-P3F8yC7ln2fimb3XlVkLdKXy9D1Zmgq9DW4hyayAWw1qIdb79XjlYaOrBLJNf4iORQZQj4.webp?r=2da', 'https://assets.teenvogue.com/photos/64eca0c60abac703967090ca/master/w_2560%2Cc_limit/rev-1-DUN2-38301r_High_Res_JPEG.jpeg', '2021-09-17', 'A young hero leads a rebellion against a powerful empire.', 155, 'Denis Villeneuve', true),
    ('Princess Mononoke', 'https://occ-0-1348-1347.1.nflxso.net/dnm/api/v6/rkETp35xJVj-6WaffQsS77awykM/AAAABQZadjbYJmhCGaIZBkU7AzTMM9Z_x8O2eqrqcaN1ne6JgC59K0TWA5dm84GqbZ8zWc-PqoBAPwv1lst7zjLFCKB9OcYiQuaz28E.webp?r=e6c', 'https://junkyardview.files.wordpress.com/2018/07/princessmononoke.jpg', '1997-07-12', 'A young warrior battles environmental and human threats.', 134, 'Hayao Miyazaki', true),
    ('Spirited Away', 'https://occ-0-1348-1347.1.nflxso.net/dnm/api/v6/rkETp35xJVj-6WaffQsS77awykM/AAAABZZHDUS71Pm8Bzq3e7DKtC3p-1fhKpXterHFztaOlRNkmdRq-DqsqvqPBCUE3TAsQsFr6fgNZ4hHZ0OfDsiaU-6Q7V3_D-PevI4.webp?r=f97', 'https://myhuangopinion.files.wordpress.com/2017/01/spawchihiroflowerss.jpg?w=825&h=510&crop=1', '2001-07-20', 'A young girl navigates a mysterious and magical world.', 125, 'Hayao Miyazaki', true),
    ('Pretty Woman', 'https://occ-0-1348-1347.1.nflxso.net/dnm/api/v6/rkETp35xJVj-6WaffQsS77awykM/AAAABUUgDQYsecjRsQnknOaraVUzhFowUhK13slUTqGEzvy3Qs8pM_gFJ0QLBcrV_3MR2motGBPP99yhdutOTfD1TTSBWMT_8XSWJx0.webp?r=f5b', 'https://media.cnn.com/api/v1/images/stellar/prod/150319132420-richard-gere-julia-roberts-pretty-woman.jpg?q=w_2000,h_1125,x_0,y_0,c_fill/h_778', '1990-03-23', 'A businessman and a prostitute form an unlikely romance.', 119, 'Garry Marshall', true),

    ('The Hangover', 'https://occ-0-1348-1347.1.nflxso.net/dnm/api/v6/rkETp35xJVj-6WaffQsS77awykM/AAAABZchLFKP5bZNsbYiG8N5VJYNOVhCM6QYST8TuArkdXBhKBO9sGE8gQd2l07aouaLjIUsguZtwKLsrVk5P4VV3BTyFuEVNzsfBV4.webp?r=fb2', 'https://m.media-amazon.com/images/M/MV5BMTQ1Mzk4NjAxNF5BMl5BanBnXkFtZTgwOTIwNjMwMjE@._V1_.jpg', '2009-06-05', 'Four friends try to piece together a wild night in Las Vegas.', 100, 'Todd Phillips', false),
    ('Mean Girls', 'https://occ-0-1348-1347.1.nflxso.net/dnm/api/v6/rkETp35xJVj-6WaffQsS77awykM/AAAABbs-nq9N5Qhh4X7x_kzMTvciQftDLN21DjTDOkYFrdX0IyoT291u0YRCy-YDAlGsICmTOZAJWSSCREBlqJADkQAhtxRMj4CF6Yo.webp?r=c7b', 'https://ew.com/thmb/3weoSswXE8m9zpDlvH3Tw0vj188=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/mcdmegi_ec101_h-2000-455c822dfe904f93865819ce1023d839.jpg', '2004-04-30', 'A high school girl navigates the complex world of cliques.', 97, 'Mark Waters', false),
    ('Notting Hill', 'https://occ-0-1348-1347.1.nflxso.net/dnm/api/v6/rkETp35xJVj-6WaffQsS77awykM/AAAABWsYwFt4CApqqiZIwSNkFpM5lqpQcu-2WXlNAiNYlIqerKg4U38DUwiy78zXQO1z2QUxLpURPokIiQ6cXUPmcut_hL8brlLntno.webp?r=18f', 'https://m.media-amazon.com/images/M/MV5BNmQyMWM2MmUtNzkyOS00NjVmLTk4MDEtODYzM2NjYjZhYWNlXkEyXkFqcGdeQXVyMDc2NTEzMw@@._V1_.jpg', '1999-05-28', 'A bookstore owners life changes when he falls for a movie star.', 124, 'Roger Michell', false),
    ('The Grinch', 'https://occ-0-1348-1347.1.nflxso.net/dnm/api/v6/rkETp35xJVj-6WaffQsS77awykM/AAAABeJliS2u-porUKRwO69yQBWLXWJzVhQGy-aMDuVvrYpj0fBS2jaJjlfVMERJSuOkorQC110oagglhFsNDjpI7adtQHP9YT-cXeM.webp?r=332', 'https://www.themusichall.org/wp-content/uploads/2021/10/2112_EC_TheGrinch-1024x576.jpg', '2000-11-17', 'A green creature tries to steal Christmas from Whoville.', 104, 'Ron Howard', false),
    ('Shrek', 'https://occ-0-1348-1347.1.nflxso.net/dnm/api/v6/rkETp35xJVj-6WaffQsS77awykM/AAAABcmVBQmc3kGQfGJ6Z-Bu9Lh7J7ksRs0O5AHxb5rutusk93YXN3h0W9RoKOeR809_H9qRKesau4WXDwkZcHBY-g9-yEACdZ7VcD0.webp?r=718', 'https://www.intofilm.org/intofilm-production/scaledcropped/3000x1688https%3A/intofilm-buckets-production-305862963141-resources.s3.eu-west-1.amazonaws.com/intofilm-production/uploads/shrek-2.jpg/shrek-2.jpg','2002-11-23', 'An ogres life is disrupted by a talkative donkey and a princess.', 90, 'Andrew Adamson', false),

    ('Fight Club', 'https://occ-0-1348-1347.1.nflxso.net/dnm/api/v6/rkETp35xJVj-6WaffQsS77awykM/AAAABVA1HWhem9K9zSAoKStpjBeLDfvYsSaPyJqmIKJgFSxu2JYQiMu-IXScMWTdsSRZ7T610SHZjDpLHFRMF2-2tCaYzDsxDzEBrc8.webp?r=443', 'https://c4.wallpaperflare.com/wallpaper/752/9/318/movie-fight-club-brad-pitt-edward-norton-wallpaper-preview.jpg','2006-12-26', 'An insomniac and a soap salesman form an underground fight club.', 139, 'David Fincher', false),
    ('Gone Girl', 'https://occ-0-1348-1347.1.nflxso.net/dnm/api/v6/rkETp35xJVj-6WaffQsS77awykM/AAAABVykkbrXFp35NuPYp94OTbJcOUJ6x8AOs0QmlswiAKa3jq2D_o4IEbgD-uZVP5_DAn5w28xWv5M910E6ieL77SPUykBBq9_401Y.webp?r=dc2', 'https://nofilmschool.com/media-library/defining-the-psychosexual-thriller-genre-in-movies-and-tv-with-examples.jpg?id=34048946&width=1245&height=700&quality=90&coordinates=209%2C0%2C51%2C0', '2014-10-03', 'A husband becomes the prime suspect in his wifes disappearance.', 149, 'David Fincher', false),
    ('Joker', 'https://occ-0-1348-1347.1.nflxso.net/dnm/api/v6/rkETp35xJVj-6WaffQsS77awykM/AAAABZnsXN6Vj2h2lL2_aaWBAU253bZO35WJWHvPQJ4yACVLrUVdkL4Adj34sVupDAaCfrc-AbzraTz3fXxITfWY8wSf__jTGcQr7KQ.webp?r=992', 'https://wallpapercave.com/wp/HmelbcW.jpg', '2019-10-04', 'A mentally troubled comedian becomes a criminal mastermind.', 122, 'Todd Phillips', false),
    ('Split', 'https://occ-0-1348-1347.1.nflxso.net/dnm/api/v6/rkETp35xJVj-6WaffQsS77awykM/AAAABSeOM1DUDFpw-mP6YMkW1M_PuGcyR98RW6G7ywJkS-nVcOQ60fHWZjAmiCTaXCeqQNzrsEMBqEieb90a09OFlLQVfov1vPXAdDU.webp?r=5be', 'https://bigtimewrites.files.wordpress.com/2017/04/split.jpg', '2017-01-20', 'A man with multiple personalities kidnaps three girls.', 117, 'M. Night Shyamalan', false),
    ('Seven', 'https://occ-0-1348-1347.1.nflxso.net/dnm/api/v6/rkETp35xJVj-6WaffQsS77awykM/AAAABXMGc-gxLQN_4g51B2I6II0mGnpwvovIQqLrPj_oeLmLGTiTCWYQHt7qeCYiAaiWue4ktO5nIkmP1rkN1tiVmotbQHgr9FYdhmU.webp?r=813', 'https://c4.wallpaperflare.com/wallpaper/409/98/547/seven-movie-movies-film-stills-brad-pitt-actor-hd-wallpaper-preview.jpg', '1995-09-22', 'Detectives hunt a serial killer who uses the seven deadly sins.', 127, 'David Fincher', false),

    ('The Fast and the Furious', 'https://occ-0-3603-1348.1.nflxso.net/dnm/api/v6/rkETp35xJVj-6WaffQsS77awykM/AAAABT16NZ1wdowg7-CjIqdnL0FdFgch0X2AFDEwq6oXszUB1WEjZazhhvVGtQY8RfhbPP4STz7AZGvRr188KP938pBNzW3UeSh73u4.webp?r=9d7', 'https://filmschoolrejects.com/wp-content/uploads/2021/06/fast-and-furious-dom-and-brian.jpeg','2001-06-18', 'Los Angeles police officer Brian O Conner must decide where his loyalty really lies when he becomes enamored with the street racing world he has been sent undercover to destroy.', 106, 'Rob Cohen', false),
    ('2 Fast 2 Furious', 'https://occ-0-3603-1348.1.nflxso.net/dnm/api/v6/rkETp35xJVj-6WaffQsS77awykM/AAAABSDR0UuDcXK_zirHlzy0txJqVyc4arctC3iggywHAcKGl391_IjiRi1t4cVjEbWKR29bmiElaZ3-dK1V7uA0GH0jWeLY2zKqpkk.webp?r=784', 'https://m.media-amazon.com/images/M/MV5BMTU5MjA4NDc4MV5BMl5BanBnXkFtZTgwMzYwMDIzMTI@._V1_.jpg','2003-06-06', 'Former cop Brian O Conner is called upon to bust a dangerous criminal and he recruits the help of a former childhood friend and street racer who has a chance to redeem himself.', 107, 'John Singleton', false),
    ('Spiderman Across The Spider Verse', 'https://occ-0-3603-1348.1.nflxso.net/dnm/api/v6/rkETp35xJVj-6WaffQsS77awykM/AAAABVT3bEjE4Us9Q9Mqsc_HTHSIKoyQnR2SUaYwDoCvoShxqIiIJHauK3lH3ClpYTDN1XNrQtsprCtHm_J76voyVlNfqAnC9LtglmY.webp?r=7ac', 'https://raw.githubusercontent.com/virginiapelado/M320_ObjektOrientiert/main/m322-frontend/src/img/spider-man2.jpeg','2023-06-02', 'Miles Morales catapults across the multiverse, where he encounters a team of Spider-People charged with protecting its very existence. When the heroes clash on how to handle a new threat, Miles must redefine what it means to be a hero', 140, 'Joaquim Dos Santos, Justin K. Thompson, Kemp Powers', false),
    ('The Fast and the Furious: Tokyo Drift', 'https://occ-0-3603-1348.1.nflxso.net/dnm/api/v6/rkETp35xJVj-6WaffQsS77awykM/AAAABdfuQ8PbySbqtfRQ3PyuW5YA61yONaM0ee7jVPA4L9ZuP9jx9_DRdMNEorDy414qZCjgWpIhSdAKJnES5oUtQxjk1pc7lIwWjtM.webp?r=d41', 'https://images.squarespace-cdn.com/content/v1/5f0eef7fdf92a846778e73d3/1623841814050-LKZLQ6OLKT455K9T607I/tokyo+drift.jpeg','2006-06-04', 'A teenager becomes a major competitor in the world of drift racing after moving in with his father in Tokyo to avoid a jail sentence in America.', 104 , 'Justin Lin', false),
    ('Fast Five', 'https://occ-0-3603-1348.1.nflxso.net/dnm/api/v6/rkETp35xJVj-6WaffQsS77awykM/AAAABfZhhNSK8AP7sNuTWVOCSXgP705yPH57RMrK-xW-e74pDgGPK-3mkDUY_yVi_ZaWQwEhppwluo07JowAkLhQsdi-HxhR51Hi2e4.webp?r=7bd', 'https://www.pluggedin.com/wp-content/uploads/2019/12/fast-five.jpg','2011-04-15', 'Dominic Toretto and his crew of street racers plan a massive heist to buy their freedom while in the sights of a powerful Brazilian drug lord and a dangerous federal agent.', 130, 'Justin Lin', false);

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
    ('Psychological'),
    ('Comedy'),
    ('Animation'),
    ('Romance');

-- Insert data into movie_overview_category_movie table
INSERT INTO movie_overview_movie_category ("movie_id", "category_id")
VALUES
    (3, 5),
    (5, 5),
    (8, 5),
    (2, 5),
    (4, 5),

    (11, 2),
    (12, 2),
    (13, 2),
    (14, 2),
    (15, 2),

    (6, 3),
    (7, 3),
    (8, 3),
    (9, 3),
    (10, 3),

    (18, 4),
    (9, 4),
    (3, 4),
    (4, 4),
    (10, 4),

    (16, 1),
    (17, 1),
    (18, 1),
    (19, 1),
    (20, 1);

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
