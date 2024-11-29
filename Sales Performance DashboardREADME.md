# Sales Performance Dashboard

## Project Overview
An interactive Power BI dashboard with SQL integration for real-time sales tracking, providing insights into sales trends, top products, and regional performance.

## Technologies Used
- **Power BI Desktop** for data visualization and dashboard creation.
- **SQL Database (MySQL)** for real-time data integration using DirectQuery.
- **DAX** for calculated metrics and KPIs.
- **Power Query** for data cleaning and transformation.

## Setup Instructions
1. Run `sales_data.sql` in MySQL to create and populate the database.
2. Open `SalesPerformanceDashboard.pbix` in Power BI Desktop.
3. Connect to the SQL database (ensure the connection string matches your setup).
4. Publish to Power BI Service for scheduled refresh.

## Key Features
- **Real-Time Updates**: Enabled via DirectQuery for live data.
- **Forecasting & Trend Analysis**: Predictive insights into future sales.
- **Geospatial Insights**: Regional sales performance visualization.

## Outcomes
Enhanced data-driven decision-making through an intuitive, automated dashboard.
