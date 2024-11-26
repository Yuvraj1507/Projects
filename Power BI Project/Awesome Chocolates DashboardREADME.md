# Awesome Chocolates Dashboard

## Project Overview
An interactive Excel dashboard integrated with SQL databases for real-time sales tracking, providing insights into sales trends, top products, and regional performance. This dashboard empowers business stakeholders to make data-driven decisions by visualizing critical sales metrics and patterns.

## Technologies Used
- **Microsoft Excel** for data visualization and dashboard creation.
- **SQL Database (MySQL)** for data integration using Import mode.
- **Power Query** for data cleaning and transformation.
- **PivotTables and PivotCharts** for data analysis and visualization.
- **VBA (Optional)** for advanced interactivity and automation.

## Setup Instructions
Follow these steps to set up and run the Awesome Chocolates Dashboard on your local machine.

### **1. Set Up the SQL Database**
1. **Install MySQL** (if not already installed):
   - Download MySQL Community Server from the [official website](https://dev.mysql.com/downloads/mysql/).
   - Install MySQL Workbench for easy database management.

2. **Create the Database and Sales Table**:
   - Open **MySQL Workbench** and connect to your local MySQL server.
   - Execute the following SQL script to create the `sales_db` database and `sales` table with sample data:

### **2. Prepare the Excel Dashboard**
1. **Open Microsoft Excel**:
   - Launch Excel and open a new workbook named `AwesomeChocolatesDashboard.xlsx`.

2. **Connect to the MySQL Database**:
   - Navigate to the **Data** tab.
   - Click on **Get Data** > **From Database** > **From MySQL Database**.
   - Enter your **Server Name** (e.g., `localhost` or `127.0.0.1`).
   - Enter the **Database Name**: `sales_db`.
   - Click **OK** and provide your MySQL **username** and **password** when prompted.

3. **Load the Sales Table**:
   - In the Navigator window, select the `sales` table.
   - Click **Load** to import the data into Excel.

4. **Transform Data Using Power Query**:
   - After loading, go to **Data** > **Get Data** > **Launch Power Query Editor**.
   - Perform necessary data cleaning:
     - **Rename Columns** for clarity (e.g., `product_name` to `Product Name`).
     - **Filter Out** any null or unwanted rows.
     - **Change Data Types** if necessary (e.g., ensure `sale_date` is recognized as a date).

5. **Create PivotTables and PivotCharts**:
   - Insert a **PivotTable** to summarize sales data.
   - Use **PivotCharts** (e.g., Line Chart, Bar Chart, Map) to visualize key metrics such as Total Revenue, Quantity Sold, Sales by Region, and Sales Trends over Time.

6. **Add Interactivity**:
   - Insert **Slicers** to allow filtering by Product, Region, and Date.
   - Apply **Conditional Formatting** to highlight key performance indicators (e.g., green for revenue growth, red for decline).

7. **Enhance with VBA (Optional)**:
   - For advanced interactivity, you can add VBA scripts to automate tasks like data refresh or dynamic chart updates.

### **3. Publish and Share the Dashboard**
1. **Save Your Excel Workbook**:
   - Ensure all connections and visualizations are correctly set up.
   - Save the workbook as `AwesomeChocolatesDashboard.xlsx`.

2. **Upload to GitHub**:
   - Initialize a new GitHub repository named `Awesome-Chocolates-Dashboard`.
   - Add your Excel file and SQL script to the repository.

### **4. Set Up Scheduled Data Refresh (Optional)**
- If you want the dashboard to update automatically:
  - Use **Excel's Power Query** to schedule data refreshes.
  - Alternatively, host the Excel file on a platform that supports automated refreshes.

## Key Features
- **Real-Time Updates**: Enabled via Power Query data refresh, ensuring the dashboard reflects the latest sales data.
- **Forecasting & Trend Analysis**: Predictive insights into future sales trends using historical data.
- **Geospatial Insights**: Visual representation of sales performance across different regions using Excel's Map charts.
- **Interactive Filters**: Slicers for dynamic data exploration based on product, region, and date.

## Outcomes
- **Enhanced Decision-Making**: Empowered business stakeholders with timely and accurate sales insights.
- **Streamlined Reporting**: Automated data integration and visualization reduced manual reporting efforts.
- **Improved Data Accuracy**: Real-time data connections and automated refreshes minimized errors in reporting.

## Repository Structure
```plaintext
Awesome-Chocolates-Dashboard/
├── README.md
├── AwesomeChocolatesDashboard.xlsx
└── sales_data.sql
