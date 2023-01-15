package co.demoproject.Service;

import co.demoproject.Entity.request.PostCreateProductRequest;
import co.demoproject.Entity.request.PostUpdateProductRequest;
import co.demoproject.Entity.response.GetProductResponse;
import co.demoproject.Entity.response.PostCreateProductResponse;
import co.demoproject.Entity.response.PostUpdateProductResponse;

import java.util.List;

public interface ProductService {
    public GetProductResponse getProductById(String id);

    public List<GetProductResponse> getAllProduct();

    public PostCreateProductResponse createProduct(PostCreateProductRequest postCreateProductRequest);

    public PostUpdateProductResponse updateProduct(PostUpdateProductRequest postUpdateProductRequest);
}
