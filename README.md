This project is a proof of concept for a search API built for Makersharks.
The API allows buyers to search for manufacturers based on customized requirements such as location, nature of business, and manufacturing processes.
#### **API Endpoints**
```markdown
## API Endpoints

### 1. `/api/supplier/query` [GET]

Retrieve a list of manufacturers based on location, nature of business, and manufacturing processes.

**Request Parameters:**

- `location` (String): City where the supplier is located.
- `natureOfBusiness` (String): Nature of the business (e.g., `small_scale`, `medium_scale`, `large_scale`).
- `manufacturingProcess` (String): Manufacturing process capability (e.g., `moulding`, `3d_printing`, `casting`, `coating`).
- `limit` (int): Maximum number of results to return (optional).

**Example Request:**
```bash
GET http://localhost:8084/api/supplier/query?location=India&business=small_scale&processes=three_d_printing&pageNo=1&pageSize=1

#### **Project Structure**
```markdown
## Project Structure

- `src/main/java/com/makersharks`: Contains the main application files.
  - `controller`: Contains the API controller.
  - `service`: Contains the service layer.
  - `repository`: Contains the repository interface.
  - `model`: Contains the entity classes and enums.

- `src/main/resources`: Contains configuration files.
  - `application.properties`: Main configuration file for the application.
