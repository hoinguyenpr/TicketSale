**1. Initial project**

   ![image](https://github.com/user-attachments/assets/ef64a11b-4f82-41d9-98f4-a80c5030c074)


- Luôn follow DDD architecture. Để đảm bảo tính thuần khiết và sạch sẽ của từng module.
- Usecase: Dữ liệu truyền qua các layer. Thì mỗi layer sẽ có model độc lập để truyền và hứng dữ liệu không dùng chung.
- Clean handle: Xử lý triệt để các cross-cutting concerns để tránh lan truyền phải xử lý nhiều tầng.