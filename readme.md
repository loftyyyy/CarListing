# 🚗 Car Listing Website (Work in Progress)

Welcome to the Car Listing Website! This web application is built using **Java**, **Spring Boot**, and **Thymeleaf**, and allows users to browse available cars or sell their cars online. It offers a seamless experience for both car buyers and sellers, with an intuitive interface and integration with **PostgreSQL** and **Microsoft Azure** for efficient data and image handling.

⚠️ _**Note:** This project is still a work in progress. Some features and pages are still under development._

## 🚀 Features











1. **Home**
    - A welcoming homepage with an overview of the website’s purpose.
    - ![Home Page](https://github.com/user-attachments/assets/9c0558e5-c53d-48f1-ac5f-62b93b8c12ef)


2. **Browse Cars**
    - Clients can browse through a list of cars for sale with various filtering options like brand, model, price, and year.
    - New car listings submitted through the "Sell Your Car" form are automatically added to the "Browse Cars" page.
    - ![Browse Cars Page](https://github.com/user-attachments/assets/984881c3-a55a-4052-8f7c-f3b9c50f2a74)

3. **Sell Your Car**
    - Clients can easily sell their cars by filling out a simple form. Once the form is submitted, the car is listed on the **Browse Cars** page for potential buyers to view.
    - The information collected includes:
        - Year
        - Registration
        - Price
        - Brand
        - Model
        - Color
        - Image of the car (stored in **Microsoft Azure**)
        - Description
    - ![Sell Your Car Page](https://github.com/user-attachments/assets/a6a1f2ec-30fd-4091-aa1e-b47110d8d8ba)


4. **About** _(Work in Progress)_
    - This page will provide background information about the company.
    - ![About Page](https://github.com/user-attachments/assets/963ea564-3299-48e5-9b47-d993bf2235c2)

    - _Note: This page is still under development and will be completed soon._

5. **Contact** _(Work in Progress)_
    - This page will feature a contact form where users can reach out to the company with inquiries.
    - ![Contact Page](https://github.com/user-attachments/assets/e0c104f4-411c-4464-b754-a7221c931acb)

    - _Note: This page is still under development and will be completed soon._

## 🛠️ Tech Stack

- **Backend**: Java, Spring Boot
- **Frontend**: Thymeleaf, HTML5, CSS3, TailwindCSS
- **Database**: PostgreSQL
- **Cloud Storage**: Microsoft Azure (for storing car images)
- **Templating**: Thymeleaf for dynamic views and server-side rendering
- **ORM**: Spring Data JPA for database interactions
- **Deployment**: Hosted on [cloud platform or server info if applicable]

## 📋 Sell Your Car Form Details

The "Sell Your Car" page allows users to list their car for sale. Once the form is submitted, the car is immediately available on the **Browse Cars** page for potential buyers to see. It collects the following details:

- **Year**: The year the car was manufactured.
- **Registration**: Vehicle registration number.
- **Price**: Price at which the car is being sold.
- **Brand**: Car manufacturer brand (e.g., Toyota, Ford).
- **Model**: Specific model of the car.
- **Color**: Car’s color.
- **Image**: Car image (uploaded and stored in **Microsoft Azure**).
- **Description**: A short description of the car’s features.

Here’s a preview of the form:
![Sell Your Car Form](https://github.com/user-attachments/assets/a6a1f2ec-30fd-4091-aa1e-b47110d8d8ba)

## 💾 Database Schema

The data collected in the "Sell Your Car" form is stored in a **PostgreSQL** database, with the following table structure:

- `id` (Primary Key)
- `year`
- `registration`
- `price`
- `brand`
- `model`
- `color`
- `image_url` (Stored in Microsoft Azure)
- `description`
-

## 🌐 Live Demo

Check out the live version of the website here: (Coming Soon)

## 📸 Screenshots

| Page          | Screenshot                                                      |
|---------------|------------------------------------------------------------------|
| Home          | ![Home Page](https://github.com/user-attachments/assets/9c0558e5-c53d-48f1-ac5f-62b93b8c12ef)                  |
| Browse Cars   | ![Browse Cars Page](https://github.com/user-attachments/assets/984881c3-a55a-4052-8f7c-f3b9c50f2a74)         |
| Sell Your Car | ![Sell Your Car Form](https://github.com/user-attachments/assets/a6a1f2ec-30fd-4091-aa1e-b47110d8d8ba)      |
| About         | ![About Page](https://github.com/user-attachments/assets/963ea564-3299-48e5-9b47-d993bf2235c2) _(Work in Progress)_|
| Contact       | ![Contact Page](https://github.com/user-attachments/assets/e0c104f4-411c-4464-b754-a7221c931acb) _(Work in Progress)_|

## 💡 How to Run Locally

1. Clone the repository:
    ```bash
    git clone https://github.com/loftyyyy/CarListing.git
    ```

2. Navigate to the project directory:
    ```bash
    cd CarListing
    ```

3. Install dependencies and run the application:
    ```bash
    mvn spring-boot:run
    ```

4. Access the application at `http://localhost:8080`.

## 🚀 Future Enhancements

- Complete the **About Us** and **Contact** pages.
- Implement advanced filtering options for car searches (e.g., mileage, fuel type).
- Add user authentication for sellers.
- Introduce payment gateway integration for buyers.

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
