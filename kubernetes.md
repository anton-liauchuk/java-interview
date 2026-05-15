# Kubernetes
- [What are the possible types of deployment? Provide a short description for each type.](#what-are-the-possible-types-of-deployment-provide-a-short-description-for-each-type)

## What are the possible types of deployment? Provide a short description for each type.
- Big Bang / Recreate – Old version down, new up → downtime.
- Rolling – Gradual replacement of instances → zero downtime, needs backward compatibility.
- Blue/Green – Two identical environments; switch traffic instantly → fast rollback, double cost.
- Canary – Roll out to a small user subset first → limits blast radius, needs monitoring.
- A/B Testing – Different versions to different user groups → for business experiments.
- Shadow – New version processes live traffic without affecting response → risk‑free load testing.###### Relative links:
###### Relative links:
- https://devtron.ai/blog/top-6-kubernetes-deployment-strategies/

[Home Page](README.md)
