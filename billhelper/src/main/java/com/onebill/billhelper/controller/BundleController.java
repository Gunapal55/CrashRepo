package com.onebill.billhelper.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.onebill.billhelper.dto.AddtionalChargesDto;
import com.onebill.billhelper.dto.BundleDetailsDto;
import com.onebill.billhelper.dto.BundleDto;
import com.onebill.billhelper.dto.OverDueDto;
import com.onebill.billhelper.dto.ResponseDto;
import com.onebill.billhelper.service.BundleService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/product/bundle")
public class BundleController {

	@Autowired
	private BundleService service;

	@ResponseBody
	@PostMapping
	public ResponseDto createBundle(@RequestBody BundleDto bundle) {
		ResponseDto response = new ResponseDto();
		response.setData(service.createBundle(bundle));
		return response;
	}

	@PutMapping
	public ResponseDto updateBundle(@RequestBody BundleDto bundle) {
		ResponseDto response = new ResponseDto();
		response.setData(service.updateBundle(bundle));
		return response;
	}

	@DeleteMapping
	public ResponseDto removeBundle(@RequestBody BundleDto bundle) {
		ResponseDto response = new ResponseDto();
		response.setData(service.removeBundle(bundle));
		return response;

	}

	@GetMapping("/bundles")
	public ResponseDto getAllBundles() {
		ResponseDto response = new ResponseDto();
		response.setData(service.getAllBundle());
		return response;

	}

	@GetMapping("/{bundleId}")
	public ResponseDto getProductById(@PathVariable int bundleId) {
		ResponseDto response = new ResponseDto();
		response.setData(service.getBundleById(bundleId));
		return response;
	}

	@ResponseBody
	@PostMapping("/detail")
	public ResponseDto addtBundleDetails(@RequestBody BundleDetailsDto bundleDetail) {
		ResponseDto response = new ResponseDto();
		response.setData(service.addBundleDetails(bundleDetail));
		return response;
	}

	@PutMapping("/detail")
	public ResponseDto updateBundleDetails(@RequestBody BundleDetailsDto bundleDetail) {
		ResponseDto response = new ResponseDto();
		response.setData(service.updateBundleDetails(bundleDetail));
		return response;
	}

	@DeleteMapping("/detail")
	public ResponseDto removeBundleDetails(@RequestBody BundleDetailsDto bundleDetail) {
		ResponseDto response = new ResponseDto();
		response.setData(service.removeDetails(bundleDetail));
		return response;

	}

	@GetMapping("/details")
	public ResponseDto getAllBundleDetail() {
		ResponseDto response = new ResponseDto();
		response.setData(service.getAllBundleDetails());
		return response;

	}

	@GetMapping("/details/{bundleDetailId}")
	public ResponseDto getBundleDetailById(@PathVariable int bundleDetailId) {
		ResponseDto response = new ResponseDto();
		response.setData(service.getBundleDetailById(bundleDetailId));
		return response;
	}

	@PostMapping("/due")
	public ResponseDto addOverDue(@RequestBody OverDueDto overDue) {
		ResponseDto response = new ResponseDto();
		response.setData(service.addOverDue(overDue));
		return response;
	}

	@PutMapping("/due")
	public ResponseDto updateOverDue(@RequestBody OverDueDto overDue) {
		ResponseDto response = new ResponseDto();
		response.setData(service.updateOverDue(overDue));
		return response;
	}

	@DeleteMapping("/due")
	public ResponseDto removeOverDue(@RequestBody OverDueDto overDue) {
		ResponseDto response = new ResponseDto();
		response.setData(service.deleteOverDue(overDue));
		return response;

	}

	@GetMapping("/due/{overDueId}")
	public ResponseDto getOverDueById(@PathVariable int overDueId) {
		ResponseDto response = new ResponseDto();
		response.setData(service.getOverDueById(overDueId));
		return response;
	}

	@PostMapping("/addtional")
	public ResponseDto addAddtionalCharge(@RequestBody AddtionalChargesDto addtional) {
		ResponseDto response = new ResponseDto();
		response.setData(service.addAddtionalCharges(addtional));
		return response;
	}

	@PutMapping("/addtional")
	public ResponseDto updateAddtionalCharges(@RequestBody AddtionalChargesDto addtional) {
		ResponseDto response = new ResponseDto();
		response.setData(service.addAddtionalCharges(addtional));
		return response;
	}

	@DeleteMapping("/addtional")
	public ResponseDto removeAddtionalCharges(@RequestBody AddtionalChargesDto addtional) {
		ResponseDto response = new ResponseDto();
		response.setData(service.deleteAddtionalCharges(addtional));
		return response;

	}

	@GetMapping("/addtional/{addtionalId}")
	public ResponseDto getAddtionalChargesById(@PathVariable int addtionalId) {
		ResponseDto response = new ResponseDto();
		response.setData(service.getAddtionalChargesById(addtionalId));
		return response;
	}
}
