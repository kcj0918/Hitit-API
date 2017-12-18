package me.hitit.api.utils.amazon.s3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class S3Object {
	private Image originalImage;
	private Image thumbnailImage;
}
