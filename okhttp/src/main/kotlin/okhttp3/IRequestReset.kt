package okhttp3

interface IRequestHeadersSetter {
  fun setHeaders(request: Request) : Request
}