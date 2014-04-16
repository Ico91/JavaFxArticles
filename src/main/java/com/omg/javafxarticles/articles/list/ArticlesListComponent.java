/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.omg.javafxarticles.articles.list;

import com.omg.javafxarticles.articles.Component;
import com.omg.javafxarticles.model.Article;
import java.util.Calendar;
import java.util.Date;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;

/**
 *
 * @author default
 */
public class ArticlesListComponent extends Component {

    private static final String RESOURCE_URL = "/fxml/articles/list/ArticlesList.fxml";

    @FXML
    private TableColumn<Article, Button> deleteCol;
    @FXML
    private TableColumn<Article, String> titleCol;
    @FXML
    private TableColumn<Article, Date> dateCol;
    @FXML
    private TableView<Article> articlesTable;

    private ObservableList<Article> articles = FXCollections.observableArrayList();

    public ArticlesListComponent() {
        super(RESOURCE_URL);

        init();

        deleteCol.setCellFactory(new Callback<TableColumn<Article, Button>, TableCell<Article, Button>>() {

            @Override
            public TableCell<Article, Button> call(TableColumn<Article, Button> param) {
                TableCell<Article, Button> cell = new TableCell<Article, Button>() {
                    @Override
                    public void updateItem(Button item, boolean empty) {
                        super.updateItem(item, empty);
                        System.out.println(empty);
                        Button btnDelete = new Button("X");
                        btnDelete.setOnAction(new EventHandler<ActionEvent>() {

                            @Override
                            public void handle(ActionEvent event) {
                                int index = getTableRow().getIndex();
                                articles.remove(index);
                                System.out.println("Article deleted");

                            }
                        });

                        if (!empty) {
                            setGraphic(btnDelete);
                        } else {
                            setGraphic(null);
                        }
                    }
                };

                return cell;
            }

        });

    }

    private void init() {
        ObservableList<String> titles = FXCollections.observableArrayList("Title 1", "Title 2", "Title 3");

        ObservableList<Date> dates = FXCollections.observableArrayList(Calendar.getInstance().getTime(), Calendar.getInstance().getTime(), Calendar.getInstance().getTime());

        titleCol.setCellValueFactory(new PropertyValueFactory("title"));
        dateCol.setCellValueFactory(new PropertyValueFactory("date"));

        for (int i = 0; i < titles.size(); i++) {
            articles.add(new Article(titles.get(i), "content", dates.get(i)));
        }

        articlesTable.setItems(articles);
    }

}
