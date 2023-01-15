package co.demoproject.Service.impl;

import co.demoproject.Entity.model.ProductEntity;
import co.demoproject.Entity.request.PostCreateProductRequest;
import co.demoproject.Entity.request.PostUpdateProductRequest;
import co.demoproject.Entity.response.GetProductResponse;
import co.demoproject.Entity.response.PostCreateProductResponse;
import co.demoproject.Entity.response.PostUpdateProductResponse;
import co.demoproject.Repository.ProductRepository;
import co.demoproject.Service.ProductService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    ModelMapper mapper;

    public List<GetProductResponse> getAllProduct(){

        List<ProductEntity> listProduct= productRepository.findAll();

        List<GetProductResponse> response = listProduct
                .stream()
                .map(product -> mapper.map(product, GetProductResponse.class))
                .collect(Collectors.toList());



        return response;
    }

    public GetProductResponse getProductById(String id) {

        Optional<ProductEntity> product = productRepository.findById(Long.parseLong(id));
        if (product.isPresent()) {
            return mapper.map(product, GetProductResponse.class);
        }
        return null;
    }

    public PostCreateProductResponse createProduct(PostCreateProductRequest postCreateProductRequest){
        return null;
    }

    public PostUpdateProductResponse updateProduct(PostUpdateProductRequest postUpdateProductRequest){
        return null;
    }
}
