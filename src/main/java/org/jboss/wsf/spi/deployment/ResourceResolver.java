/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2009, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.wsf.spi.deployment;

import java.io.IOException;
import java.net.URL;

/**
 * A resource resolver
 * 
 * @author alessio.soldano@jboss.com
 * @since 19-Nov-2009
 *  
 */
public interface ResourceResolver
{
   /**
    * Get the URL for a given resource path
    * 
    * @param resourcePath   resource path
    * @return  URL of resource
    * @throws IOException  IO exception
    */
   public URL resolve(String resourcePath) throws IOException;
   
   /**
    * Same as resolve(String resourcePath) except it does not throw exception
    * when resource is not found, simply returns null.
    * 
    * @param resourcePath   resource path
    * @return     URL of resource
    */
   public URL resolveFailSafe(String resourcePath);
   
}
