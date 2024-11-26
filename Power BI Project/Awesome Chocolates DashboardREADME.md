# Awesome Chocolates Dashboard

## Project Overview
An interactive Excel dashboard designed to provide insights into sales trends, top products, and regional performance. This dashboard empowers business stakeholders to make data-driven decisions by visualizing critical sales metrics and patterns.

## Technologies Used
- **Microsoft Excel** for data visualization and dashboard creation.
- **Power Query** for data cleaning and transformation.
- **PivotTables and PivotCharts** for data analysis and visualization.
- **VBA (Optional)** for advanced interactivity and automation.

## Setup Instructions
Follow these steps to set up and run the Awesome Chocolates Dashboard on your local machine.

### **1. Prepare the Excel Dashboard**
1. **Open Microsoft Excel**:
   - Launch Excel and open a new workbook named `AwesomeChocolatesDashboard.xlsx`.

2. **Load Sales Data into Excel**:
   - Use the sample sales data provided in the repository (`sales_data.xlsx`) or enter your own data manually.
   - Ensure the data includes the following columns:
     - **Product Name**: Name of the chocolate product.
     - **Region**: Sales region (e.g., North, South, East, West).
     - **Sale Date**: Date of the sale.
     - **Quantity Sold**: Number of units sold.
     - **Revenue**: Revenue generated from the sale.

3. **Transform Data Using Power Query** (Optional):
   - Navigate to **Data** > **Get Data** > **Launch Power Query Editor**.
   - Perform necessary data cleaning:
     - **Rename Columns** for clarity (if needed).
     - **Filter Out** any null or unwanted rows.
     - **Change Data Types** (e.g., ensure `Sale Date` is recognized as a date).

4. **Create PivotTables and PivotCharts**:
   - Insert a **PivotTable** to summarize sales data.
   - Use **PivotCharts** (e.g., Line Chart, Bar Chart, Map) to visualize key metrics such as Total Revenue, Quantity Sold, Sales by Region, and Sales Trends over Time.

5. **Add Interactivity**:
   - Insert **Slicers** to allow filtering by Product, Region, and Date.
   - Apply **Conditional Formatting** to highlight key performance indicators (e.g., green for revenue growth, red for decline).

6. **Enhance with VBA (Optional)**:
   - For advanced interactivity, you can add VBA scripts to automate tasks like data refresh or dynamic chart updates.

### **2. Publish and Share the Dashboard**
1. **Save Your Excel Workbook**:
   - Ensure all visualizations and features are correctly set up.
   - Save the workbook as `AwesomeChocolatesDashboard.xlsx`.

2. **Upload to GitHub**:
   - Initialize a new GitHub repository named `Awesome-Chocolates-Dashboard`.
   - Add your Excel file and sample data file (`sales_data.xlsx`) to the repository.

## Key Features
- **Interactive Visualization**: Gain insights through PivotCharts and Slicers.
- **Forecasting & Trend Analysis**: Predictive insights into future sales trends using historical data.
- **Geospatial Insights**: Visual representation of sales performance across different regions using Excel's Map charts.
- **Dynamic Filtering**: Slicers for exploring data by product, region, and date.

## Outcomes
- **Enhanced Decision-Making**: Empowered business stakeholders with timely and accurate sales insights.
- **Streamlined Reporting**: Automated data visualization reduced manual reporting efforts.
- **Improved Data Accuracy**: Preprocessed data ensured reliable results.

## Repository Structure
```plaintext
Awesome-Chocolates-Dashboard/
├── README.md
├── AwesomeChocolatesDashboard.xlsx
└── sales_data.xlsx
