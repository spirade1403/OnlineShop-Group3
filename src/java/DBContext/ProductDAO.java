/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBContext;

import entity.Order;
import entity.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BEAN
 */
public class ProductDAO {

    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;
    private String query;

    public ArrayList<Product> getAllProduct() {
        ArrayList<Product> list = new ArrayList<>();
        try {

            query = "select p.ProductID , ProductName , Description , OriginalPrice , \n"
                    + "SellPrice  , SalePercent , SubCategoryID , SellerID , \n"
                    + "Amount , StatusID , StatusID ,BrandID , height  , width ,weight , s.ProductImgURL from  Product p \n"
                    + "join ProductImg s \n"
                    + "on p.ProductID = s.ProductID ";
            conn = new DBcontext().open();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(
                        rs.getInt("ProductID"),
                        rs.getString("ProductName"),
                        rs.getString("Description"),
                        rs.getDouble("OriginalPrice"),
                        rs.getDouble("SellPrice"),
                        rs.getDouble("SalePercent"),
                        rs.getInt("SubCategoryID"),
                        rs.getInt("SellerID"),
                        rs.getInt("Amount"),
                        rs.getInt("StatusID"),
                        rs.getInt("BrandID"),
                        rs.getDouble("height"),
                        rs.getDouble("width"),
                        rs.getDouble("weight"),
                        rs.getString("ProductImgURL")
                ));
            }
        } catch (SQLException e) {
        }

        return list;
    }

    public List<Product> getProductQuery(String Query, int subcategory, int brand, int price, int sortType, int sortMode) {
        ArrayList<Product> list = new ArrayList<>();
        try {
            int count = 1;
            query = " SELECT* FROM (SELECT p.ProductID,MIN(p.ProductName) AS ProductName,MIN(p.Description) AS Description,MIN(p.OriginalPrice) AS OriginalPrice,MIN(p.SellPrice) AS SellPrice,MIN(p.SalePercent) AS SalePercent,MIN(p.SubCategoryID) AS SubCategoryID,MIN(p.SellerID) AS SellerID,MIN(p.Amount) AS Amount,MIN(p.StatusID) AS StatusID,MIN(p.BrandID) AS BrandID,MIN(p.height) AS height,MIN(p.width) AS width,MIN(p.weight) AS weight,MIN(ProI.ProductImgURL) AS ProductImgURL FROM \n"
                    + " dbo.Product p \n"
                    + " JOIN \n"
                    + " dbo.ProductImg ProI \n"
                    + " ON ProI.ProductID = p.ProductID "
                    + " WHERE p.ProductName LIKE ? AND p.StatusID!= 2 AND p.Amount>0 ";
            if (subcategory != 0) {
                query += " AND SubCategoryID = ? ";
            }
            if (brand != 0) {
                query += " AND BrandID = ? ";
            }
            switch (price) {
                case 0:
                    break;
                case 1:
                    query += " AND p.SellPrice<100000 ";
                    break;
                case 2:
                    query += " AND p.SellPrice>=100000 AND p.SellPrice<500000 ";
                    break;
                case 3:
                    query += " AND p.SellPrice>=500000 AND p.SellPrice<1000000 ";
                    break;
                case 4:
                    query += " AND p.SellPrice>=1000000 AND p.SellPrice<5000000 ";
                    break;
                case 5:
                    query += " AND p.SellPrice>=5000000 ";
                    break;
            }
            query += " GROUP BY p.ProductID ) t";
            switch (sortType) {
                case 0:
                    break;
                case 1:
                    query += " ORDER BY t.SellPrice ";
                    break;
                case 2:
                    query += " ORDER BY t.SalePercent ";
                    break;
                case 3:
                    query += " ORDER BY t.ProductName ";
                    break;
            }
            if (sortType != 0) {
                if (sortMode == 1) {
                    query += " ASC ";
                }
                if (sortMode == 2) {
                    query += " DESC ";
                }
            }
            conn = new DBcontext().open();
            ps = conn.prepareStatement(query);
            ps.setNString(count++, "%" + Query + "%");
            if (subcategory != 0) {
                ps.setInt(count++, subcategory);
            }
            if (brand != 0) {
                ps.setInt(count++, brand);
            }
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(
                        rs.getInt("ProductID"),
                        rs.getString("ProductName"),
                        rs.getString("Description"),
                        rs.getDouble("OriginalPrice"),
                        rs.getDouble("SellPrice"),
                        rs.getDouble("SalePercent"),
                        rs.getInt("SubCategoryID"),
                        rs.getInt("SellerID"),
                        rs.getInt("Amount"),
                        rs.getInt("StatusID"),
                        rs.getInt("BrandID"),
                        rs.getDouble("height"),
                        rs.getDouble("width"),
                        rs.getDouble("weight"),
                        rs.getString("ProductImgURL")
                ));
            }
        } catch (SQLException e) {
        }
        DBcontext.close(conn, ps, rs);
        return list;
    }

    public ArrayList<Product> getProductBySellerName(String username) {
        ArrayList<Product> list = new ArrayList<>();
        try {

            query = "select p.ProductID , ProductName , Description , OriginalPrice , \n"
                    + "SellPrice  , SalePercent , SubCategoryID , SellerID , \n"
                    + "Amount , StatusID , StatusID ,BrandID , height  , width ,weight , s.ProductImgURL from  Product p \n"
                    + "join ProductImg s \n"
                    + "on p.ProductID = s.ProductID where p.SellerID = (select UserID from Users where Username =  ? ) ";
            conn = new DBcontext().open();
            ps = conn.prepareStatement(query);
            ps.setString(1, username);
            rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Product(
                        rs.getInt("ProductID"),
                        rs.getString("ProductName"),
                        rs.getString("Description"),
                        rs.getDouble("OriginalPrice"),
                        rs.getDouble("SellPrice"),
                        rs.getDouble("SalePercent"),
                        rs.getInt("SubCategoryID"),
                        rs.getInt("SellerID"),
                        rs.getInt("Amount"),
                        rs.getInt("StatusID"),
                        rs.getInt("BrandID"),
                        rs.getDouble("height"),
                        rs.getDouble("width"),
                        rs.getDouble("weight"),
                        rs.getString("ProductImgURL")
                ));
            }
        } catch (SQLException e) {
        }

        return list;
    }

    public int getTotalProduct() {
        String query = "select count (*)from Product";
        int total = 0;
        try {
            conn = new DBcontext().open();
            ps = conn.prepareStatement(query);

            rs = ps.executeQuery();
            while (rs.next()) {
                return total = rs.getInt(1);
            }
        } catch (Exception e) {
        }
        return 0;
    }

    public void deleteProduct(String pid) {
        String query = "delete from ProductImg where ProductID = ? "
                + "delete from Product where ProductID = ?";

        try {
            conn = new DBcontext().open();
            ps = conn.prepareStatement(query);
            ps.setString(1, pid);
            ps.setString(2, pid);
            ps.executeUpdate();

        } catch (Exception e) {
        }
    }

    public Product getProductByID(String productId) {
        String query = "select top 1 p.ProductID , ProductName , Description , OriginalPrice , SellPrice  , SalePercent , SubCategoryID , SellerID ,\n"
                + "                    Amount , StatusID , StatusID ,BrandID , height  , width ,weight , s.ProductImgURL from  Product p \n"
                + "                   join ProductImg s on p.ProductID = s.ProductID where p.ProductID = ?";
        try {
            conn = new DBcontext().open();
            ps = conn.prepareStatement(query);
            ps.setString(1, productId);
            rs = ps.executeQuery();
            while (rs.next()) {
                return (new Product(
                        rs.getInt("ProductID"),
                        rs.getString("ProductName"),
                        rs.getString("Description"),
                        rs.getDouble("OriginalPrice"),
                        rs.getDouble("SellPrice"),
                        rs.getDouble("SalePercent"),
                        rs.getInt("SubCategoryID"),
                        rs.getInt("SellerID"),
                        rs.getInt("Amount"),
                        rs.getInt("StatusID"),
                        rs.getInt("BrandID"),
                        rs.getDouble("height"),
                        rs.getDouble("width"),
                        rs.getDouble("weight"),
                        rs.getString("ProductImgURL")));
            }
        } catch (SQLException e) {
        }
        DBcontext.close(conn, ps, rs);
        return null;
    }

    public List<Product> getProductByListOd(ArrayList<Product>listProduct ,ArrayList<Order> listOrder ) {
        List<Product> list = new ArrayList<>();
        for (Product p : listProduct) {
            for (Order  o : listOrder) {
                if(p.getProductID() == o.getProductID()){
                    list.add(p);
                }
            }
        }
        return list;
    }
}
