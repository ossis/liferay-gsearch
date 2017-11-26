
package fi.soveltia.liferay.gsearch.core.api.results.item;

import com.liferay.portal.kernel.search.Document;

import javax.portlet.PortletRequest;
import javax.portlet.PortletResponse;

/**
 * Asset type specific result item builder factory.
 * 
 * @author Petteri Karttunen
 */
public interface ResultItemBuilderFactory {

	/**
	 * Get result builder.
	 * 
	 * @param portletRequest
	 * @param portletResponse
	 * @param document search result document
	 * @param assetPublisherPageFriendlyURL
	 * @return ResultItemBuilder
	 */
	public ResultItemBuilder getResultBuilder(
		PortletRequest portletRequest,
		PortletResponse portletResponse, Document document, String assetPublisherPageFriendlyURL);
}
