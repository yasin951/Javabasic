<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Doctor Details</title>
    <!-- Bootstrap 5 CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-8 col-lg-6">
            <div class="card shadow">
                <div class="card-header bg-primary text-white text-center">
                    <h4 class="mb-0">Doctor Registration Form</h4>
                </div>
                <div class="card-body p-4">
                    <form action="saveDoctor" method="post" novalidate>
                        <div class="row">
                            <!-- First Name -->
                            <div class="col-md-6 mb-3">
                                <label for="firstName" class="form-label">First Name <span class="text-danger">*</span></label>
                                <input type="text" class="form-control" id="firstName" name="firstName" 
                                       placeholder="Enter first name" required>
                                <div class="invalid-feedback">
                                    Please enter doctor's first name.
                                </div>
                            </div>

                            <!-- Last Name -->
                            <div class="col-md-6 mb-3">
                                <label for="lastName" class="form-label">Last Name <span class="text-danger">*</span></label>
                                <input type="text" class="form-control" id="lastName" name="lastName" 
                                       placeholder="Enter last name" required>
                                <div class="invalid-feedback">
                                    Please enter doctor's last name.
                                </div>
                            </div>
                        </div>

                        <!-- Mobile Number -->
                        <div class="mb-3">
                            <label for="mobileNo" class="form-label">Mobile Number <span class="text-danger">*</span></label>
                            <input type="text" class="form-control" id="mobileNo" name="mobileNo" 
                                   placeholder="Enter 10-digit mobile number" 
                                   pattern="[0-9]{10}" maxlength="10" required>
                            <div class="invalid-feedback">
                                Please enter a valid 10-digit mobile number.
                            </div>
                        </div>

                        <!-- Email ID -->
                        <div class="mb-3">
                            <label for="email" class="form-label">Email ID <span class="text-danger">*</span></label>
                            <input type="email" class="form-control" id="email" name="email" 
                                   placeholder="doctor@example.com" required>
                            <div class="invalid-feedback">
                                Please enter a valid email address.
                            </div>
                        </div>

                        <!-- Qualification -->
                        <div class="mb-4">
                            <label for="qualification" class="form-label">Qualification <span class="text-danger">*</span></label>
                            <input type="text" class="form-control" id="qualification" name="qualification" 
                                   placeholder="e.g., MBBS, MD Medicine, MS Surgery" required>
                            <div class="invalid-feedback">
                                Please enter doctor's qualification.
                            </div>
                        </div>

                        <!-- Submit Button -->
                        <div class="d-grid gap-2 d-md-flex justify-content-md-end">
                            <button type="reset" class="btn btn-secondary me-md-2">Clear</button>
                            <button type="submit" class="btn btn-primary">Save Doctor</button>
                             <button type="button" class="btn btn-secondary me-md-2">DELETE</button>
                        </div>
                        
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- Bootstrap 5 JS + Form Validation Script -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<script>
    // Enable Bootstrap client-side validation
    (function () {
        'use strict'
        var forms = document.querySelectorAll('form')
        Array.prototype.slice.call(forms).forEach(function (form) {
            form.addEventListener('submit', function (event) {
                if (!form.checkValidity()) {
                    event.preventDefault()
                    event.stopPropagation()
                }
                form.classList.add('was-validated')
            }, false)
        })
    })()
</script>

</body>
</html>