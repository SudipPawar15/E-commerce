UPDATE products
SET 
  name = CASE 
	WHEN product_id = 1 THEN 'Lord of the Mysteries'
    WHEN product_id = 2 THEN 'The Great Gatsby'
    WHEN product_id = 3 THEN '1984'
    WHEN product_id = 4 THEN 'To Kill a Mockingbird'
    WHEN product_id = 5 THEN 'Harry Potter and the Sorcerer\'s Stone'
    WHEN product_id = 6 THEN 'The Catcher in the Rye'
    WHEN product_id = 7 THEN 'The Hobbit'
    WHEN product_id = 8 THEN 'Moby-Dick'
    WHEN product_id = 9 THEN 'The Lord of the Rings'
    WHEN product_id = 10 THEN 'The Da Vinci Code'
    WHEN product_id = 11 THEN 'MacBook Pro'
    WHEN product_id = 12 THEN 'Dell XPS 13'
    WHEN product_id = 13 THEN 'HP Spectre x360'
    WHEN product_id = 14 THEN 'Microsoft Surface Laptop'
    WHEN product_id = 15 THEN 'Lenovo ThinkPad X1 Carbon'
    WHEN product_id = 16 THEN 'Acer Predator Helios 300'
    WHEN product_id = 17 THEN 'Razer Blade Stealth'
    WHEN product_id = 18 THEN 'Asus ZenBook Flip'
    WHEN product_id = 19 THEN 'Apple MacBook Air'
    WHEN product_id = 20 THEN 'MacBook Pro 16-inch'
    WHEN product_id = 21 THEN 'Dell Inspiron 15'
    WHEN product_id = 22 THEN 'Acer Aspire 5'
    WHEN product_id = 23 THEN 'HP Envy 13'
    WHEN product_id = 24 THEN 'Samsung Galaxy Book'
    WHEN product_id = 25 THEN 'Google Pixelbook Go'
    WHEN product_id = 26 THEN 'The Shining'
    WHEN product_id = 27 THEN 'Pride and Prejudice'
    WHEN product_id = 28 THEN 'Brave New World'
    WHEN product_id = 29 THEN 'The Alchemist'
    WHEN product_id = 30 THEN 'The Hunger Games'
    WHEN product_id = 31 THEN 'OnePlus 9 Pro'
    WHEN product_id = 32 THEN 'Samsung Galaxy S21'
    WHEN product_id = 33 THEN 'iPhone 13 Pro Max'
    WHEN product_id = 34 THEN 'Google Pixel 6'
    WHEN product_id = 35 THEN 'Sony Xperia 1 II'
    WHEN product_id = 36 THEN 'Huawei P40 Pro'
    WHEN product_id = 37 THEN 'LG Velvet'
    WHEN product_id = 38 THEN 'Motorola Edge'
    WHEN product_id = 39 THEN 'Nokia 8.3 5G'
    WHEN product_id = 40 THEN 'Xiaomi Mi 11'
    WHEN product_id = 41 THEN 'Sony PlayStation 5'
    WHEN product_id = 42 THEN 'Xbox Series X'
    WHEN product_id = 43 THEN 'Nintendo Switch'
    WHEN product_id = 44 THEN 'Apple iPad Pro'
    WHEN product_id = 45 THEN 'Samsung Galaxy Tab S7'
    WHEN product_id = 46 THEN 'Microsoft Surface Pro 7'
    WHEN product_id = 47 THEN 'Lenovo Tab P11'
    WHEN product_id = 48 THEN 'Huawei MatePad Pro'
    WHEN product_id = 49 THEN 'Amazon Fire HD 10'
    WHEN product_id = 50 THEN 'Asus ROG Flow Z13'
    ELSE name 
  END,
  
  description = CASE 
	WHEN product_id = 1 THEN 'A Mystery thriller web novel written by Cuttle Fish.'
    WHEN product_id = 2 THEN 'A classic American novel written by F. Scott Fitzgerald.'
    WHEN product_id = 3 THEN 'A dystopian novel by George Orwell, set in a totalitarian society.'
    WHEN product_id = 4 THEN 'Harper Lee\'s novel on racial inequality and moral growth in the American South.'
    WHEN product_id = 5 THEN 'J.K. Rowling\'s fantasy novel about a young wizard.'
    WHEN product_id = 6 THEN 'J.D. Salinger\'s novel about teenage angst and alienation.'
    WHEN product_id = 7 THEN 'J.R.R. Tolkien\'s epic high-fantasy novel.'
    WHEN product_id = 8 THEN 'Herman Melville\'s novel about the pursuit of the elusive white whale.'
    WHEN product_id = 9 THEN 'J.R.R. Tolkien\'s fantasy epic set in Middle-earth.'
    WHEN product_id = 10 THEN 'Dan Brown\'s thriller involving secret codes and mysteries.'
    WHEN product_id = 11 THEN 'Apple\'s flagship laptop, known for its high performance and sleek design.'
    WHEN product_id = 12 THEN 'Dell\'s premium ultrabook with stunning display and portability.'
    WHEN product_id = 13 THEN 'HP\'s convertible laptop for both work and play.'
    WHEN product_id = 14 THEN 'Microsoft\'s laptop with a premium design and Windows OS.'
    WHEN product_id = 15 THEN 'Lenovo\'s top-of-the-line business laptop.'
    WHEN product_id = 16 THEN 'Acer\'s gaming laptop with powerful performance and graphics.'
    WHEN product_id = 17 THEN 'Razer Blade\'s slim and powerful gaming laptop.'
    WHEN product_id = 18 THEN 'Asus\'s convertible laptop for professionals.'
    WHEN product_id = 19 THEN 'Apple\'s ultra-lightweight and portable laptop.'
    WHEN product_id = 20 THEN 'MacBook Pro 16-inch with enhanced graphics and performance.'
    WHEN product_id = 21 THEN 'Dell Inspiron 15 series with solid build and power.'
    WHEN product_id = 22 THEN 'Acer Aspire 5, a budget-friendly laptop with good performance.'
    WHEN product_id = 23 THEN 'HP Envy 13, a premium ultrabook with high-end features.'
    WHEN product_id = 24 THEN 'Samsung Galaxy Book with amazing AMOLED display.'
    WHEN product_id = 25 THEN 'Google Pixelbook Go, known for its sleek and lightweight design.'
    WHEN product_id = 26 THEN 'Stephen King’s horror novel, set in an isolated hotel.'
    WHEN product_id = 27 THEN 'Jane Austen’s classic novel on love, society, and marriage.'
    WHEN product_id = 28 THEN 'Aldous Huxley’s science fiction novel about a utopian society.'
    WHEN product_id = 29 THEN 'Paulo Coelho’s novel on pursuing your dreams and self-discovery.'
    WHEN product_id = 30 THEN 'Suzanne Collins’ dystopian novel about survival and revolution.'
    WHEN product_id = 31 THEN 'OnePlus 9 Pro, a high-end smartphone with powerful specs.'
    WHEN product_id = 32 THEN 'Samsung Galaxy S21, one of the best Android phones.'
    WHEN product_id = 33 THEN 'Apple’s iPhone 13 Pro Max with stunning performance.'
    WHEN product_id = 34 THEN 'Google Pixel 6, a new standard in smartphone photography.'
    WHEN product_id = 35 THEN 'Sony Xperia 1 II, with professional-grade camera features.'
    WHEN product_id = 36 THEN 'Huawei P40 Pro, a flagship with amazing cameras.'
    WHEN product_id = 37 THEN 'LG Velvet, a mid-range 5G phone with excellent design.'
    WHEN product_id = 38 THEN 'Motorola Edge with premium features and 5G support.'
    WHEN product_id = 39 THEN 'Nokia 8.3 5G, an affordable 5G-enabled phone.'
    WHEN product_id = 40 THEN 'Xiaomi Mi 11, a powerful Android phone with a great display.'
    WHEN product_id = 41 THEN 'Sony PlayStation 5, the latest generation of gaming console.'
    WHEN product_id = 42 THEN 'Xbox Series X, Microsoft’s top-of-the-line gaming console.'
    WHEN product_id = 43 THEN 'Nintendo Switch, the popular hybrid gaming console.'
    WHEN product_id = 44 THEN 'Apple iPad Pro, a powerful tablet for productivity and entertainment.'
    WHEN product_id = 45 THEN 'Samsung Galaxy Tab S7 with a high-refresh-rate display.'
    WHEN product_id = 46 THEN 'Microsoft Surface Pro 7, a tablet that doubles as a laptop.'
    WHEN product_id = 47 THEN 'Lenovo Tab P11, an affordable tablet with decent performance.'
    WHEN product_id = 48 THEN 'Huawei MatePad Pro, a high-end Android tablet.'
    WHEN product_id = 49 THEN 'Amazon Fire HD 10, a budget-friendly tablet with solid performance.'
    WHEN product_id = 50 THEN 'Asus ROG Flow Z13, a gaming tablet with amazing power.'
    ELSE description
  END,
  
  price = CASE 

    WHEN product_id BETWEEN 1 AND 10 THEN ROUND(RAND() * (1000 - 10) + 10, 2)
    WHEN product_id BETWEEN 11 AND 20 THEN ROUND(RAND() * (2000 - 500) + 500, 2)
    WHEN product_id BETWEEN 21 AND 30 THEN ROUND(RAND() * (1000 - 100) + 100, 2)
    WHEN product_id BETWEEN 31 AND 40 THEN ROUND(RAND() * (1500 - 200) + 200, 2)
    WHEN product_id BETWEEN 41 AND 50 THEN ROUND(RAND() * (500 - 50) + 50, 2)
    ELSE price
  END,
  
  stock_quantity = CASE 
    WHEN product_id BETWEEN 1 AND 50 THEN FLOOR(RAND() * (500 - 10) + 10)
    ELSE stock_quantity
  END

WHERE product_id BETWEEN 1 AND 50;
