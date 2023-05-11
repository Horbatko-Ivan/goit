package org.itstep.module13.hw1;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.*;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.NoSuchElementException;

public class CRUDSender {

  JSONObject userData = new JSONObject(new User());

  public String getUsers() {
    try (CloseableHttpClient httpClient = HttpClientBuilder.create().build()) {
      HttpGet httpGet = new HttpGet("https://jsonplaceholder.typicode.com/users");
      CloseableHttpResponse response = httpClient.execute(httpGet);
      return EntityUtils.toString(response.getEntity());

    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
    throw new NoSuchElementException();
  }

  public String createUser() {
    try (CloseableHttpClient httpClient = HttpClientBuilder.create().build()) {
      HttpPost httpPost = new HttpPost("https://jsonplaceholder.typicode.com/users");
      httpPost.setEntity(new StringEntity(userData.toString()));
      httpPost.setHeader("Accept", "application/json");
      httpPost.setHeader("Content-type", "application/json");
      CloseableHttpResponse response = httpClient.execute(httpPost);
      System.out.println("CreateResponse.statusCode() = " + response.getStatusLine().getStatusCode());
      return EntityUtils.toString(response.getEntity());
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
    throw new NoSuchElementException();
  }

  public String updateUser(int userId) {
    try (CloseableHttpClient httpClient = HttpClientBuilder.create().build()) {
      HttpPut httpPut = new HttpPut("https://jsonplaceholder.typicode.com/users/" + userId);
      httpPut.setEntity(new StringEntity(userData.toString()));
      CloseableHttpResponse response = httpClient.execute(httpPut);
      System.out.println("UpdateResponse.statusCode() = " + response.getStatusLine().getStatusCode());
      return EntityUtils.toString(response.getEntity());
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
    throw new NoSuchElementException();
  }

  public boolean deleteUser(int userId) {
    try (CloseableHttpClient httpClient = HttpClientBuilder.create().build()) {
      HttpDelete httpDelete = new HttpDelete("https://jsonplaceholder.typicode.com/users/" + userId);
      CloseableHttpResponse response = httpClient.execute(httpDelete);
      int statusCode = response.getStatusLine().getStatusCode();
      if (statusCode == 200) {
        return true;
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
    return false;
  }

  public String getUserById(int userId) {
    try (CloseableHttpClient httpClient = HttpClientBuilder.create().build()) {
      HttpGet httpGet = new HttpGet("https://jsonplaceholder.typicode.com/users/" + userId);
      CloseableHttpResponse response = httpClient.execute(httpGet);
      String string = EntityUtils.toString(response.getEntity());
      if (string.contains(String.valueOf(userId))) {
        return string;
      }
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
    throw new NoSuchElementException();
  }

  public String getUserByUsername(String userName) {
    try (CloseableHttpClient httpClient = HttpClientBuilder.create().build()) {
      HttpGet httpGet = new HttpGet("https://jsonplaceholder.typicode.com/users/");
      String parameterToSearch = "username";
      URI uri = new URIBuilder(httpGet.getURI())
        .addParameter(parameterToSearch, userName)
        .build();
      httpGet.setURI(uri);
      CloseableHttpResponse response = httpClient.execute(httpGet);
      String string = EntityUtils.toString(response.getEntity());
      if (string.contains(userName)) {
        return string;
      }
    } catch (IOException | URISyntaxException e) {
      System.out.println(e.getMessage());
    }
    throw new NoSuchElementException();
  }

  private int getLastUserComment(int userId) {
    try (CloseableHttpClient httpClient = HttpClientBuilder.create().build()) {
      HttpGet httpGet = new HttpGet("https://jsonplaceholder.typicode.com/users/" + userId + "/posts");
      CloseableHttpResponse response = httpClient.execute(httpGet);
      HttpEntity entity = response.getEntity();
      String responseString = EntityUtils.toString(entity, "UTF-8");
      Type typeToken = TypeToken.getParameterized(List.class, UserPost.class).getType();
      List<UserPost> postsFromJson = new Gson().fromJson(responseString, typeToken);

      int maxPostId = 0;
      for (UserPost post : postsFromJson) {
        if (post.getId() >= maxPostId) {
          maxPostId = post.getId();
        }
      }
      return maxPostId;
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
    throw new NoSuchElementException();
  }

  public boolean getLastCommentsAndWriteToFile(int userId) {
    try (CloseableHttpClient httpClient = HttpClientBuilder.create().build()) {
      String idOfLastUserComment = String.valueOf(getLastUserComment(userId));
      HttpGet httpGet = new HttpGet("https://jsonplaceholder.typicode.com/posts/" + idOfLastUserComment + "/comments");
      URI uri = new URIBuilder(httpGet.getURI())
        .build();
      httpGet.setURI(uri);
      String path = System.getProperty("user.dir") + "/src/main/java/org/itstep/module13/hw1/files";
      File file = new File(String.format(path + "/users-%s-post-%s-comment.json", userId, idOfLastUserComment));
      CloseableHttpResponse response = httpClient.execute(httpGet);
      try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
        String string = EntityUtils.toString(response.getEntity());
        writer.write(string);
        if (file.exists()) {
          return true;
        }
      }
    } catch (IOException | URISyntaxException e) {
      System.out.println(e.getMessage());
    }
    return false;
  }

  public void getIncompleteTasks(int userId) {
    try (CloseableHttpClient httpClient = HttpClientBuilder.create().build()) {
      HttpGet httpGet = new HttpGet("https://jsonplaceholder.typicode.com/users/" + userId + "/todos/");
      String parameterToSearch = "completed";
      String parameterValue = "false";
      URI uri = new URIBuilder(httpGet.getURI())
        .addParameter(parameterToSearch, parameterValue)
        .build();
      httpGet.setURI(uri);
      CloseableHttpResponse response = httpClient.execute(httpGet);
      String responseString = EntityUtils.toString(response.getEntity());
      System.out.println(responseString);
    } catch (IOException | URISyntaxException e) {
      System.out.println(e.getMessage());
    }
  }
}
