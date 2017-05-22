# Terraform

[Terraform](https://www.terraform.io/) is a tool for configuring platforms, 
and installing dependencies.

Will be reading up on [this blog post](https://blog.gruntwork.io/why-we-use-terraform-and-not-chef-puppet-ansible-saltstack-or-cloudformation-7989dad2865c)



```bash
# Install aws credentials
export AWS_ACCESS_KEY_ID=ACESS_KEY
export AWS_SECRET_ACCESS_KEY=SECRET_ACCESS_KEY

# Verify setup
terraform plan

# Perform installation
terraform apply
```