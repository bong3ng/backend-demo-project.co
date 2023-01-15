package co.demoproject.Controller;

import co.demoproject.Entity.request.PostCreateProductRequest;
import co.demoproject.Entity.request.PostUpdateProductRequest;
import co.demoproject.Entity.response.GetProductResponse;
import co.demoproject.Entity.response.PostCreateProductResponse;
import co.demoproject.Entity.response.PostUpdateProductResponse;
import co.demoproject.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {
    @Autowired
    ProductService productService;


    @GetMapping("/all")
    public List<GetProductResponse> getAllProduct() {
        return productService.getAllProduct();
    }

    @GetMapping("/{id}")
    public GetProductResponse getProductById(@PathVariable("id") String id) {
        return productService.getProductById(id);
    }



	@PostMapping("/")
	public PostCreateProductResponse postCreateProduct(@RequestBody PostCreateProductRequest request) {
		return productService.createProduct(request);
	}

	@PostMapping("/update")
	public PostUpdateProductResponse postUpdateProductRequest(@RequestBody PostUpdateProductRequest request){
		return productService.updateProduct(request);
	}
}
