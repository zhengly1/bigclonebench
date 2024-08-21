public class BigbenchClone{    
    private void _writeIEscrollScript(FacesContext context, RenderingContext arc, String tableId, String scrollID) throws IOException {
        ResponseWriter writer = context.getResponseWriter();
        boolean previouslyNotRendered = (arc.getProperties().put(_IE_SCROLL_KEY, Boolean.TRUE) == null);
        if (previouslyNotRendered) {
            writer.write("function _uixIEmaskFrame(){};" + "_uixIEmaskFrame.addElement = function(elementId,tableId)" + "{" + "if (_uixIEmaskFrame.elements == null)" + "{" + "_uixIEmaskFrame.elements = new Array();" + "}" + "_uixIEmaskFrame.elements.push(elementId);" + "_uixIEmaskFrame.elements.push(tableId);" + "};" + "_uixIEmaskFrame.createFrames = function()" + "{" + "if (_uixIEmaskFrame.frames == null)" + "{" + "_uixIEmaskFrame.frames = new Object();" + "}" + "var elements = _uixIEmaskFrame.elements;" + "for(var i=0; i<elements.length; i+=2)" + "{" + "var elementId  = elements[i];" + "var tableId  = elements[i+1];" + "var element  = document.getElementById(elementId);" + "var maskFrame = element.ownerDocument.createElement('iframe');" + "maskFrame.frameBorder = 'none';" + "maskFrame.scrolling = 'no';" + "maskFrame.title = '';" + "var maskFrameStyle = maskFrame.style;" + "maskFrameStyle.borderStyle = 'none';" + "maskFrameStyle.top = element.offsetTop;" + "maskFrameStyle.posLeft = element.offsetLeft;" + "maskFrameStyle.width = element.offsetWidth;" + "maskFrameStyle.height = element.offsetHeight + 'px';" + "maskFrameStyle.position = 'absolute';" + "maskFrameStyle.zIndex = '1';" + "var tableDiv = document.getElementById(tableId);" + "tableDiv.appendChild(maskFrame);" + "_uixIEmaskFrame.frames[elementId] = maskFrame;" + "var subtr = element.parentNode.childNodes[0];" + "var subtrStyle = subtr.style;" + "subtrStyle.width = element.offsetWidth + 16;" + "subtrStyle.height = element.offsetHeight;" + "var elementStyle = element.style;" + "elementStyle.position = 'absolute';" + "elementStyle.top = maskFrame.offsetTop;" + "elementStyle.posLeft = maskFrame.offsetLeft;" + "}" + "_uixIEmaskFrame.elements = null;" + "};" + "_uixIEmaskFrame.tickle = function(elementId)" + "{" + "var maskFrame = _uixIEmaskFrame.frames[elementId];" + "var maskFrameStyle = maskFrame.style;" + "maskFrameStyle.visibility = 'hidden';" + "maskFrameStyle.visibility = 'visible';" + "return false;" + "};");
        }
        writer.write("_uixIEmaskFrame.addElement('" + scrollID + "','" + tableId + "');");
        writer.write("if (document.readyState == 'complete')" + "{" + "_uixIEmaskFrame.createFrames();" + "}");
        if (previouslyNotRendered) {
            writer.write("if (_uixIEmaskFrame.attached == null)" + "{" + "_uixIEmaskFrame.attached = true;" + "window.attachEvent('onload', _uixIEmaskFrame.createFrames);" + "}");
        }
    }
}